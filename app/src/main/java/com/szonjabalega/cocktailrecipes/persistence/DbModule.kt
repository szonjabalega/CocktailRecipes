package com.szonjabalega.cocktailrecipes.persistence

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
abstract class DbModule {
    companion object {
        private const val DB_NAME = "cocktails.db"

        @Provides
        @Singleton
        fun providesCocktailsDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DB_NAME)
                .fallbackToDestructiveMigration()
                .build()
        }

        @Provides
        @Singleton
        fun providesCocktailsDao(appDatabase: AppDatabase) = appDatabase.cocktailDao()
    }
}