package com.szonjabalega.cocktailrecipes.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CocktailsListViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "Cocktails list dummy livedata"
    }
    val text: LiveData<String> = _text
}