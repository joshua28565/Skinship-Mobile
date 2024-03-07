package com.application.dripjoycoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.dripjoycoffee.databinding.FragmentEspressoBinding

class EspressoFragment : Fragment() {

    private lateinit var binding: FragmentEspressoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEspressoBinding.inflate(inflater,container,false)
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_espressoFragment_to_homeFragment)
        }
        return binding.root
    }

}