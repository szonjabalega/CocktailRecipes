package com.szonjabalega.cocktailrecipes.model

data class Cocktails(
    val id: Number,
    val name: String,
    val image: String,
    val ingredients: String,
    val recipe: String
)