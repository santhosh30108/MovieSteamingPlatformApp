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
    var description = hashMapOf<String,String>()

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

        description.put("Avengers Infinity War","As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.—Marvel Studios")
        description.put("Wanda Vision","The events of WandaVision come to a head, and the destinies of all who took part are determined. Wanda faces a final showdown against the person who has infiltrated her creation, while Monica and Jimmy fight to protect her as the series closes and Wanda's illusions begin to unravel.—voiceontheleft")
        description.put("Doctor Strange","Marvel's \"Doctor Strange\" follows the story of the talented neurosurgeon Doctor Stephen Strange who, after a tragic car accident, must put ego aside and learn the secrets of a hidden world of mysticism and alternate dimensions. Based in New York City's Greenwich Village, Doctor Strange must act as an intermediary between the real world and what lies beyond, utilising a vast array of metaphysical abilities and artifacts to protect the Marvel Cinematic Universe.—Marvel")
        description.put("Sherlock Holmes","In this modernized version of the Conan Doyle characters, using his detective plots, Sherlock Holmes lives in early-21st-century London and acts more cocky towards Scotland Yard's detective inspector Lestrade because he's actually less confident. Doctor Watson is now a fairly young veteran of the Afghan war, less adoring and more active.—KGF Vissers")
        description.put("Spider-Man: No Way Home","Peter Parker's secret identity is revealed to the entire world. Desperate for help, Peter turns to Doctor Strange to make the world forget that he is Spider-Man. The spell goes horribly wrong and shatters the multiverse, bringing in monstrous villains that could destroy the world.")

        listItems.add(HomeModelClass("En/US","2h 29m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/mDfJG3LC3Dqb67AZ52x3Z0jU0uB.jpg","Avengers Infinity War","2018","Action/Sci-fi", description["Avengers Infinity War"]!!))
        listItems.add(HomeModelClass("Te/IN","3h 2m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/i0Y0wP8H6SRgjr6QmuwbtQbS24D.jpg","RRR","2022","Action/Drama", description["Wanda Vision"]!!))
        listItems.add(HomeModelClass("En/US","1h 55m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/qUv51IFUvVRAP2379ThmA3eLJx6.jpg","Doctor Strange","2016","Action/Adventure", description["Doctor Strange"]!!))
        listItems.add(HomeModelClass("En/US","2h 09m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/veXdzn7LL0bFIDGmE7tTkvRg0qV.jpg","Sherlock Holmes","2009","Crime", description["Sherlock Holmes"]!!))
        listItems.add(HomeModelClass("En/US","2h 37m","https://images.hindustantimes.com/img/2022/02/04/1600x900/No_Way_Home_spidey_1643979273654_1643979290388.webp","Spider-Man: No Way Home","2021","Action/Adventure", description["Spider-Man: No Way Home"]!!))
        listItems.add(HomeModelClass("Kn/IN","2h 48m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/nsV5Mfi9FAV4w8eDsdr7uqVswOk.jpg","K.G.F: Chapter 2","2022","Action/Drama", description["Spider-Man: No Way Home"]!!))
        listItems.add(HomeModelClass("Hi/IN","2h 47m","https://i.ytimg.com/vi/bweRG6WueuM/maxresdefault.jpg","Brahmāstra: Part One – Shiva","2022","Fantasy/Adventure", description["Spider-Man: No Way Home"]!!))
        listItems.add(HomeModelClass("Ta/IN","2h 53m","https://www.themoviedb.org/t/p/w1066_and_h600_bestv2/1GGc5XXaFgNBoJnOEBJCnXSMwhx.jpg","Vikram","2022","Action/Mystery", description["Spider-Man: No Way Home"]!!))


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