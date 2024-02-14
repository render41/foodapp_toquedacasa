package com.arcastudio.foodapp_toquedacasa.activities.cart

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.adapters.cart.CartAdapter
import com.arcastudio.foodapp_toquedacasa.controllers.cart.CartManagerController
import com.arcastudio.foodapp_toquedacasa.databinding.ActivityCartBinding
import com.arcastudio.foodapp_toquedacasa.models.data.CartItemData

class CartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCartBinding
    private lateinit var cartAdapter: CartAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = getString(R.string.cart_title)

        // Obtenha a lista de itens do carrinho do CartManagerController
        val cartItems = CartManagerController.getCartItems()

        // Crie um novo adaptador de carrinho com a lista de itens do carrinho
        cartAdapter = CartAdapter(CartManagerController.getCartItems().toMutableList())

        // Configure o RecyclerView
        binding.recyclerViewCartItems.apply {
            layoutManager = LinearLayoutManager(this@CartActivity)
            adapter = cartAdapter
        }

        // Configurar o botão Voltar na barra de ação
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.icon_back)
        }

        // Configurar o botão Voltar na barra de ação para fechar a atividade
        binding.toolbar.setNavigationOnClickListener { finish() }

        // Configurar o botão de finalização da compra
        binding.buttonCheckout.setOnClickListener {
            // Adicionar aqui a lógica para finalizar a compra
        }
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
