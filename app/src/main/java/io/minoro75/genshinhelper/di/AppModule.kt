package io.minoro75.genshinhelper.di


import com.squareup.moshi.Moshi
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
    fun provideMoshi(): Moshi =
        Moshi.Builder().build()

    @Provides
    fun provideAssetsDataSource(moshi: Moshi) =
        AssetsDataSource(moshi)

    @Provides
    fun provideAssetsDataSourceRu(moshi: Moshi) =
        AssetsDataSourceRu(moshi)

    @Provides
    fun provideAssetsDataSourceUk(moshi: Moshi) =
        AssetsDataSourceUk(moshi)

    @Provides
    fun provideAssetsDataSourcePt(moshi: Moshi) =
        AssetsDataSourcePt(moshi)

    @Provides
    @Singleton
    fun provideCharacterRepository(
        assetsDataSource: AssetsDataSource,
        assetsDataSourceRu: AssetsDataSourceRu,
        assetsDataSourceUk: AssetsDataSourceUk,
        assetsDataSourcePt: AssetsDataSourcePt
    ): CharactersRepository =
        CharactersRepositoryImpl(assetsDataSource, assetsDataSourceRu, assetsDataSourceUk,assetsDataSourcePt)
}
