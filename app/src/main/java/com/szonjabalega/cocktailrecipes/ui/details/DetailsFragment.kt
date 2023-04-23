package com.szonjabalega.cocktailrecipes.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val detailsViewModel = ViewModelProvider(this)[DetailsViewModel::class.java]
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}