package com.santhosh.moviesteamingapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DescriptionFragment(val description : String) : Fragment() {
    lateinit var fragmentDescription:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view:View = inflater.inflate(R.layout.fragment_description, container, false)
        fragmentDescription = view.findViewById(R.id.Description)
        fragmentDescription.text = description
        return view
    }

}