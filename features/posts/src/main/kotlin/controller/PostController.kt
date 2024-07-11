package controller

import com.bytebard.models.Post
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1/posts")
class PostController {

    @GetMapping
    fun getPosts(): ResponseEntity<List<Post>> {
        return ResponseEntity.of(Optional.of(emptyList<Post>()))
    }
}