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
        val adapter = FoodAdapter(requireContext(), foodList)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewFood)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return view
    }

    private fun generateDummyFoodList(): List<FoodData> = listOf(
        FoodData(
            R.drawable.food_starter_french_fries,
            "Batata Frita",
            "Batatas cortadas em palitos e fritas.",
            20,
            10.99
        ),
        FoodData(
            R.drawable.food_starter_bruschetta,
            "Bruschetta de Tomate e Manjericão",
            "Fatias de pão italiano grelhado cobertas com tomates frescos, manjericão, alho e azeite de oliva.",
            10,
            12.50
        ),
        FoodData(
            R.drawable.food_starter_onion_soup,
            "Sopa de Cebola Gratinada",
            "Uma sopa de cebola caramelizada coberta com queijo Gruyère derretido e croutons crocantes.",
            30,
            18.75
        ),
        FoodData(
            R.drawable.food_starter_shrimp,
            "Camarão à Provençal",
            "Camarões suculentos salteados em alho, tomate, vinho branco e ervas provençais.",
            20,
            24.99
        )
    )
}
