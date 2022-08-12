package com.example.podcastonthego.models
import javax.persistence.*


@Entity
 data class Podcast(
    @Id
    @GeneratedValue
    val id: Long = -1,
    var podcastName: String,
    var createdByUser: String,
    var coverIMG: String,
    var file_location: String,
){

    @JoinTable(
        name = "user_podcast_made_by",
        joinColumns = [JoinColumn(name="user_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "podcast_made_by_id", referencedColumnName = "id")]
    )

    @ManyToMany(mappedBy = "podcastsList", fetch = FetchType.EAGER)
    var admins: List<User> = listOf()

}