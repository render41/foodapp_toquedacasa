package com.arcastudio.foodapp_toquedacasa.controllers.cart

import com.arcastudio.foodapp_toquedacasa.models.data.CartItemData

object CartManagerController {
    private val cartItems = mutableListOf<CartItemData>()

    fun addItem(foodName: String, price: Double, quantity: Int = 1) {
        val existingItem = cartItems.find { it.foodName == foodName }
        if (existingItem != null) {
            existingItem.quantity += quantity
        } else {
            val newItem = CartItemData(foodName, price, quantity)
            cartItems.add(newItem)
        }
    }

    fun removeItem(foodName: String) {
        val itemToRemove = cartItems.find { it.foodName == foodName }
        if (itemToRemove != null) cartItems.remove(itemToRemove)
    }

    fun getCartItems(): MutableList<CartItemData> = cartItems

}