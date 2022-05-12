package at.campus02.mob.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import at.campus02.mob.viewmodel.databinding.FragmentStartBinding


/**
 * Start Screen
 */
class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(inflater)
        return binding.root
    }

    override fun onStart() {
        super.onStart()

        binding.startQuizButton.setOnClickListener {
            val navigationController = findNavController()
            navigationController.navigate(R.id.action_startFragment_to_gameFragment)
        }
    }
}

