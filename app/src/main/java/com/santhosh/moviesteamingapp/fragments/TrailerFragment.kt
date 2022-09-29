package com.santhosh.moviesteamingapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.santhosh.moviesteamingapp.R
import com.santhosh.moviesteamingapp.adapters.trailerAdapter
import com.santhosh.moviesteamingapp.model.TrailerPageModel

class TrailerFragment(var trailerList : ArrayList<TrailerPageModel>) : Fragment() {
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_trailer, container, false)
        recyclerView = view.findViewById(R.id.trailerRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        val adapter = trailerAdapter(trailerList,view.context)
        recyclerView.adapter  = adapter
        return view
    }

}