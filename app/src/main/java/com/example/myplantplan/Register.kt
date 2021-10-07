package com.example.myplantplan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.register.*

class Register: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        textSignin.setOnClickListener{
           val intent = Intent (this, Login::class.java)
            startActivity(intent)
        }


        createbtn.setOnClickListener{
            addUser()
        }

    }

    //Method for saving the user records in database
    private fun addUser() {
        val name = edit_Username.text.toString()
        val passc = editCoPassword.text.toString()
        val pass = editPassword.text.toString()
        val databaseHandler: DatabaseHelper = DatabaseHelper(this)

        if (pass == passc){
        if (!name.isEmpty() && !pass.isEmpty()) {
            val status =
                databaseHandler.addUser(UsermodelClass(0, name, pass))
            if (status > -1) {
                Toast.makeText(applicationContext, "Account Succesfully Created", Toast.LENGTH_LONG).show()
                edit_Username.text.clear()
                editPassword.text.clear()
                editCoPassword.text.clear()
            }
        } else {
            Toast.makeText(
                applicationContext,
                "Name or Password cannot be blank",
                Toast.LENGTH_LONG
            ).show()
        }
        }else{
            Toast.makeText(
            applicationContext,
            "Password is not Equal",
            Toast.LENGTH_LONG
            ).show()
        }
    }

}