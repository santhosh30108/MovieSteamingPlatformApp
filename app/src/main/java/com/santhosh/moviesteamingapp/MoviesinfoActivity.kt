package com.santhosh.moviesteamingapp

import android.app.ProgressDialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.google.android.material.tabs.TabLayout
import com.santhosh.moviesteamingapp.adapters.fragmentsAdapter
import com.santhosh.moviesteamingapp.model.CastPageModel

class MoviesinfoActivity : AppCompatActivity() {

    lateinit var movieImage:ImageView
    lateinit var tablayout : TabLayout
    lateinit var viewPager: ViewPager
    lateinit var movieName:TextView
    lateinit var genre:TextView
    lateinit var runtime:TextView
    lateinit var year:TextView
    lateinit var adapter:fragmentsAdapter
    lateinit var videoView: VideoView
    var castList = ArrayList<CastPageModel>()

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

        val description = intent.getStringExtra("description")
        castList = intent.getSerializableExtra("castList") as ArrayList<CastPageModel>
        tablayout.setupWithViewPager(viewPager)
        adapter = fragmentsAdapter(supportFragmentManager,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        description?.let { DescriptionFragment(it) }?.let { adapter.addFragment(it,"STORYLINE") }
        adapter.addFragment(CastFragment(castList),"CAST")
        adapter.addFragment(TrailerFragment(),"TRAILERS")
        adapter.addFragment(ImagesFragment(),"IMAGES")
        viewPager.adapter = adapter


        Glide.with(this@MoviesinfoActivity)
            .load(intent.getStringExtra("image"))
            .override(1200, 700)
            .centerCrop()
            .into(movieImage);
        movieName.text = intent.getStringExtra("name")
        genre.text = intent.getStringExtra("genre")
        year.text = intent.getStringExtra("year")
        runtime.text = intent.getStringExtra("runtime")


    }



}