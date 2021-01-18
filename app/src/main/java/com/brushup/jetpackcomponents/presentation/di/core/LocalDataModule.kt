package com.brushup.jetpackcomponents.presentation.di.core


import com.brushup.jetpackcomponents.data.db.ArtistDao
import com.brushup.jetpackcomponents.data.db.MovieDao
import com.brushup.jetpackcomponents.data.db.TvShowDao
import com.brushup.jetpackcomponents.data.repository.artist.datasource.ArtistLocalDataSource
import com.brushup.jetpackcomponents.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.brushup.jetpackcomponents.data.repository.movie.datasource.MovieLocalDataSource
import com.brushup.jetpackcomponents.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.brushup.jetpackcomponents.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.brushup.jetpackcomponents.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}