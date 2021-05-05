package io.eskills.benarfaboulangerie.controller

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.eskills.benarfaboulangerie.R
import io.eskills.benarfaboulangerie.models.Product

class ProductAdapter(var context: Context, var arrayList: ArrayList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)
        return ItemHolder(itemHolder)

    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var listItem: Product = arrayList.get(position)

        holder.img.setBackgroundResource(listItem.img!!)
        holder.name.text = listItem.name+" : "+listItem.prix

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var img: LinearLayout = itemView.findViewById(R.id.product_image)
        var name: TextView = itemView.findViewById(R.id.name)

    }

}