package com.example.podcastonthego.controllers

import com.example.podcastonthego.dto.CreateUserRequest


import com.example.podcastonthego.models.User
import com.example.podcastonthego.services.UserService


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("user")
class UserController {

    @Autowired
    lateinit var service: UserService

    @GetMapping
    fun index(): MutableList<User>{
        return service.getAllUsers()

    }

    @PostMapping("add")
    fun addUser (@RequestBody u: CreateUserRequest): CreateUserRequest {
        return service.saveUser(u)
    }



}