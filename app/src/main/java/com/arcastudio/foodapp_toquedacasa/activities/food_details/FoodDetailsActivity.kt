package com.arcastudio.foodapp_toquedacasa.activities.food_details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.databinding.ActivityFoodDetailsBinding

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFoodDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodName = intent.getStringExtra("foodName")
        val preparationTime = intent.getStringExtra("preparationTime")
        val ingredients = intent.getStringExtra("ingredients")
        val price = intent.getDoubleExtra("price", 0.0)

        binding.textViewFoodName.text = foodName
        binding.textViewPreparationTime.text = preparationTime
        binding.textViewIngredients.text = ingredients
        binding.textViewPrice.text = String.format("R$ %.2f", price)

        // Configuração do ícone de navegação e OnClickListener
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true) // Habilita o ícone de navegação
            setHomeAsUpIndicator(R.drawable.icon_back) // Define o ícone a ser exibido
        }

        // Adiciona um OnClickListener ao ícone de navegação
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        binding.toolbar.setNavigationOnClickListener {
            finish() // Retorna à atividade anterior quando o ícone de navegação é pressionado
        }

        binding.buttonAddToCart.setOnClickListener {
            // Adicione a lógica para adicionar a comida ao carrinho aqui
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
