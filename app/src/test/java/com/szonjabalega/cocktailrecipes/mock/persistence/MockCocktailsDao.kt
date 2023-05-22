package com.szonjabalega.cocktailrecipes.mock.persistence

import com.szonjabalega.cocktailrecipes.persistence.Cocktail
import com.szonjabalega.cocktailrecipes.persistence.CocktailsDao

class MockCocktailsDao: CocktailsDao {
    companion object {
        private val  cocktails = mutableListOf<Cocktail>()
    }

    override fun getAll(): List<Cocktail> {
        return cocktails;
    }

    override fun insertAll(vararg cocktailsIn: Cocktail) {
        cocktailsIn.forEach {
            cocktails.add(it)
        }
    }
    override fun deleteAll() {
        cocktails.clear()
    }
}