package com.arcastudio.foodapp_toquedacasa.activities.ordering_food

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.activities.cart.CartActivity
import com.arcastudio.foodapp_toquedacasa.activities.ordering_food.ui.DessertFragment
import com.arcastudio.foodapp_toquedacasa.activities.ordering_food.ui.DrinkFragment
import com.arcastudio.foodapp_toquedacasa.activities.ordering_food.ui.LunchFragment
import com.arcastudio.foodapp_toquedacasa.activities.ordering_food.ui.StartFoodFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class OrderingFoodActivity : AppCompatActivity() {
    private lateinit var navigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordering_food)

        navigationFragments()
        goToCart()
    }

    private fun navigationFragments() {
        navigationView = findViewById(R.id.navigationView)
        switchFragments(StartFoodFragment())
        navigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigationStarterFood -> {
                    switchFragments(StartFoodFragment())
                }
                R.id.navigationLunch -> {
                    switchFragments(LunchFragment())
                }
                R.id.navigationDrink -> {
                    switchFragments(DrinkFragment())
                }
                R.id.navigationDessert -> {
                    switchFragments(DessertFragment())
                }
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun switchFragments(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.navHost, fragment)
        fragmentTransaction.commit()
    }

    private fun goToCart() {
        val goToCart = findViewById<FloatingActionButton>(R.id.cartFloatingActionButton)
        goToCart.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }
    }
}