package com.arcastudio.foodapp_toquedacasa.activities.ordering_food.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.adapters.ordering_food.FoodAdapter
import com.arcastudio.foodapp_toquedacasa.models.data.FoodData

class StartFoodFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start_food, container, false)

        val foodList = generateDummyFoodList()
        val adapter = FoodAdapter(requireContext(), foodList) // Passando o contexto do fragmento
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewFood)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    private fun generateDummyFoodList(): List<FoodData> = listOf(
        FoodData(R.drawable.food_starter_french_fries, "Comida 1", "", 30, 10.00),
        FoodData(R.drawable.food_starter_french_fries, "Comida 2", "", 45, 12.50),
        FoodData(R.drawable.food_starter_french_fries, "Comida 3","", 25, 8.00),
    )
}
