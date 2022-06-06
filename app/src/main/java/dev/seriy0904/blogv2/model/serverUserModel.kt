package dev.seriy0904.blogv2.model

import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList

data class serverUserModel(
    val login: String,
    val username: String,
    val photoUrl: String,
    val password: String
) : Serializable
