package com.example.cookbook.additional

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cookbook.R
import com.example.cookbook.models.Ingredient

class ShopCartRecyclerAdapter (
    private var ingredients: ArrayList<Ingredient>
        ): RecyclerView.Adapter<ShopCartRecyclerAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var TextView1: TextView? = null
        var TextView2: TextView? = null
        var TextView3: TextView? = null

        init {
            TextView1 = itemView.findViewById(R.id.ingredientid)
            TextView2 = itemView.findViewById(R.id.ingredientid)
            TextView3 = itemView.findViewById(R.id.ingredientid)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.shop_cart_layout, parent, false)
        return MyViewHolder(itemView);
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.TextView1?.text = ingredients[position].name
        holder.TextView2?.text = ingredients[position].name
    }

    override fun getItemCount(): Int {
        return ingredients.size
    }
}