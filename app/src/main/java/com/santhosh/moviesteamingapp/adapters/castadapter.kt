package com.santhosh.moviesteamingapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.santhosh.moviesteamingapp.R
import com.santhosh.moviesteamingapp.model.CastPageModel

class castadapter(var listItems: ArrayList<CastPageModel>, var context: Context) : RecyclerView.Adapter<castadapter.castadapterholder>() {
    class castadapterholder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var image: ImageView = itemView.findViewById(R.id.actorImage)
        var name: TextView = itemView.findViewById(R.id.actorName)
        var charectername: TextView = itemView.findViewById(R.id.charecterName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): castadapterholder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.castfragment,parent,false)
        return castadapterholder(view)
    }

    override fun onBindViewHolder(holder: castadapterholder, position: Int) {
        holder.name.text = listItems[position].name

        Glide.with(context)
            .load(listItems[position].image)
            .override(1300, 1250)
            .centerCrop()
            .into(holder.image);

        holder.charectername.text = listItems[position].charecter_name
    }

    override fun getItemCount(): Int {
       return listItems.size
    }
}