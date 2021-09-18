package com.example.myplantplan

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Register: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)
        /*
        val username = findViewById<EditText>(R.id.editUsername)
        val password = findViewById<EditText>(R.id.editPassword)
        val cpassword = findViewById<EditText>(R.id.editCoPassword)
        val create = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.createbtn)
        */
        val signin = findViewById<TextView>(R.id.textSignin)
        signin.setOnClickListener{

           val intent = Intent (this, Login::class.java)
            startActivity(intent)
        }



    }

}