package com.santhosh.moviesteamingapp.adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.browser.customtabs.CustomTabsIntent
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.santhosh.moviesteamingapp.R
import com.santhosh.moviesteamingapp.model.TrailerPageModel

class trailerAdapter (var trailerList:ArrayList<TrailerPageModel>, var context: Context) : RecyclerView.Adapter<trailerAdapter.traileradapterholder>() {
    class traileradapterholder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var image: ImageView = itemView.findViewById(R.id.trailerImage)
        var title: TextView = itemView.findViewById(R.id.trailerTitle)
        var cardView: CardView = itemView.findViewById(R.id.trailerCardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): traileradapterholder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.trailerlayout,parent,false)
        return traileradapterholder(view)
    }

    override fun onBindViewHolder(holder: traileradapterholder, position: Int) {
        holder.title.text = trailerList[position].title
        Glide.with(context)
            .load(trailerList[position].imageurl)
            .override(1300, 700)
            .centerCrop()
            .into(holder.image);
        holder.cardView.setOnClickListener {
            var builder = CustomTabsIntent.Builder()

            var customTabsIntent:CustomTabsIntent = builder.build()
            customTabsIntent.launchUrl(context, Uri.parse(trailerList[position].videourl))
        }
    }

    override fun getItemCount(): Int {
        return trailerList.size
    }
}