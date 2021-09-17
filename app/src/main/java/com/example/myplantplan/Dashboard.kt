package com.example.myplantplan

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        val btnPlantChecker = findViewById<ImageView>(R.id.btnChecker)
        btnPlantChecker.setOnClickListener{

        }
        val btnGuide = findViewById<ImageView>(R.id.btnGuide)
        btnGuide.setOnClickListener{

        }
        val btnCalendar = findViewById<ImageView>(R.id.btnGuide)
        btnCalendar.setOnClickListener{


        }
    }
    }
