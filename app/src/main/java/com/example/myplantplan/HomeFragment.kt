package com.example.myplantplan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*
import android.os.Handler


class HomeFragment : Fragment(),CaterogyClicked {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler1.apply {
            adapter=RecyclerViewAdapter(this@HomeFragment.requireContext(),this@HomeFragment).also {
                it.submitList(MockData.catergoryNames())
            }
            layoutManager= LinearLayoutManager(this@HomeFragment.requireContext(),
                RecyclerView.HORIZONTAL,false)
        }
        Handler().postDelayed({
            recycler2.apply {
                adapter=RecyclerViewAdapter2(this@HomeFragment.requireContext()).also {
                    it.submitList(MockData3.categoryplants())
                }
                layoutManager=GridLayoutManager(this@HomeFragment.requireContext(),2)
            }
            shimmer_container.stopShimmer()
            shimmer_container.visibility=View.GONE
        },5000)






    }

    override fun categotyClicked(plant: MutableList<Plant>) {
        recycler2.apply {
            adapter= RecyclerViewAdapter2(this@HomeFragment.requireContext()).also {
                it.submitList(plant)
            }
            layoutManager= GridLayoutManager(this@HomeFragment.requireContext(),2)
        }
    }

}