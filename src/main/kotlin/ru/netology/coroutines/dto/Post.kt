package ru.netology.coroutines.dto

data class Post(
    val id: Long,
    val authorId: Long,
    var author: String,
    var avatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)
