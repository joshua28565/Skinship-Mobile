package com.application.dripjoycoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.dripjoycoffee.databinding.FragmentSignup1Binding
import com.application.dripjoycoffee.databinding.FragmentSignup2Binding

class Signup2Fragment : Fragment() {

    private lateinit var binding: FragmentSignup2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignup2Binding.inflate(inflater,container,false)
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_signup2Fragment2_to_signup1Fragment2)
        }
        binding.start.setOnClickListener {
            findNavController().navigate(R.id.action_signup2Fragment2_to_loginFragment)
        }
        binding.Login.setOnClickListener {
            findNavController().navigate(R.id.action_signup2Fragment2_to_loginFragment)
        }
        return binding.root
    }

}