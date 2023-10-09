package com.example.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.Adapters.PopularAdapter
import com.example.fooddelivery.Models.PopularModel
import com.example.fooddelivery.Models.SharedModel
import com.example.fooddelivery.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {

    private lateinit var binding: FragmentHistoryBinding
//    private lateinit var list : ArrayList<PopularModel>
//    private lateinit var popularAdapter: PopularAdapter
//    private lateinit var sharedModel: SharedModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
//        sharedModel = ViewModelProvider(requireActivity()).get(SharedModel :: class.java)
//
//        list = ArrayList()
//        list.add(PopularModel(R.drawable.pop_menu_burger, foodName = "Sandwich", foodPrice = 3,3, 1))
//        list.add(PopularModel(R.drawable.pop_menu_momo, foodName = "Double Burger", foodPrice = 9,9, 1))
//        list.add(PopularModel(R.drawable.pop_menu_sandwich, foodName = "Khinkali", foodPrice = 5,5, 1))
//
//        popularAdapter = PopularAdapter(requireContext(), list)
//        popularAdapter.setSharedModel(sharedModel)
//
//        binding.historyRv.layoutManager = LinearLayoutManager(requireContext())
//        binding.historyRv.adapter = popularAdapter

        return binding.root
    }
}