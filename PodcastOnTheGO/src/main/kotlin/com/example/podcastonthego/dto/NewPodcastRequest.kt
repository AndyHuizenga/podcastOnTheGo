package com.example.podcastonthego.dto

import com.example.podcastonthego.models.Podcast

class NewPodcastRequest(
    val id: Long = -1,
    var podcastName: String,
    var createdByUser: String,
    var coverIMG: String,
    var file_location: String,
  var ListAdmin: List<String>
        ){

fun Podcast.toView() = NewPodcastRequest(id, podcastName, createdByUser,coverIMG,file_location, admins!!.map { it.name } )

}