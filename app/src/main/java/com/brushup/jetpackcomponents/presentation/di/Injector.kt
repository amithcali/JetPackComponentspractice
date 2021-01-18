package com.brushup.jetpackcomponents.presentation.di

import com.brushup.jetpackcomponents.presentation.di.movie.MovieSubComponent
import com.brushup.jetpackcomponents.presentation.di.tvshow.TvShowSubComponent


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
   fun createTvShowSubComponent(): TvShowSubComponent
   fun createArtistSubComponent():ArtistSubComponent
}