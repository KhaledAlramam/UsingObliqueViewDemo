package com.sedra.myapplication

import ak.sh.ay.oblique.ObliqueView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ObliqueAdapter(val list: List<String>): RecyclerView.Adapter<ObliqueAdapter.ObliqueViewHolder>() {

    class ObliqueViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
         val image: ObliqueView = itemView.findViewById(R.id.obliqueView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObliqueViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_oblique, parent, false)
        return ObliqueViewHolder(view)
    }

    override fun onBindViewHolder(holder: ObliqueViewHolder, position: Int) {
        holder.itemView.translationX = -80f*position
        Glide.with(holder.itemView.context)
            .load(list[position])
            .dontAnimate()
            .into(holder.image)
    }

    override fun getItemCount(): Int =
        list.size

}