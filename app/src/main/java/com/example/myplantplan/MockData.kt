package com.example.myplantplan

object MockData {
    fun catergoryNames(): MutableList<Category> {
        val category = mutableListOf<Category>()
        val det2 = mutableListOf<Plant>()
        val det3 = mutableListOf<Plant>()
        for (i in 0 until 1) {

            val plant1 = Plant(
                "Carrots",
                R.drawable.carrot,
                "Small",
                "Plant",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged"
            )
            val plant2 = Plant(
                "Tomato",
                R.drawable.carrot,
                "Medium",
                "Plant",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged"
            )
            val plant3 = Plant(
                "Eggplant",
                R.drawable.carrot,
                "Large",
                "Plant",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged"
            )
            val plant4 = Plant(
                "Raddish",
                R.drawable.carrot,
                "Small",
                "Plant",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged"
            )
            det3.add(plant1)
            det3.add(plant2)
            det3.add(plant3)
            det3.add(plant4)
            val cate = Category("Recent", det3)
            var details2 = Plant("Suculenta", R.drawable.carrot, "Medium", "Plantis", "")
            var details3 = Plant("Alium", R.drawable.carrot, "Large", "Plantis", "")
            var details4 = Plant("Monstero", R.drawable.carrot, "Small", "Plantis", "")
            det2.add(details2)
            det2.add(details3)
            det2.add(details4)
            val cate3 = Category("Root", det2)
            val cate4 = Category("Outdoor", det3)
            val cate5 = Category("Special", det2)

            category.add(cate)
            category.add(cate3)
            category.add(cate4)
            category.add(cate5)


        }
        return category
    }
}