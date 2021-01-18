package com.brushup.jetpackcomponents.data.repository.artist.datasourceImpl


import com.brushup.jetpackcomponents.data.db.ArtistDao
import com.brushup.jetpackcomponents.data.repository.artist.datasource.ArtistLocalDataSource
import com.brushup.jetpackcomponents.model.artist.Artist
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArtistLocalDataSourceImpl(private val artistDao: ArtistDao):
    ArtistLocalDataSource {
    override suspend fun getArtistsFromDB(): List<Artist> {
       return artistDao.getArtists()
    }

    override suspend fun saveArtistsToDB(artists: List<Artist>) {
        CoroutineScope(Dispatchers.IO).launch {
            artistDao.saveArtists(artists)
        }
    }

    override suspend fun clearAll() {
       CoroutineScope(Dispatchers.IO).launch {
           artistDao.deleteAllArtists()
       }
    }
}