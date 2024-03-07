package com.application.dripjoycoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.dripjoycoffee.databinding.FragmentSettingsBinding
import com.application.dripjoycoffee.databinding.FragmentSignup1Binding

class Signup1Fragment : Fragment() {

    private lateinit var binding: FragmentSignup1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignup1Binding.inflate(inflater,container,false)
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_signup1Fragment2_to_loginFragment)
        }
        binding.next.setOnClickListener {
            findNavController().navigate(R.id.action_signup1Fragment2_to_signup2Fragment2)
        }
        return binding.root
    }

}