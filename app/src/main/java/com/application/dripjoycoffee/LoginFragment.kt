package com.application.dripjoycoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.dripjoycoffee.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater,container,false)
        binding.login.setOnClickListener {

            val nickname = binding.Nickname.text.toString()

            if(nickname.equals("") && binding.password.text.toString().equals("")){
                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            }

        }
        binding.signup.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signup1Fragment2)
        }
        binding.back.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_diamondFragment)
        }
        return binding.root
    }

}