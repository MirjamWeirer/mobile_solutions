package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentCategoryScreenBinding

/**
 * Category screen
 */
class categoryScreenFragment : Fragment() {

    private lateinit var binding: FragmentCategoryScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoryScreenBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.computerCategoryButton.setOnClickListener {
            val navigationController = findNavController()
            navigationController.navigate(R.id.action_categoryScreenFragment_to_gameScreenFragment)
        }
        binding.generalCategoryButton.setOnClickListener {
            val navigationController = findNavController()
            navigationController.navigate(R.id.action_categoryScreenFragment_to_gameScreenFragment)
        }
        binding.historyCategoryButton.setOnClickListener {
            val navigationController = findNavController()
            navigationController.navigate(R.id.action_categoryScreenFragment_to_gameScreenFragment)
        }
        binding.scienceCategoryButton.setOnClickListener {
            val navigationController = findNavController()
            navigationController.navigate(R.id.action_categoryScreenFragment_to_gameScreenFragment)
        }
    }

}