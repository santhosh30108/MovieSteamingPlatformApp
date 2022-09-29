package com.santhosh.moviesteamingapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.santhosh.moviesteamingapp.R
import com.santhosh.moviesteamingapp.adapters.homeadapter
import com.santhosh.moviesteamingapp.data.Data

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val data = Data()

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = homeadapter(data.movieItems(),this@MainActivity)
        recyclerView.adapter  = adapter
    }
}