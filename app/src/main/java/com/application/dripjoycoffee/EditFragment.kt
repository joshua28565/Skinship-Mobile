package com.application.dripjoycoffee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.dripjoycoffee.databinding.FragmentEditBinding
import com.application.dripjoycoffee.databinding.FragmentProfileBinding

class EditFragment : Fragment() {

    private lateinit var binding: FragmentEditBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEditBinding.inflate(inflater,container,false)
        binding.save.setOnClickListener {
            findNavController().navigate(R.id.action_editFragment_to_profileFragment)
        }
        return binding.root
    }

}