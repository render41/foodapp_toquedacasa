package com.arcastudio.foodapp_toquedacasa.activities.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.activities.ordering_food.OrderingFoodActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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