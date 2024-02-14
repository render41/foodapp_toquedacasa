package com.arcastudio.foodapp_toquedacasa.models.data


data class CartItemData(
    val foodName: String,
    val price: Double,
    var quantity: Int,
    val imageResource: Int
)