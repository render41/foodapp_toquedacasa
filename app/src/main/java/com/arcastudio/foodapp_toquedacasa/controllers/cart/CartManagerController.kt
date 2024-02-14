package com.arcastudio.foodapp_toquedacasa.controllers.cart

import com.arcastudio.foodapp_toquedacasa.models.data.CartItemData

object CartManagerController {
    private val cartItems: MutableList<CartItemData> = mutableListOf()

    fun addItem(foodName: String, price: Double, imageResource: Int) {
        // Verificar se o item já está no carrinho
        val existingItem = cartItems.find { it.foodName == foodName }

        if (existingItem != null) {
            // Se o item já estiver no carrinho, apenas atualize a quantidade
            existingItem.quantity++
        } else {
            // Se o item não estiver no carrinho, adicione-o
            val newItem = CartItemData(foodName, price, 1, imageResource)
            cartItems.add(newItem)
        }
    }

    fun getCartItems(): List<CartItemData> {
        return cartItems.toList()
    }

    fun removeItem(foodName: String) {
        val itemToRemove = cartItems.find { it.foodName == foodName }
        if (itemToRemove != null) cartItems.remove(itemToRemove)
    }

}