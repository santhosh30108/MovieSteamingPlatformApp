package com.santhosh.moviesteamingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TextView
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.Model
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.santhosh.moviesteamingapp.adapters.fragmentsAdapter
import com.santhosh.moviesteamingapp.model.HomeModelClass

class MoviesinfoActivity : AppCompatActivity() {

    lateinit var movieImage:ImageView
    lateinit var tablayout : TabLayout
    lateinit var viewPager: ViewPager
    lateinit var movieName:TextView
    lateinit var genre:TextView
    lateinit var runtime:TextView
    lateinit var year:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moviesinfo)

        movieImage = findViewById(R.id.movieImageActivity2)
        tablayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        movieName = findViewById(R.id.movieNameActivity2)
        genre = findViewById(R.id.genreActivity2)
        runtime = findViewById(R.id.runtimeActivity2)
        year = findViewById(R.id.yearActivity2)

        tablayout.setupWithViewPager(viewPager)
        val adapter = fragmentsAdapter(supportFragmentManager,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        adapter.addFragment(DescriptionFragment(),"DESCRIPTION")
        adapter.addFragment(CastFragment(),"CAST")
        adapter.addFragment(TrailerFragment(),"TRAILERS")
        adapter.addFragment(ImagesFragment(),"IMAGES")
        viewPager.adapter = adapter






        Glide.with(this@MoviesinfoActivity)
            .load(intent.getStringExtra("image"))
            .override(1200, 500)
            .centerCrop()
            .into(movieImage);
        movieName.text = intent.getStringExtra("name")
        genre.text = intent.getStringExtra("genre")
        year.text = intent.getStringExtra("year")
        runtime.text = intent.getStringExtra("runtime")

    }

}