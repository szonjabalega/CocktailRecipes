package com.szonjabalega.cocktailrecipes.mock.persistence

import com.szonjabalega.cocktailrecipes.persistence.CocktailsDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MockDbModule {

    @Provides
    @Singleton
    fun providesQuotesDao(): CocktailsDao = MockCocktailsDao()
}