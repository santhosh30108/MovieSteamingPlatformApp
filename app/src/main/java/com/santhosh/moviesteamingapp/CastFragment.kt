package com.santhosh.moviesteamingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.santhosh.moviesteamingapp.adapters.castadapter
import com.santhosh.moviesteamingapp.adapters.homeadapter
import com.santhosh.moviesteamingapp.model.CastPageModel
import com.santhosh.moviesteamingapp.model.HomeModelClass

class CastFragment(var castList:ArrayList<CastPageModel>) : Fragment() {

    lateinit var recyclerView:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_cast, container, false)
        recyclerView = view.findViewById(R.id.castRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        val adapter = context?.let { castadapter(castList, it) }
        recyclerView.adapter  = adapter

        return view
    }
}