package com.example.podcastonthego.dto

data class NewEpisodeRequest(
    var podcastName: String,
    var UserId: Long,
    var EpisodeName: String,
    var audio_location: String

)
