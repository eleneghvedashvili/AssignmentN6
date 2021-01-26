package com.example.work6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class caradapter (private val fastcars: List<Cars>):RecyclerView.Adapter<caradapter.hellocarsViewHolder>() {

    class hellocarsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val  imageview: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): hellocarsViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.newcars,parent,false)
        return hellocarsViewHolder(view)
    }

    override fun onBindViewHolder(holder: hellocarsViewHolder, position: Int) {
        val p = fastcars[position]
        Glide.with(holder.imageview.context)
                .load(p.link)
                .centerCrop()
                .into(holder.imageview)
    }
    override fun getItemCount(): Int = fastcars.size
}

