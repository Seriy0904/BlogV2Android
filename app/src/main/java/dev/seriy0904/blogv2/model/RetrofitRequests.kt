package dev.seriy0904.blogv2.model

import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.http.*


interface RetrofitRequests {
    @POST("users/registration")
    @Headers("Content-type: application/json")
    suspend fun registration(@Body registrationData: serverUserModel): retrofit2.Response<ResponseBody>

    @POST("users/login")
    @Headers("Content-type: application/json")
    suspend fun login(@Body loginData: serverUserModel): retrofit2.Response<ResponseBody>

    @GET("blogs/all")
    @Headers("Content-type: application/json")
    suspend fun getAllBlog(): retrofit2.Response<List<serverBlogModel>>
}