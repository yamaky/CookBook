package com.example.cookbook.ui.shop_cart

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cookbook.R
import com.example.cookbook.additional.ShopCartRecyclerAdapter
import com.example.cookbook.databinding.CategoryFragmentBinding
import com.example.cookbook.databinding.ShopCartFragmentBinding

class ShopCartFragment : Fragment() {

    private var _binding: ShopCartFragmentBinding? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = ShopCartFragment()
    }

    private lateinit var viewModel: ShopCartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ShopCartViewModel::class.java)
        _binding = ShopCartFragmentBinding.inflate(inflater, container, false)
        binding.shopCartRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.shopCartRecycler.adapter = ShopCartRecyclerAdapter(viewModel.ingredients.value!!)
        return binding.root
    }

}