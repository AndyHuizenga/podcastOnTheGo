package com.example.podcastonthego.dto

data class SeeEpisodeRequest(
    val episodeName: String,
    val userId: Long,
    val podcastId: Long,
    val audio_location: String
)
