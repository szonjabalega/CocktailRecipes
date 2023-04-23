package com.szonjabalega.cocktailrecipes.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.szonjabalega.cocktailrecipes.ui.details.DetailsViewModel

class CocktailsListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val cocktailsListViewModel = ViewModelProvider(this)[CocktailsListViewModel::class.java]
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}