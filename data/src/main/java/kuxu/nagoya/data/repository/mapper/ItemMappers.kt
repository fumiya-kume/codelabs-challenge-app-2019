package kuxu.nagoya.data.repository.mapper

import kuxu.nagoya.data.api.response.Item
import kuxu.nagoya.data.repository.entity.Comment
import kuxu.nagoya.data.repository.entity.Story
import java.util.*

// TODO: 2.Implement mapper functions

fun Item.toStory(): Story = TODO("Implement this method")

fun Item.toComment(
    comments: List<Comment>
): Comment = Comment(
    author = author,
    id = id,
    comments = comments,
    text = text ?: "",
    time = Date(time * 1000)
)