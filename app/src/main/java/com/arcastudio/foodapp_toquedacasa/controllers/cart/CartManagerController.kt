package com.arcastudio.foodapp_toquedacasa.controllers.cart

import com.arcastudio.foodapp_toquedacasa.models.data.CartItemData

object CartManagerController {
    private val cartItems: MutableList<CartItemData> = mutableListOf()

    fun addItem(foodName: String, price: Double, imageResource: Int) {
        val existingItem = cartItems.find { it.foodName == foodName }

        if (existingItem != null) {
            existingItem.quantity++
        } else {
            val newItem = CartItemData(foodName, price, 1, imageResource)
            cartItems.add(newItem)
        }
    }

    fun getCartItems(): List<CartItemData> {
        return cartItems.toList()
    }

}