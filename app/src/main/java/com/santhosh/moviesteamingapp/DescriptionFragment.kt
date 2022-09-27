package com.santhosh.moviesteamingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DescriptionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view:View = inflater.inflate(R.layout.fragment_description, container, false)
        var fragmentDescription:TextView = view.findViewById(R.id.Description)

        fragmentDescription.text = arguments?.getString("description").toString()

        return view
    }

}