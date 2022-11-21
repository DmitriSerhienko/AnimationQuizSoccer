package com.example.animationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.animationkotlin.databinding.FragmentWelcomeScreenBinding

class WelcomeScreenFrag : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Qiuz"
        val binding: FragmentWelcomeScreenBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_welcome_screen, container, false)


        binding.button.setOnClickListener {view: View ->
           Navigation.findNavController(view).navigate(R.id.action_welcomeScreenFrag2_to_quizFragment)
        }

        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Qiuz"
        return binding.root

    }


}