package com.example.fooddelivery.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddelivery.Adapters.NotificationAdapter
import com.example.fooddelivery.Models.NotificationModel
import com.example.fooddelivery.R
import com.example.fooddelivery.databinding.NotificationBottomFragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NotificationBottomFragment : BottomSheetDialogFragment() {
    private lateinit var binding : NotificationBottomFragmentBinding
    private lateinit var notificationList : ArrayList<NotificationModel>
    private lateinit var adapter : NotificationAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = NotificationBottomFragmentBinding.inflate(inflater,container,false)

        notificationList = ArrayList()
        notificationList.add(NotificationModel(R.drawable.n_unsuccess, "Your order has been Canceled Successfully"))
        notificationList.add(NotificationModel(R.drawable.n_deliver, "Order has been taken by the driver"))
        notificationList.add(NotificationModel(R.drawable.n_success, "Congrats Your Order Placed"))

        binding.btnBack.setOnClickListener{
            dismiss()
        }

        adapter = NotificationAdapter(requireContext(), notificationList as ArrayList<NotificationModel>)

        binding.noteRv.layoutManager = LinearLayoutManager(requireContext())
        binding.noteRv.adapter = adapter
        return binding.root
    }
}