package com.example.podcastonthego.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

import javax.persistence.ManyToOne


@Entity
data class Episode (
    @Id
    @GeneratedValue
    var id:Long= -1,
    var episodeName: String,
    var audio_location: String,
){

    @ManyToOne
    open lateinit var inPodcast: Podcast

    @ManyToOne
    open lateinit var createdByUser: User



}