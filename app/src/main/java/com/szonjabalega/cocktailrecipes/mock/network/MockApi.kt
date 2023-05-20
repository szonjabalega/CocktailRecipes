package com.szonjabalega.cocktailrecipes.mock.network


import com.szonjabalega.cocktailrecipes.network.apis.CocktailsApi
import com.szonjabalega.cocktailrecipes.network.models.Cocktail
import retrofit2.Response

class MockApi: CocktailsApi {
    override suspend fun handleGetRecipes(): Response<Array<Cocktail>> {
        TODO("Not yet implemented")
    }

    override suspend fun handleGetRandomRecipe(): Response<Array<Cocktail>> {
        TODO("Not yet implemented")
    }

    override suspend fun handlePostRecipe(cocktail: Cocktail) {
        TODO("Not yet implemented")
    }
}