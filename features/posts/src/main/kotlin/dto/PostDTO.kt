package dto

data class PostDTO(
    val id: Long? = null,
    val name: String,
    val prompt: String,
    val photoUrl: String
)