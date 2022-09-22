package com.santhosh.moviesteamingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.santhosh.moviesteamingapp.adapters.homeadapter
import com.santhosh.moviesteamingapp.api.HomePageApi
import com.santhosh.moviesteamingapp.model.HomeModelClass
import com.santhosh.moviesteamingapp.model.HomePageModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
//    lateinit var language : TextView
//    lateinit var timeleft : TextView
//    lateinit var image : ImageView
//    lateinit var movieName : TextView
//    lateinit var episodeDetails : TextView
    lateinit var cardView:CardView
    lateinit var recyclerView: RecyclerView

    var listItems = ArrayList<HomeModelClass>()
    val baseUrl = "https://thetvdb.github.io/v4-api/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
//        language = findViewById(R.id.languagehome)
//        timeleft = findViewById(R.id.hometimeleft)
//        image = findViewById(R.id.imageView)
//        movieName = findViewById(R.id.movieNameHome)
//        episodeDetails = findViewById(R.id.episodeinfohome)

        listItems.add(HomeModelClass("En/US","2h 29m","https://images.hindustantimes.com/rf/image_size_630x354/HT/p2/2018/11/10/Pictures/_fea09362-e4d7-11e8-a684-a3b63261dee4.JPG","Avengers Infinity War","2018","Action/Sci-fi"))
        listItems.add(HomeModelClass("En/US","1h 56m","https://m.media-amazon.com/images/M/MV5BYWRhZjUyZTktZjcyMi00MjRhLWI0ZjQtNjkxYjlmYjg4N2M0XkEyXkFqcGdeQXZ3ZXNsZXk@._V1_QL75_UX500_CR0,0,500,281_.jpg","Wanda Vision","2021","Sitcom"))
        listItems.add(HomeModelClass("En/US","1h 55m","https://i.annihil.us/u/prod/marvel/i/mg/9/f0/57fe4ef408a29/standard_incredible.jpg","Doctor Strange","2016","Action/Adventure"))
        listItems.add(HomeModelClass("En/US","2h 43m","https://ychef.files.bbci.co.uk/976x549/p03dq1gg.jpg","Sherlock Holmes","2019","Crime"))
        listItems.add(HomeModelClass("En/US","2h 37m","https://images.hindustantimes.com/img/2022/02/04/1600x900/No_Way_Home_spidey_1643979273654_1643979290388.webp","Spider-Man: No Way Home","2021","Action/Adventure"))


        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = homeadapter(listItems,this@MainActivity)
        recyclerView.adapter  = adapter


//        showMovies()


    }

//    fun showMovies(){
//        val retrofit = Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
//        val homepageApi:HomePageApi = retrofit.create(HomePageApi::class.java)
//
//        val call : Call<List<HomePageModel>> = homepageApi.getAllMovies()
//
//        call.enqueue(object : Callback<List<HomePageModel>>{
//            override fun onResponse(
//                call: Call<List<HomePageModel>>,
//                response: Response<List<HomePageModel>>
//            ) {
//                if(response.isSuccessful){
//                    val movieList = response.body() as ArrayList<HomePageModel>
//                    val adapter = homeadapter(movieList,this@MainActivity)
//                    recyclerView.adapter  = adapter
//
//
//                }
//            }
//
//            override fun onFailure(call: Call<List<HomePageModel>>, t: Throwable) {
//                Toast.makeText(this@MainActivity,t.localizedMessage,Toast.LENGTH_SHORT).show()
//            }
//
//        })
//    }
}