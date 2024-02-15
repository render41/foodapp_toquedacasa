package com.arcastudio.foodapp_toquedacasa.controllers.cart

interface CartListener {
    fun onCartUpdated()
    fun onTotalPriceUpdated(totalPrice: Double)
}