package com.example.myplantplan

import com.example.myplantplan.Plant
import com.example.myplantplan.R

object MockData3 {
    fun categoryplants():MutableList<Plant>{
        val category= mutableListOf<Plant>()

        for ( i in 0 until 1){
            val plant1=Plant("Carrot", R.drawable.carrot,"Small","","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
            val plant2=Plant("Tomato",R.drawable.carrot,"Medium","Plant","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
            val plant3=Plant("Eggplant",R.drawable.carrot,"Large","Plant","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
            val plant4=Plant("Raddish",R.drawable.carrot,"Small","Plant","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
//         val plant4=Plant("Aglaonema","45","","","","")
//         val plant5=Plant("Aglaonema","45","","","","")

            category.add(plant1)
            category.add(plant2)
            category.add(plant3)
            category.add(plant4)
//            category.add(plant4)
//            category.add(plant5)

        }
        return category

    }
}