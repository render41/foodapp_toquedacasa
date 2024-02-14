package com.arcastudio.foodapp_toquedacasa.activities.ordering_food.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.adapters.ordering_food.FoodAdapter
import com.arcastudio.foodapp_toquedacasa.models.data.FoodData
import com.arcastudio.foodapp_toquedacasa.models.data.FoodObject

class DrinkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_drink, container, false)

        val foodList = generateDummyFoodList()
        val adapter = FoodAdapter(requireContext(), foodList)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewFood)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    private fun generateDummyFoodList(): List<FoodData> = FoodObject.drinksList
}