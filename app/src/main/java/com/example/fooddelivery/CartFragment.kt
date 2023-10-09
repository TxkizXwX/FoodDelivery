package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddelivery.Adapters.CartAdapter
import com.example.fooddelivery.Adapters.PopularAdapter
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    private lateinit var binding : FragmentCartBinding

    private lateinit var adapter : CartAdapter
    private lateinit var list: ArrayList<PopularModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater,container,false)

        list = ArrayList()
        list.add(PopularModel(R.drawable.pop_menu_burger, foodName = "Sandwich", foodPrice = "3$", 1))
        list.add(PopularModel(R.drawable.pop_menu_momo, foodName = "Double Burger", foodPrice = "9$", 1))
        list.add(PopularModel(R.drawable.pop_menu_sandwich, foodName = "Khinkali", foodPrice = "5$", 1))
        list.add(PopularModel(R.drawable.pop_menu_burger, foodName = "Sandwich", foodPrice = "3$", 1))
        list.add(PopularModel(R.drawable.pop_menu_momo, foodName = "Double Burger", foodPrice = "9$", 1))
        list.add(PopularModel(R.drawable.pop_menu_sandwich, foodName = "Khinkali", foodPrice = "5$", 1))
        list.add(PopularModel(R.drawable.pop_menu_burger, foodName = "Sandwich", foodPrice = "3$", 1))
        list.add(PopularModel(R.drawable.pop_menu_momo, foodName = "Double Burger", foodPrice = "9$", 1))
        list.add(PopularModel(R.drawable.pop_menu_sandwich, foodName = "Khinkali", foodPrice = "5$", 1))

        adapter = CartAdapter(requireContext(), list)

        binding.cartRv.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRv.adapter = adapter

        return binding.root
    }
}