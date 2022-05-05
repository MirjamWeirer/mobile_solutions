package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.navigation.databinding.FragmentStartScreenBinding

/**
 * Start screen
 */
class StartScreenFragment : Fragment() {

    private lateinit var binding:FragmentStartScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartScreenBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
//        val startButton: TextView? = activity?.findViewById(R.id.startQuizButton)
//        val startButtonViaBinding = binding.startQuizButton
        binding.startQuizButton.setOnClickListener {
            val navigationController = findNavController()
            navigationController.navigate(R.id.action_startScreenFragment_to_categoryScreenFragment)
        }
    }
}