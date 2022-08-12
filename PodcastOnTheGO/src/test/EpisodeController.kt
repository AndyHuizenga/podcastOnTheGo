package com.example.podcastonthego.controllers

import com.example.podcastonthego.dto.CreateEpisodeRequest
import com.example.podcastonthego.models.Episode
import com.example.podcastonthego.services.EpisodeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("episodes")
class EpisodeController {

    @Autowired
    lateinit var service: EpisodeService

    @GetMapping
    fun index(): MutableList<Episode>{
        return service.getAllEpisode()

    }

    @PostMapping("add")
    fun newEpisode(@RequestBody e: CreateEpisodeRequest): Episode{
        return service.saveEpisode(e)
    }
}

