package com.szonjabalega.cocktailrecipes.persistence


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

    @Dao
interface CocktailsDao {
    @Query("SELECT * FROM cocktail")
    fun getAll(): List<Cocktail>

    @Insert
    fun insertAll(vararg quotes: Cocktail)
    @Query("DELETE FROM cocktail")
    fun deleteAll()
}
