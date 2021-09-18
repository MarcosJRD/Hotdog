package com.example.myplantplan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class main_guide : AppCompatActivity() {
    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    val rv_recyclerView = findViewById<RecyclerView>(R.id.rv_recyclerView)
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_guide)
        postToList()
        rv_recyclerView.layoutManager = LinearLayoutManager(this)
        rv_recyclerView.adapter = guide_adapter(titlesList,descList,imageList)
    }
    private fun addToList(title: String, description: String, image: Int) {
        titlesList.add(title)
        descList.add(description)
        imageList.add(image)
    }
    private fun postToList(){
        for (i in 1..25){
            addToList("Title $i","Description $i", R.mipmap.ic_launcher_round)
        }

    }
}