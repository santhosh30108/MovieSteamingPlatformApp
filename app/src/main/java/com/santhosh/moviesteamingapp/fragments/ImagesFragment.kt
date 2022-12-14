package com.santhosh.moviesteamingapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.santhosh.moviesteamingapp.R

class ImagesFragment(var imageFrag1:String, var imageFrag2:String) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View = inflater.inflate(R.layout.fragment_images, container, false)
        var imageView:ImageView = view.findViewById(R.id.images1)
        context?.let {
            Glide.with(it)
                .load(imageFrag1)
                .override(1200, 700)
                .centerCrop()
                .into(imageView)
        };
        var imageView2:ImageView = view.findViewById(R.id.images2)
        context?.let {
            Glide.with(it)
                .load(imageFrag2)
                .override(1200, 700)
                .centerCrop()
                .into(imageView2)
        };
        return view
    }

}