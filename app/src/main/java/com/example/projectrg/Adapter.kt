package com.example.projectrg

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter( val planet:List<GeneralData>): RecyclerView.Adapter<Adapter.myViewHolder>() {
    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.title
        val planetimg = view.planet_img
        val galaxy = view.galaxy
        val distance = view.distance
        val gravity = view.gravity
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return planet.size
    }
}