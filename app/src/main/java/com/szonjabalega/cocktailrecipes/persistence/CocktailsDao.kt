package com.szonjabalega.cocktailrecipes.persistence


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

    @Dao
interface CocktailsDao {
    @Query("SELECT * FROM cocktail")
    fun getAll(): List<Cocktail>

    @Insert
    fun insertAll(vararg quotes: Cocktail)
}
