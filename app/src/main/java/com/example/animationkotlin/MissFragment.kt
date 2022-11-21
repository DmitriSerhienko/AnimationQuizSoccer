package com.example.animationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.animationkotlin.databinding.FragmentGoalBinding
import com.example.animationkotlin.databinding.FragmentMissBinding


class MissFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentMissBinding>(
            inflater, R.layout.fragment_miss, container, false)

        binding.oneMoreTimeM.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_missFragment_to_quizFragment)
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Qiuz"

        return binding.root
    }

}