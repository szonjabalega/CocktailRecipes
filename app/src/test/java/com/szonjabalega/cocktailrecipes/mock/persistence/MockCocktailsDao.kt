package com.szonjabalega.cocktailrecipes.mock.persistence

import com.szonjabalega.cocktailrecipes.persistence.Cocktail
import com.szonjabalega.cocktailrecipes.persistence.CocktailsDao

class MockCocktailsDao: CocktailsDao {
    override fun getAll(): List<Cocktail> {
        TODO("Not yet implemented")
    }

    override fun insertAll(vararg cocktails: Cocktail) {
        TODO("Not yet implemented")
    }
}