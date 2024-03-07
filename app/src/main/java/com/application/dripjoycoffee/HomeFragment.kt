package com.application.dripjoycoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.dripjoycoffee.databinding.FragmentDiamondBinding
import com.application.dripjoycoffee.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.settings.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
        }
        binding.Latte.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_latteFragment)
        }
        binding.Americano.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_americanoFragment)
        }
        binding.Cappuccino.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_cappuccinoFragment)
        }
        binding.Espresso.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_espressoFragment)
        }
        binding.Macchiato.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_macchiatoFragment)
        }
        binding.Caramel.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_caramelFragment)
        }
        binding.Choco.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_chocoFragment)
        }
        binding.profile.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
        binding.logout.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_loginFragment)
        }
        return binding.root
    }

}