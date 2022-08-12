package com.example.podcastonthego.services

import com.example.podcastonthego.dto.CreatePodcastRequest
import com.example.podcastonthego.models.Podcast
import com.example.podcastonthego.repositories.PodcastRepository
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.stereotype.Service

@Service
class PodcastService {

    @Autowired
    lateinit var podcastRepository: PodcastRepository



    fun savePodcast(p: CreatePodcastRequest): Podcast{
        val newPodcast = Podcast(podcastName = p.podcastName, createdByUser = p.createdByUser, coverIMG = p.coverIMG, file_location_ = p.file_location_)
        return podcastRepository.save(newPodcast)
    }

    fun getAllPodcasts(): MutableList<Podcast>{
        return podcastRepository.findAll()
    }
}