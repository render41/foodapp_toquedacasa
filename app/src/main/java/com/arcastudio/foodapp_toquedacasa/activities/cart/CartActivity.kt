package com.arcastudio.foodapp_toquedacasa.activities.cart

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.activities.main.MainActivity
import com.arcastudio.foodapp_toquedacasa.adapters.cart.CartAdapter
import com.arcastudio.foodapp_toquedacasa.controllers.cart.CartListener
import com.arcastudio.foodapp_toquedacasa.controllers.cart.CartManagerController
import com.arcastudio.foodapp_toquedacasa.databinding.ActivityCartBinding
import com.arcastudio.foodapp_toquedacasa.models.data.CartItemData

class CartActivity : AppCompatActivity(), CartListener {

    private lateinit var binding: ActivityCartBinding
    private lateinit var cartAdapter: CartAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CartManagerController.setCartListener(this)

        title = getString(R.string.cart_title)

        val cartItems = CartManagerController.getCartItems()

        cartAdapter = CartAdapter(cartItems.toMutableList())

        binding.recyclerViewCartItems.apply {
            layoutManager = LinearLayoutManager(this@CartActivity)
            adapter = cartAdapter
        }

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.icon_back)
        }

        binding.toolbar.setNavigationOnClickListener { finish() }

        binding.buttonCheckout.setOnClickListener {
            val orderNumber = generateOrderNumber()
            showCheckoutDialog(orderNumber)
        }

        updateTotalPrice(cartItems)
    }


    override fun onCartUpdated() {
        val cartItems = CartManagerController.getCartItems()
        updateTotalPrice(cartItems)
    }

    override fun onTotalPriceUpdated(totalPrice: Double) {
        binding.textViewTotal.text = String.format("Total: R$ %.2f", totalPrice)
    }
    
    override fun onResume() {
        super.onResume()
        val cartItems = CartManagerController.getCartItems()
        updateTotalPrice(cartItems)
    }

    private fun updateTotalPrice(cartItems: List<CartItemData>) {
        var totalPrice = 0.0
        for (item in cartItems) totalPrice += item.price * item.quantity
        binding.textViewTotal.text = String.format("Total: R$ %.2f", totalPrice)
    }

    private fun showCheckoutDialog(orderNumber: String) {
        val alertDialog = AlertDialog.Builder(this)
            .setTitle("Pedido Finalizado")
            .setMessage("Seu número de pedido é: $orderNumber")
            .setPositiveButton("Ok") { dialog, _ ->
                CartManagerController.clearCart()
                startActivity(Intent(this, MainActivity::class.java))
                finish()

                dialog.dismiss()
            }
            .create()

        alertDialog.show()
    }

    private fun generateOrderNumber(): String {
        return (100000..999999).random().toString()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}
