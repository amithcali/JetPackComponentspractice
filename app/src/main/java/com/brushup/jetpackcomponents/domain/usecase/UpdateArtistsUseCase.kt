package com.brushup.jetpackcomponents.domain.usecase

import com.brushup.jetpackcomponents.domain.repository.ArtistRepository
import com.brushup.jetpackcomponents.model.artist.Artist


class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}