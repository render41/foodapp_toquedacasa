package com.arcastudio.foodapp_toquedacasa.adapters.cart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.models.data.CartItemData

class CartAdapter(private val cartItems: MutableList<CartItemData>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)
        return CartViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val currentItem = cartItems[position]
        holder.bind(currentItem)

        holder.buttonRemove.setOnClickListener {
            val currentQuantity = currentItem.quantity
            if (currentQuantity > 1) {
                currentItem.quantity -= 1
                notifyItemChanged(position)
            } else {
                cartItems.removeAt(position)
                notifyItemRemoved(position)
            }
        }

        holder.buttonAdd.setOnClickListener {
            currentItem.quantity += 1
            notifyItemChanged(position)
        }
    }

    override fun getItemCount() = cartItems.size

    class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageViewFood: ImageView = itemView.findViewById(R.id.imageViewFood)
        private val textViewFoodName: TextView = itemView.findViewById(R.id.textViewFoodName)
        private val textViewPrice: TextView = itemView.findViewById(R.id.textViewPrice)
        private val textViewQuantity: TextView = itemView.findViewById(R.id.textViewQuantity)
        private val textViewPriceTotal: TextView = itemView.findViewById(R.id.textViewPriceTotal)
        val buttonAdd: Button = itemView.findViewById(R.id.buttonAdd)
        val buttonRemove: Button = itemView.findViewById(R.id.buttonRemove)

        fun bind(cartItem: CartItemData) {
            imageViewFood.setImageResource(cartItem.imageResource)
            textViewFoodName.text = cartItem.foodName
            textViewPrice.text = String.format("R$ %.2f", cartItem.price)
            textViewQuantity.text = cartItem.quantity.toString()
            val totalPrice = cartItem.price * cartItem.quantity
            textViewPriceTotal.text = String.format("Total: R$ %.2f", totalPrice)
        }
    }
}
