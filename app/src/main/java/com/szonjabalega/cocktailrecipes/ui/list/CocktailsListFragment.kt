package com.szonjabalega.cocktailrecipes.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cocktailrecipes.databinding.FragmentCocktailsListBinding
import com.szonjabalega.cocktailrecipes.model.Cocktails

class CocktailsListFragment : Fragment() {
    private var _binding: FragmentCocktailsListBinding? = null
    private val binding get() = _binding!!
    private lateinit var cocktailsAdapter: CocktailsListAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCocktailsListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = listOf(
            Cocktails(1,"Margarita", "https://www.thecocktaildb.com/images/media/drink/6ty09d1504366461.jpg", "aaabbbb", "jcnsbkjcbsjbdc"),

            Cocktails(2,"Margarita", "https://www.thecocktaildb.com/images/media/drink/6ty09d1504366461.jpg", "aaabbbb", "jcnsbkjcbsjbdc"),

            Cocktails(3,"Margarita", "https://www.thecocktaildb.com/images/media/drink/6ty09d1504366461.jpg", "aaabbbb", "jcnsbkjcbsjbdc"),

            Cocktails(4,"Margarita", "https://www.thecocktaildb.com/images/media/drink/6ty09d1504366461.jpg", "aaabbbb", "jcnsbkjcbsjbdc")
            // Add more items as needed
        )

        cocktailsAdapter = CocktailsListAdapter(requireContext())
        binding.recyclerView.adapter = cocktailsAdapter
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}