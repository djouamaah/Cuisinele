package com.example.cuisinele

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cuisinele.databinding.FailurePageBinding

/**
 * Fragment class for the failure page.
 */
class Failure : Fragment() {

    private var _binding: FailurePageBinding? = null

    //This property is only valid between onCreateView and onDestroyView
    private val binding get() = _binding!!

    /**
     * Method creates and returns the view hierarchy associated with this fragment and inflates the page to be viewed.
     *
     * @return the full xml page to be displayed.
     */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FailurePageBinding.inflate(inflater, container, false)
        setContinue()
        return binding.root
    }


    /**
     * Displays the continue button if the game is not restricted to daily mode.
     */
    private fun setContinue() {
        binding.continueButton.setOnClickListener{
            if(!Settings.dailyGames) {
                binding.continueButton.visibility = View.VISIBLE
            }
        }
    }

    /**
     * Method destroys the view and unsets the binding variable.
     */
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}