package com.example.fooddelivery.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.DetailsActivity
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.Models.SharedModel
import com.example.fooddelivery.databinding.HomeFoodItemBinding

class PopularAdapter(
    val context: Context,
    var list : ArrayList<PopularModel>
) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    private lateinit var sharedModel: SharedModel

    fun setSharedModel(videoModel: SharedModel){
        sharedModel = videoModel
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val binding = HomeFoodItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return PopularViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val listModel = list[position]

        holder.foodName.text = listModel.getFoodName()
        holder.foodPrice.text = listModel.getFoodPrice()
        listModel.getFoodImage()?.let { holder.foodImage.setImageResource(it) }

        holder.item.setOnClickListener {
            val intent = Intent(context, DetailsActivity :: class.java)
            intent.putExtra("foodImage",listModel.getFoodImage())
            intent.putExtra("foodName",listModel.getFoodName())
            context.startActivity(intent)
        }

        holder.addBtn.setOnClickListener {
            if(sharedModel.inList(listModel)){
                sharedModel.deleteFromCart(listModel)
                holder.addBtn.setText("Add To Cart")
            } else{
                sharedModel.addToCart(listModel)
                holder.addBtn.setText("Delete To Cart")
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class PopularViewHolder(binding: HomeFoodItemBinding) : RecyclerView.ViewHolder(binding.root){
        val foodName = binding.homeFoodName
        val foodImage = binding.homeFoodImage
        val foodPrice = binding.homeFoodPrice

        val addBtn = binding.homeFoodBtn
        val item = binding.root
    }

    fun updateList(newList : ArrayList<PopularModel>){
        list = newList
        notifyDataSetChanged()
    }
}