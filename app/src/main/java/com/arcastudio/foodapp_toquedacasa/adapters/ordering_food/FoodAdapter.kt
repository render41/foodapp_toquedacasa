package com.arcastudio.foodapp_toquedacasa.adapters.ordering_food

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arcastudio.foodapp_toquedacasa.R
import com.arcastudio.foodapp_toquedacasa.activities.food_details.FoodDetailsActivity
import com.arcastudio.foodapp_toquedacasa.models.data.FoodData

class FoodAdapter(private val foodDataList: List<FoodData>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_food_card, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val currentFood = foodDataList[position]
        holder.bind(currentFood)

        // Configurar o OnClickListener para o card de comida
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, FoodDetailsActivity::class.java).apply {
                putExtra("foodName", currentFood.name)
                putExtra("preparationTime", currentFood.preparationTime)
                putExtra("ingredients", currentFood.ingredients)
                putExtra("price", currentFood.price)
            }
            context.startActivity(intent)
        }
    }


    override fun getItemCount() = foodDataList.size

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageViewFood: ImageView = itemView.findViewById(R.id.imageViewFood)
        private val textViewFoodName: TextView = itemView.findViewById(R.id.textViewFoodName)
        private val textViewTime: TextView = itemView.findViewById(R.id.textViewTime)
        private val textViewPrice: TextView = itemView.findViewById(R.id.textViewPrice)
        val buttonAddToCart: Button = itemView.findViewById(R.id.buttonAddToCart)

        fun bind(foodData: FoodData) {
            imageViewFood.setImageResource(foodData.imageResource)
            textViewFoodName.text = foodData.name
            textViewTime.text = "${foodData.preparationTime} minutes"
            textViewPrice.text = "R$${String.format("%.2f", foodData.price)}"
        }
    }
}
