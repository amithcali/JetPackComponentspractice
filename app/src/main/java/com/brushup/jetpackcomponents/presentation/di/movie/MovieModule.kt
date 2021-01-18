package com.brushup.jetpackcomponents.presentation.di.movie


import com.brushup.jetpackcomponents.domain.usecase.GetMoviesUseCase
import com.brushup.jetpackcomponents.domain.usecase.UpdateMoviesUsecase
import com.brushup.jetpackcomponents.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUsecase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}