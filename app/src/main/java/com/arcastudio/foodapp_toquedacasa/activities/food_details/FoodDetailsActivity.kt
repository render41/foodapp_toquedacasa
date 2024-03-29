package com.arcastudio.foodapp_toquedacasa.activities.food_details

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.controllers.cart.CartManagerController
import com.arcastudio.foodapp_toquedacasa.databinding.ActivityFoodDetailsBinding

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFoodDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodName = intent.getStringExtra("foodName")
        val preparationTime = intent.getIntExtra("preparationTime", 0)
        val ingredients = intent.getStringExtra("ingredients")
        val price = intent.getDoubleExtra("price", 0.0)
        val imageResource = intent.getIntExtra("imageResource", R.drawable.default_image)

        binding.textViewFoodName.text = foodName
        binding.textViewPreparationTime.text = "$preparationTime minutos"
        binding.textViewIngredients.text = ingredients
        binding.textViewPrice.text = String.format("R$ %.2f", price)
        binding.imageViewFood.setImageResource(imageResource)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.icon_back)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        binding.toolbar.setNavigationOnClickListener { finish() }

        binding.buttonAddToCart.setOnClickListener {
            val foodName = intent.getStringExtra("foodName")
            val price = intent.getDoubleExtra("price", 0.0)
            val imageResource = intent.getIntExtra("imageResource", R.drawable.default_image)
            if (foodName != null) CartManagerController.addItem(foodName, price, imageResource)
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
