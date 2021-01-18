package com.brushup.jetpackcomponents.presentation.di.core


import com.brushup.jetpackcomponents.data.repository.artist.datasource.ArtistCacheDataSource
import com.brushup.jetpackcomponents.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.brushup.jetpackcomponents.data.repository.movie.datasource.MovieCacheDataSource
import com.brushup.jetpackcomponents.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.brushup.jetpackcomponents.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.brushup.jetpackcomponents.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}