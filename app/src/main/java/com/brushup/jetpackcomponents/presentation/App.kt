package com.brushup.jetpackcomponents.presentation

import android.app.Application
import com.brushup.jetpackcomponents.BuildConfig
import com.brushup.jetpackcomponents.presentation.di.ArtistSubComponent
import com.brushup.jetpackcomponents.presentation.di.Injector
import com.brushup.jetpackcomponents.presentation.di.core.*
import com.brushup.jetpackcomponents.presentation.di.movie.MovieSubComponent
import com.brushup.jetpackcomponents.presentation.di.tvshow.TvShowSubComponent

import javax.inject.Inject

class App : Application(), Injector {
private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
       return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}