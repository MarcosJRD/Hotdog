package com.example.myplantplan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.editUsername
import kotlinx.android.synthetic.main.register.*


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


    loginbtn.setOnClickListener{
        Login()
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
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }

    }

    /**
     * This method is to validate the input text fields and verify login credentials from SQLite
     */

    private fun Login(){
        val databasehandler: DatabaseHelper = DatabaseHelper(this)

        if (databasehandler.checkUser(editUsername!!.text.toString().trim { it <= ' ' }, edit_Password!!.text.toString().trim { it <= ' ' })) {
            val accountsIntent = Intent(this, Dashboard::class.java)
            startActivity(accountsIntent)
        } else {

            // Snack Bar to show success message that record is wrong
            Toast.makeText(this,"Username or Password is not Correct", Toast.LENGTH_SHORT).show()
        }

    }



}