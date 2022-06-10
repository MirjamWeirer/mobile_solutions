package at.campus02.mob.quizgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import at.campus02.mob.quizgame.databinding.FragmentCategoryScreenBinding
import at.campus02.mob.quizgame.databinding.FragmentStartBinding


class CategoryScreenFragment : Fragment() {
    private lateinit var binding: FragmentCategoryScreenBinding
    private val gameViewModel: GameViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCategoryScreenBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.historyCategoryButton.setOnClickListener {
            findNavController().navigate(R.id.action_categoryScreenFragment_to_gameFragment)
               gameViewModel.start()
        }
    }
}