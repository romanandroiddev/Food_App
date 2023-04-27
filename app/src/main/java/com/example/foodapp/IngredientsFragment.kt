package com.example.foodapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.foodapp.databinding.FragmentIngredientsBinding

class IngredientsFragment: Fragment(R.layout.fragment_ingredients) {
    lateinit var binding: FragmentIngredientsBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentIngredientsBinding.bind(view)
    }
}