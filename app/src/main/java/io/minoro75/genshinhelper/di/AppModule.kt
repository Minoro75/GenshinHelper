package io.minoro75.genshinhelper.di


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.minoro75.genshinhelper.data.assets.en.AssetsDataSource
import io.minoro75.genshinhelper.data.assets.pt.AssetsDataSourcePt
import io.minoro75.genshinhelper.data.assets.ru.AssetsDataSourceRu
import io.minoro75.genshinhelper.data.assets.uk.AssetsDataSourceUk
import io.minoro75.genshinhelper.data.repository.CharactersRepositoryImpl
import io.minoro75.genshinhelper.domain.repository.CharactersRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideAssetsDataSource() =
        AssetsDataSource()

    @Provides
    fun provideAssetsDataSourceRu() =
        AssetsDataSourceRu()

    @Provides
    fun provideAssetsDataSourceUk() =
        AssetsDataSourceUk()

    @Provides
    fun provideAssetsDataSourcePt() =
        AssetsDataSourcePt()

    @Provides
    @Singleton
    fun provideCharacterRepository(
        assetsDataSource: AssetsDataSource,
        assetsDataSourceRu: AssetsDataSourceRu,
        assetsDataSourceUk: AssetsDataSourceUk,
        assetsDataSourcePt: AssetsDataSourcePt
    ): CharactersRepository =
        CharactersRepositoryImpl(
            assetsDataSource,
            assetsDataSourceRu,
            assetsDataSourceUk,
            assetsDataSourcePt
        )
}
