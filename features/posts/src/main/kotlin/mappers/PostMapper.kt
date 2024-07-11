package mappers

import com.bytebard.dto.CreatePostRequest
import dto.PostDTO
import com.bytebard.models.Post

class PostMapper {

    fun createPostRequestToPost(createPostRequest: CreatePostRequest): Post {
        return Post()
    }

    fun postToPostDTO(post: Post): PostDTO {
        return PostDTO(
            id = post.id,
            name = post.name ?: "",
            prompt = post.prompt ?: "",
            photoUrl = post.photoUrl ?: ""
        )
    }
}