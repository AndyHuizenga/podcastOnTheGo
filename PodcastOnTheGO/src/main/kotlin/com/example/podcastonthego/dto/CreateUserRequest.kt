package com.example.podcastonthego.dto

import com.example.podcastonthego.models.User

data class CreateUserRequest(
    var id:Long,
    var name: String,
    var password: String,
    val podcastCreated: Iterable<String>
){



}

