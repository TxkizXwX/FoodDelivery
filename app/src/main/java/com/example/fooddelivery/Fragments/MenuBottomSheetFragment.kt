package com.example.fooddelivery.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.Adapters.PopularAdapter
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var adapter : PopularAdapter
    private lateinit var menuList : ArrayList<PopularModel>
    private lateinit var menuRv : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_menu_bottom_sheet, container, false)

        menuList = ArrayList()
        menuList.add(PopularModel(R.drawable.pop_menu_burger, foodName = "Sandwich", foodPrice = "3$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, foodName = "Double Burger", foodPrice = "9$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, foodName = "Khinkali", foodPrice = "5$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_burger, foodName = "Sandwich", foodPrice = "3$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, foodName = "Double Burger", foodPrice = "9$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, foodName = "Khinkali", foodPrice = "5$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_burger, foodName = "Sandwich", foodPrice = "3$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_momo, foodName = "Double Burger", foodPrice = "9$", 1))
        menuList.add(PopularModel(R.drawable.pop_menu_sandwich, foodName = "Khinkali", foodPrice = "5$", 1))
        adapter = PopularAdapter(requireContext(), menuList)

        menuRv = view.findViewById(R.id.menu_RV)
        menuRv.layoutManager = LinearLayoutManager(requireContext())
        menuRv.adapter = adapter

        return view
    }
}