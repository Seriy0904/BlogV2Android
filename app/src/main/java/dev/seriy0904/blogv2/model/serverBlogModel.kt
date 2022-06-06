package dev.seriy0904.blogv2.model

import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList

data class serverBlogModel(
    val uuid: UUID,
    val description: String,
    val timelong: Long,
    val tittle: String,
    val login:String,
    val username:String,
    val photosurl: ArrayList<String>?
):Serializable
