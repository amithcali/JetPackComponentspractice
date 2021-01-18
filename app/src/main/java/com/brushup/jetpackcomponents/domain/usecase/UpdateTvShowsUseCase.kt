package com.brushup.jetpackcomponents.domain.usecase

import com.brushup.jetpackcomponents.domain.repository.TvShowRepository
import com.brushup.jetpackcomponents.model.tvshow.TvShow


class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}