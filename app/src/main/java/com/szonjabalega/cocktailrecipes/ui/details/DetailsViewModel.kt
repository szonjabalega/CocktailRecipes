package com.szonjabalega.cocktailrecipes.ui.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailsViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Details page dummy live data"
    }
    val text: LiveData<String> = _text
}