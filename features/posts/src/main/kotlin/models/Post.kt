package com.bytebard.models

import jakarta.persistence.*

@Table(name = "Post")
@Entity
class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    var id: Long? = null

    @Column(name = "Prompt", columnDefinition = "text not null", nullable = false)
    var prompt: String? = null

    @Column(name = "Photo_Url", nullable = false)
    var photoUrl: String? = null

    @Column(name = "Name", nullable = false)
    var name: String? = null
}