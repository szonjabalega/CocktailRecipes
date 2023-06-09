/**
 * CocktailRecipe App
 * Cocktail application API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: szonja.balega@edu.bme.hu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.szonjabalega.cocktailrecipes.network.apis


import com.szonjabalega.cocktailrecipes.network.models.Cocktail
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface CocktailsApi{
//basePath: kotlin.String = "https://thecocktaildb.com/api/json/v1/1"
    /**
     * Add new cocktail recipe
     *
     * @param drink  (optional)
     * @return void
     */

    @POST("drink")
    suspend fun handlePostRecipe(drink: Cocktail)

    /**
     * Get random cocktail
     *
     * @return kotlin.Array<Cocktail>
     */
    @GET("/random.php")
    suspend fun handleGetRandomRecipe() : Response<Array<Cocktail>>
    /*RequestMethod.GET,
    "",*/

    /**
     * Get cocktail recipes starting with the letter S
     *
     * @return kotlin.Array<Cocktail>
     */
    @GET("/search.php=s")
    suspend fun handleGetRecipes() : Response<Array<Cocktail>>

    /*RequestMethod.GET,
    "/search.php?f&#x3D;s",*/

}
