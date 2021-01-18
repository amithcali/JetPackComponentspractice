package com.brushup.jetpackcomponents.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.brushup.jetpackcomponents.domain.usecase.GetMoviesUseCase
import com.brushup.jetpackcomponents.domain.usecase.UpdateMoviesUsecase


class MovieViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUsecase: UpdateMoviesUsecase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MovieViewModel(getMoviesUseCase,updateMoviesUsecase) as T
    }
}

