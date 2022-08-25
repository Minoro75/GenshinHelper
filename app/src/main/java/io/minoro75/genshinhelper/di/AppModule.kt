package io.minoro75.genshinhelper.di


import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.minoro75.genshinhelper.data.assets.AssetsDataSource
import io.minoro75.genshinhelper.data.repository.CharactersRepositoryImpl
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideMoshi(): Moshi =
        Moshi.Builder().build()

    @Provides
    @Singleton
    fun provideAssetsDataSource(moshi: Moshi) =
        AssetsDataSource(moshi)

    @Provides
    @Singleton
    fun provideCharacterRepository(assetsDataSource: AssetsDataSource): CharactersRepository =
        CharactersRepositoryImpl(assetsDataSource)
}
