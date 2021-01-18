package com.brushup.jetpackcomponents.presentation.di


import com.brushup.jetpackcomponents.domain.usecase.GetArtistsUseCase
import com.brushup.jetpackcomponents.domain.usecase.UpdateArtistsUseCase
import com.brushup.jetpackcomponents.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}