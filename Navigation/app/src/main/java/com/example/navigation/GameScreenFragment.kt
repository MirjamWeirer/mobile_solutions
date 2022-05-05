package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.navigation.databinding.FragmentGameScreenBinding


/**
 * Game screen.
 */
class GameScreenFragment : Fragment() {
    private lateinit var binding: FragmentGameScreenBinding
//    private val viewModel: QuizViewModel by
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameScreenBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
//        view
        binding.questionText.text ="..."
    }
}