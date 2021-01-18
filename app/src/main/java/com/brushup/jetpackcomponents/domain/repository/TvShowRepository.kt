package com.brushup.jetpackcomponents.domain.repository

import com.brushup.jetpackcomponents.model.tvshow.TvShow


interface TvShowRepository {
    suspend fun getTvShows():List<TvShow>?
    suspend fun updateTvShows():List<TvShow>?
}