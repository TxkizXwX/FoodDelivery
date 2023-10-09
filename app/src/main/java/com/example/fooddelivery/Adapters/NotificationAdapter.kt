package com.example.fooddelivery.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.Models.NotificationModel
import com.example.fooddelivery.databinding.NotificationItemBinding

class NotificationAdapter(
    private val context : Context,
    private val nList: ArrayList<NotificationModel>,
) : RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NotificationViewHolder {
        var binding = NotificationItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return NotificationViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: NotificationViewHolder,
        position: Int
    ) {
        val notificationList = nList[position]
        notificationList.getImage()?.let { holder.image.setImageResource(it) }
        holder.notification.text = notificationList.getNotification()
    }

    override fun getItemCount(): Int {
        return nList.size
    }

    class NotificationViewHolder(private val binding:NotificationItemBinding):RecyclerView.ViewHolder(binding.root){
        val image = binding.notificationImage
        val notification = binding.notificationTextView
    }
}