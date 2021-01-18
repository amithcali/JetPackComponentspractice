package com.brushup.jetpackcomponents.domain.repository

import com.brushup.jetpackcomponents.model.artist.Artist


interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}