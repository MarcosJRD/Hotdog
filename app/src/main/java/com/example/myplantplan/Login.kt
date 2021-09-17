package com.example.myplantplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView



class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    val username = findViewById<EditText>(R.id.editUsername)
    val password = findViewById<EditText>(R.id.editPassword)
    val btnLog = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.loginbtn)
    btnLog.setOnClickListener{
        if (username.text.toString().equals("admin")&&password.text.toString().equals("password")) {
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
    val btnFb = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.fbbtn)
    btnFb.setOnClickListener{
        val intentWeb = Uri.parse("https://facebook.com").let{
                url -> Intent(Intent.ACTION_VIEW,url)
        }
        startActivity(intentWeb)
    }
    val btnGL = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.glbtn)
    btnGL.setOnClickListener{

        val intentWeb = Uri.parse("https://accounts.google.com").let{
                url -> Intent(Intent.ACTION_VIEW,url)
        }
        startActivity(intentWeb)
    }
    val btnCreate = findViewById<TextView>(R.id.textCreate)
    btnCreate.setOnClickListener{

    }

    }
}