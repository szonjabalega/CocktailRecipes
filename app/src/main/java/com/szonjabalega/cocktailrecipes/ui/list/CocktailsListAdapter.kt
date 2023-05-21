package com.szonjabalega.cocktailrecipes.ui.list

import android.content.Context
import android.database.DataSetObserver

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cocktailrecipes.databinding.CocktailListItemBinding
import com.squareup.picasso.Picasso
import com.szonjabalega.cocktailrecipes.model.Cocktails

class CocktailsListAdapter(private val context: Context) : ListAdapter<Cocktails, CocktailsListAdapter.ViewHolder>(itemCallback) {

    private var cocktailList = mutableListOf<Cocktails>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CocktailListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cocktailList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = cocktailList.size

    inner class ViewHolder(private val binding: CocktailListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Cocktails) {
            Picasso.get().load(item.image).into(binding.cocktailImage)
            binding.cocktailName.text = item.name
        }
    }

    companion object {
        object itemCallback : DiffUtil.ItemCallback<Cocktails>() {
            override fun areItemsTheSame(oldItem: Cocktails, newItem: Cocktails): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Cocktails, newItem: Cocktails): Boolean {
                return oldItem == newItem
            }

        }
    }
}