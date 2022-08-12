package com.example.podcastonthego.repositories

import com.example.podcastonthego.models.Episode
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface EpisodeRepository: JpaRepository<Episode, Long>{
}


