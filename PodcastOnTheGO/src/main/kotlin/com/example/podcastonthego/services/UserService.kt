package com.example.podcastonthego.services


import com.example.podcastonthego.dto.CreateUserRequest
import com.example.podcastonthego.models.User
import com.example.podcastonthego.repositories.PodcastRepository
import com.example.podcastonthego.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository
    @Autowired
    lateinit var podcastRepository: PodcastRepository

    fun User.toView() =
        CreateUserRequest( id ,name, password, podcastsList.map { it.podcastName })

    fun saveUser(u: CreateUserRequest): CreateUserRequest {
        val newUser = User(id = u.id, name = u.name, password = u.password)



        val podcast = podcastRepository.findById(1)

        return userRepository.save(
            newUser.copy(
                podcastsList = newUser.podcastsList.plus(podcast)
            )
        ).toView()


    }



    fun getAllUsers(): MutableList<User>{
        return userRepository.findAll()
    }

}