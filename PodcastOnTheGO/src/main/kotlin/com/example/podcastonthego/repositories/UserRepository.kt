

package com.example.podcastonthego.repositories


import com.example.podcastonthego.dto.CreateUserRequest
import com.example.podcastonthego.models.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {

}