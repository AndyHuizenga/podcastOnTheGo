package com.example.podcastonthego.models


import javax.persistence.*


@Entity
data class User(
    @Id
    @GeneratedValue
    var id: Long,
    var name: String,
    var password: String,


    )
{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_podcasts_list",
        joinColumns = [JoinColumn(name = "users_id",
            referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name ="podcasts_list_id",
            referencedColumnName = "id")])
    var podcastsList: List<Podcast> = listOf()



}