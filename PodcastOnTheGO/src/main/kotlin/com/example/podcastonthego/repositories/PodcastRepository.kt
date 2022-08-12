package com.example.podcastonthego.repositories

import com.example.podcastonthego.models.Podcast
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PodcastRepository : JpaRepository<Podcast, Long> {

    @Query("SELECT p FROM Podcast p WHERE p.podcastName =:name ")
    fun findByName(@Param("name") name: String): Optional <Podcast>

}