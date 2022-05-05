package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation.databinding.FragmentCategoryScreenBinding

/**
 * Category screen
 */
class CategoryScreenFragment : Fragment() {

    private lateinit var binding: FragmentCategoryScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCategoryScreenBinding.inflate(inflater)
        return binding.root
    }


}