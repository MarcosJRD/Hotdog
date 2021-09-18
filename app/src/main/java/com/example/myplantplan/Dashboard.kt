package com.example.myplantplan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Dashboard : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)
        val btnPlantChecker = findViewById<ImageView>(R.id.btnChecker)
        btnPlantChecker.setOnClickListener{

        }
        val btnGuide = findViewById<ImageView>(R.id.btnGuide)
        btnGuide.setOnClickListener{
            val intent = Intent (this, main_guide::class.java)
            startActivity(intent)
            Toast.makeText(this@Dashboard,"You clicked Guide",Toast.LENGTH_SHORT).show()

        }
        val btnCalendar = findViewById<ImageView>(R.id.btnGuide)
        btnCalendar.setOnClickListener{


        }

    }
    }
