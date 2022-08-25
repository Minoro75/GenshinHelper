package io.minoro75.genshinhelper.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.minoro75.genshinhelper.data.repository.CharactersRepositoryImpl
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import javax.inject.Singleton

/*
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(
        repository: CharactersRepositoryImpl
    ): CharactersRepository
}*/
