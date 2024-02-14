package com.arcastudio.foodapp_toquedacasa.models.data

import com.arcastudio.foodapp_toquedacasa.R

data class CartItemData(
    val foodName: String,
    val price: Double,
    var quantity: Int,
    val imageResource: Int = R.drawable.food_starter_french_fries
)