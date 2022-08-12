package com.example.podcastonthego.controllers


import com.example.podcastonthego.models.Podcast
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController


@Controller
class HTMLController {

    @GetMapping
    fun index(): String {
        return "Check!"
    }



    @GetMapping("/test")
    fun listStudents(model: Model): String {
        model.addAttribute("test", "this is coming from the controller")
        return "index"
    }

    @GetMapping("/podcastsTest")
    fun getAllPodcast(model: Model): String {
        val AllPodcasts =  listOf(
            Podcast(1,"TalkByNight", "Andy","img","pc"),
            Podcast(2,"TalkByMorning", "Andy","img","pc"),
            Podcast(3,"TalkByEvening", "Andy","img","pc")
        )
        model.addAttribute("allPodcastTest", AllPodcasts)
        return "index"
    }

    @GetMapping("2names/{param1}")
    fun names(@PathVariable param1: String, model: Model): String {
        val hello = "how are you $param1"
        model.addAttribute("littleSentence", hello)
        return "index"
    }
}