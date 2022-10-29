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
        var dummyImage: Int? = null

        holder.title.text = planet[position].title
        holder.galaxy.text = planet[position].galaxy
        holder.distance.text = planet[position].distance+ " m km"
        holder.gravity.text = planet[position].gravity+ " m/ss"

        when(planet[position].title!!.toLowerCase()){
            "mars"->{
                dummyImage = R.drawable.ic_mars
            }
            "neptune"->{
                dummyImage = R.drawable.ic_neptune
            }
            "earth"->{
                dummyImage = R.drawable.ic_earth
            }
            "moon"->{
                dummyImage = R.drawable.ic_moon
            }
            "venus"->{
                dummyImage = R.drawable.ic_venus
            }
            "jupiter"->{
                dummyImage = R.drawable.ic_jupiter
            }
            "saturn"->{
                dummyImage = R.drawable.ic_saturn
            }
            "uranus"->{
                dummyImage = R.drawable.ic_uranus
            }

            "mercury"->{
                dummyImage = R.drawable.ic_mercury
            }

            "sun"->{
                dummyImage = R.drawable.ic_sun
            }


        }
        holder.planetimg.setImageResource(dummyImage!!)


    }

    override fun getItemCount(): Int {
       return planet.size
    }
}