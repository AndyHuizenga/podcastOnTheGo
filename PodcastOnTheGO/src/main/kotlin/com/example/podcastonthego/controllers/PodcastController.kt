package com.example.podcastonthego.controllers


import com.example.podcastonthego.dto.NewEpisodeRequest
import com.example.podcastonthego.dto.NewPodcastRequest
import com.example.podcastonthego.dto.SeeEpisodeRequest
import com.example.podcastonthego.models.Episode
import com.example.podcastonthego.models.Podcast
import com.example.podcastonthego.services.PodcastService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("podcast")
class PodcastController {

    @Autowired
    lateinit var podcastService: PodcastService

    @PostMapping
    fun newEpisode(@RequestBody ner: NewEpisodeRequest): Episode {
        return podcastService.saveNewEpisode(ner)
    }

    @GetMapping("episodes")
    fun getAllEpisodes(): MutableList<Episode> {
        return podcastService.getAllEpisodes()
    }

    @GetMapping("allEpisodes")
    fun seeAllEpisodes(): List<SeeEpisodeRequest> {
        var allEpisodes = podcastService.getAllEpisodes()
        return convertList(allEpisodes);
    }

    fun convertList(list: MutableList<Episode>): List<SeeEpisodeRequest> {
        var allEpisodeList = mutableListOf<SeeEpisodeRequest>();
        for (e in list) {
            allEpisodeList.add(
                SeeEpisodeRequest(
                    episodeName = e.episodeName,
                    userId = e.id,
                    podcastId = e.id,
                    audio_location = e.audio_location
                )
            )
        }
return allEpisodeList
    }


    @GetMapping("podcasts")
    fun getAllPodcasts(): MutableList<Podcast> {
        return podcastService.getAllPodcast()
    }

    @PostMapping("newPodcast")
    fun newPodcast(@RequestBody npr: NewPodcastRequest): Podcast {
        return podcastService.saveNewPodcast(npr)
    }

}






