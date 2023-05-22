package com.szonjabalega.cocktailrecipes

import com.szonjabalega.cocktailrecipes.mock.network.MockApi
import com.szonjabalega.cocktailrecipes.mock.persistence.MockCocktailsDao
import com.szonjabalega.cocktailrecipes.persistence.Cocktail
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.*

class TestCocktailsApp {
    private lateinit var daoMock: MockCocktailsDao
    private lateinit var apiMock: MockApi

    @Before
    fun before() {
        daoMock = MockCocktailsDao()
        apiMock = MockApi()
    }

    @After
    fun after() {
        daoMock.deleteAll()
    }

    @Test
    fun TestCocktailAddMock() {
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
        daoMock.insertAll(c)
        val list = daoMock.getAll()
        assert(list.size == 1)
        assert(list[0] == c)
    }

    @Test
    fun TestRecipeDeleteAllMock() {
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
        daoMock.insertAll(c)
        var list = daoMock.getAll()
        assert(list.size == 1)
        assert(list[0] == c)
        daoMock.deleteAll()
        list = daoMock.getAll()
        assert(list.size == 0)
    }


    @Test
    fun TestRecipeGet() = runBlocking {
        val cocktails = apiMock.handleGetRecipes().body()
        assert(cocktails!!.size == 1)
        assert(cocktails[0].idDrink!! == 1L)
    }

    @Test
    fun TestRandomRecipe() = runBlocking {
        val quotes = apiMock.handleGetRandomRecipe().body()
        assert(quotes!!.idDrink == 1L)
    }
}