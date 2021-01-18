package com.brushup.jetpackcomponents.presentation.di.tvshow


import com.brushup.jetpackcomponents.domain.usecase.GetTvShowsUseCase
import com.brushup.jetpackcomponents.domain.usecase.UpdateTvShowsUseCase
import com.brushup.jetpackcomponents.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}