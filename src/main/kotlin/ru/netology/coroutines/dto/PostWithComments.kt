package ru.netology.coroutines.dto

import kotlinx.coroutines.Deferred

data class PostWithComments(
    val post: Post,
    //val author: Author,
    val comments: List<Comment>,
)
