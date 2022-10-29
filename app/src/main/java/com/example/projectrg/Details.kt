package com.example.projectrg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_details.*

class Details : AppCompatActivity() {
    private lateinit var obj:GeneralData
    private var planetImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        window.decorView.apply { systemUiVisibility =
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        obj= intent.getParcelableExtra("planet")!!
        planetImg=intent.getIntExtra("planetImage",-1)
        setData(obj, planetImg!!)

        button_info.setOnClickListener{
            val intent= Intent(this,finalActivity::class.java)
            startActivity(intent)
        }
    }
    private fun setData(obj:GeneralData,planetImg:Int)
    {
        title_info.text=obj.title
        distance_info.text=obj.distance+"m km"
        gravity_info.text=obj.gravity+" m/ss"
        overview_info.text=obj.overview
        galaxy_info.text=obj.galaxy
        planet_img_info.setImageResource(planetImg)


    }
}