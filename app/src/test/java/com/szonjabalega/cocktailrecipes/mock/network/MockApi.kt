package com.szonjabalega.cocktailrecipes.mock.network

import com.szonjabalega.cocktailrecipes.network.apis.CocktailsApi
import com.szonjabalega.cocktailrecipes.network.models.Cocktail
import retrofit2.Response

class MockApi: CocktailsApi {
    override suspend fun handleGetRecipes(): Response<Array<Cocktail>> {
        val c = Cocktail(
            idDrink = 1, strDrink = "Gin&Tonic",
            strDrinkAlternate = null, strTags = null, strVideo  = null,
            strCategory = null, strIBA = null, strAlcoholic = "Alcoholic",
            strGlass = "Roundish glass",
            strInstructions = "Mix the ingredients together, then add to a glass of ice. Add toppings that match your taste.",
            strInstructionsES = null, strInstructionsDE = null,strInstructionsFR = null,strInstructionsIT = null,
            strInstructionsZHHANS = null, strInstructionsZHHANT = null, strDrinkThumb = null, strIngredient1 = "Gin",
            strIngredient2 = "Tonic", strIngredient3 = null, strIngredient4 = null, strIngredient5 = null, strIngredient6 = null,
            strIngredient7 = null, strIngredient8 = null, strIngredient9 = null, strIngredient10 = null, strIngredient11 = null,
            strIngredient12 = null, strIngredient13 = null, strIngredient14 = null, strIngredient15 = null,
            strMeasure1 = "one shot", strMeasure2 = "250ml", strMeasure3 = null, strMeasure4 = null, strMeasure5 = null,
            strMeasure6 = null, strMeasure7 = null, strMeasure8 = null, strMeasure9 = null, strMeasure10 = null,
            strMeasure11 = null, strMeasure12 = null, strMeasure13 = null, strMeasure14 = null, strMeasure15 = null,
            strImageSource = null, strImageAttribution = null, strCreativeCommonsConfirmed = null, dateModified = null)
        var cocktails: Array<Cocktail> = emptyArray()
        cocktails += c
        return Response.success(cocktails)
    }

    override suspend fun handleGetRandomRecipe(): Response<Cocktail> {
        return Response.success(Cocktail(
            idDrink = 1, strDrink = "Gin&Tonic",
            strDrinkAlternate = null, strTags = null, strVideo  = null,
            strCategory = null, strIBA = null, strAlcoholic = "Alcoholic",
            strGlass = "Roundish glass",
            strInstructions = "Mix the ingredients together, then add to a glass of ice. Add toppings that match your taste.",
            strInstructionsES = null, strInstructionsDE = null,strInstructionsFR = null,strInstructionsIT = null,
            strInstructionsZHHANS = null, strInstructionsZHHANT = null, strDrinkThumb = null, strIngredient1 = "Gin",
            strIngredient2 = "Tonic", strIngredient3 = null, strIngredient4 = null, strIngredient5 = null, strIngredient6 = null,
            strIngredient7 = null, strIngredient8 = null, strIngredient9 = null, strIngredient10 = null, strIngredient11 = null,
            strIngredient12 = null, strIngredient13 = null, strIngredient14 = null, strIngredient15 = null,
            strMeasure1 = "one shot", strMeasure2 = "250ml", strMeasure3 = null, strMeasure4 = null, strMeasure5 = null,
            strMeasure6 = null, strMeasure7 = null, strMeasure8 = null, strMeasure9 = null, strMeasure10 = null,
            strMeasure11 = null, strMeasure12 = null, strMeasure13 = null, strMeasure14 = null, strMeasure15 = null,
            strImageSource = null, strImageAttribution = null, strCreativeCommonsConfirmed = null, dateModified = null))
    }

    override suspend fun handlePostRecipe(cocktail: Cocktail) {
        //
    }
}