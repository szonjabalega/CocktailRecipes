package com.szonjabalega.cocktailrecipes.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = [Cocktail::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cocktailDao(): CocktailsDao
}