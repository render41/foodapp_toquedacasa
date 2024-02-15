package com.arcastudio.foodapp_toquedacasa.controllers.cart

import com.arcastudio.foodapp_toquedacasa.models.data.CartItemData

object CartManagerController {
    private val cartItems: MutableList<CartItemData> = mutableListOf()
    private var cartListener: CartListener? = null

    fun setCartListener(listener: CartListener) {
        cartListener = listener
    }

    fun addItem(foodName: String, price: Double, imageResource: Int) {
        val existingItem = cartItems.find { it.foodName == foodName }

        if (existingItem != null) {
            existingItem.quantity++
        } else {
            val newItem = CartItemData(foodName, price, 1, imageResource)
            cartItems.add(newItem)
        }

        updateTotalPrice()
    }

    private fun updateTotalPrice() {
        var totalPrice = 0.0
        for (item in cartItems) {
            totalPrice += item.price * item.quantity
        }
        cartListener?.onTotalPriceUpdated(totalPrice)
    }

    fun getCartItems(): List<CartItemData> = cartItems.toList()

    fun clearCart() {
        cartItems.clear()
        cartListener?.onCartUpdated()
    }

}
