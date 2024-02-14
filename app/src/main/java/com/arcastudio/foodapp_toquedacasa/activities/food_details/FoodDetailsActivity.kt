package com.arcastudio.foodapp_toquedacasa.activities.food_details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.databinding.ActivityFoodDetailsBinding

class FoodDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFoodDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtenha os dados da comida dos extras da Intent
        val foodName = intent.getStringExtra("foodName")
        val preparationTime = intent.getStringExtra("preparationTime")
        val ingredients = intent.getStringExtra("ingredients")
        val price = intent.getDoubleExtra("price", 0.0)

        // Configure as views com os dados da comida
        binding.textViewFoodName.text = foodName
        binding.textViewPreparationTime.text = preparationTime
        binding.textViewIngredients.text = ingredients
        binding.textViewPrice.text = String.format("R$ %.2f", price)

        // Adicione um clique ao botão de adicionar ao carrinho, se necessário
        binding.buttonAddToCart.setOnClickListener {
            // Adicione a lógica para adicionar a comida ao carrinho aqui
        }
    }
}