package com.example.cookbook.ui.category

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.cookbook.R
import com.example.cookbook.databinding.CategoryFragmentBinding
import com.example.cookbook.databinding.FragmentHomeBinding

class CategoryFragment : Fragment() {

    private var _binding: CategoryFragmentBinding? = null

    private val binding get() = _binding!!

    companion object {
        fun newInstance() = CategoryFragment()
    }

    private lateinit var viewModel: CategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = CategoryFragmentBinding.inflate(inflater, container, false)

        binding.buttonRecipes.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_categoryFragment_to_recipesFragment)
        }

        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CategoryViewModel::class.java)
        // TODO: Use the ViewModel
    }

}