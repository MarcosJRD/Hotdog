package com.example.myplantplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class ContactUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contactus)

        val number = findViewById<TextView>(R.id.number)
        number.setOnClickListener {
            val intentCall = Intent(Intent.ACTION_DIAL, Uri.parse("tel:+639992324754"))
            startActivity(intentCall)
        }
    }
}