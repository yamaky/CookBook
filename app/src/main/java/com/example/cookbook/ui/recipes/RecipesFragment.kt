package com.example.cookbook.ui.recipes

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cookbook.R
import com.example.cookbook.additional.ShopCartRecyclerAdapter
import com.example.cookbook.databinding.RecipesFragmentBinding
import com.example.cookbook.databinding.ShopCartFragmentBinding

class RecipesFragment : Fragment() {

    private var _binding: RecipesFragmentBinding? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = RecipesFragment()
    }

    private lateinit var viewModel: RecipesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(RecipesViewModel::class.java)
        _binding = RecipesFragmentBinding.inflate(inflater, container, false)
        binding.ingredientsRecycler.layoutManager = object :
            LinearLayoutManager(requireContext()) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }
        binding.ingredientsRecycler.adapter = ShopCartRecyclerAdapter(viewModel.ingredients.value!!)
        return binding.root
    }
}