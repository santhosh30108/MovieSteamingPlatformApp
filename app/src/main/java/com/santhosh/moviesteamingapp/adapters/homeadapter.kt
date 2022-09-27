package com.santhosh.moviesteamingapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.santhosh.moviesteamingapp.MoviesinfoActivity
import com.santhosh.moviesteamingapp.R
import com.santhosh.moviesteamingapp.model.HomeModelClass

class homeadapter(var listItems: ArrayList<HomeModelClass>, var context: Context) : RecyclerView.Adapter<homeadapter.homeadapterholder>() {
    class homeadapterholder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var movieName:TextView = itemView.findViewById(R.id.movieNameHome)
        var runtime:TextView = itemView.findViewById(R.id.runtime)
        var image:ImageView = itemView.findViewById(R.id.imageView)
        var language:TextView = itemView.findViewById(R.id.languagehome)
        var year:TextView = itemView.findViewById(R.id.year)
        var cardView:CardView = itemView.findViewById(R.id.cardLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): homeadapterholder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.homepage_items,parent,false)
        return homeadapterholder(view)
    }

    override fun onBindViewHolder(holder: homeadapterholder, position: Int) {
        holder.movieName.text = listItems[position].name

        Glide.with(context)
            .load(listItems[position].image)
            .override(1300, 600)
            .centerCrop()
            .into(holder.image);

        holder.year.text = listItems[position].year
        holder.language.text = listItems[position].language
        holder.runtime.text = listItems[position].runtime
        holder.cardView.setOnClickListener {
            var intent = Intent(context,MoviesinfoActivity::class.java)
            intent.putExtra("image",listItems[position].image)
            intent.putExtra("name",listItems[position].name)
            intent.putExtra("year",listItems[position].year)
            intent.putExtra("runtime",listItems[position].runtime)
            intent.putExtra("language",listItems[position].language)
            intent.putExtra("genre",listItems[position].genre)
            intent.putExtra("description",listItems[position].description)

            context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return listItems.size
    }
}