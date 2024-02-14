package com.arcastudio.foodapp_toquedacasa.activities.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.activities.ordering_food.OrderingFoodActivity
import com.arcastudio.foodapp_toquedacasa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nextScreen()
    }

    private fun nextScreen() {
        val nextScreenButton = findViewById<Button>(R.id.orderButton)
        nextScreenButton.setOnClickListener {
            val intent = Intent(this, OrderingFoodActivity::class.java)
            startActivity(intent)
        }
    }
}