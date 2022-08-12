package com.example.podcastonthego.services

import com.example.podcastonthego.dto.CreateEpisodeRequest
import com.example.podcastonthego.models.Episode
import com.example.podcastonthego.repositories.EpisodeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EpisodeService {
    @Autowired
    lateinit var episodeRepository: EpisodeRepository
    fun saveEpisode(e: CreateEpisodeRequest): Episode{
        val newEpisode = Episode(episodeName = e.episodeName, audio_location = e.audio_location)
        return episodeRepository.save(newEpisode)
    }

    fun getAllEpisode(): MutableList<Episode>{
        return episodeRepository.findAll()
    }

}
