package com.brushup.jetpackcomponents.presentation.di.core


import com.brushup.jetpackcomponents.data.repository.artist.ArtistRepositoryImpl
import com.brushup.jetpackcomponents.data.repository.artist.datasource.ArtistCacheDataSource
import com.brushup.jetpackcomponents.data.repository.artist.datasource.ArtistLocalDataSource
import com.brushup.jetpackcomponents.data.repository.artist.datasource.ArtistRemoteDatasource
import com.brushup.jetpackcomponents.data.repository.movie.MovieRepositoryImpl
import com.brushup.jetpackcomponents.data.repository.movie.datasource.MovieCacheDataSource
import com.brushup.jetpackcomponents.data.repository.movie.datasource.MovieLocalDataSource
import com.brushup.jetpackcomponents.data.repository.movie.datasource.MovieRemoteDatasource
import com.brushup.jetpackcomponents.data.repository.tvshow.TvShowRepositoryImpl
import com.brushup.jetpackcomponents.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.brushup.jetpackcomponents.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.brushup.jetpackcomponents.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.brushup.jetpackcomponents.domain.repository.ArtistRepository
import com.brushup.jetpackcomponents.domain.repository.MovieRepository
import com.brushup.jetpackcomponents.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }

}