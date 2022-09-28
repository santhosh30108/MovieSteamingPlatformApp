package com.santhosh.moviesteamingapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginBottom
import androidx.core.view.marginTop
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide


class ImagesFragment(var imageFrag1:String, var imageFrag2:String) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
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