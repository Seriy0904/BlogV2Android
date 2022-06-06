package dev.seriy0904.blogv2.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.seriy0904.blogv2.model.RetrofitInstance
import dev.seriy0904.blogv2.model.serverBlogModel
import dev.seriy0904.blogv2.model.serverUserModel
import javax.net.ssl.HttpsURLConnection

class MainViewModel : ViewModel() {
    val modelList = MutableLiveData<List<serverBlogModel>>()
    val userData = MutableLiveData<serverUserModel>()
    suspend fun register(user: serverUserModel): Int {
        val code = RetrofitInstance.instance.registration(user).code()
        if (code == HttpsURLConnection.HTTP_CREATED) userData.value = user
        return code
    }

    suspend fun login(login: String, password: String): Int {
        val user = serverUserModel(login, "", "", password)
        val code = RetrofitInstance.instance.login(user).code()
        if (code == HttpsURLConnection.HTTP_CREATED) userData.value = user
        return code
    }

    suspend fun getAllBlogs(){
        val response = RetrofitInstance.instance.getAllBlog()
        if(response.code()==HttpsURLConnection.HTTP_OK){
            modelList.value = response.body()?: emptyList()
        }
    }
//    fun addBlog(newModelList: List<serverBlogModel>) {
//        modelList.value = newModelList
//    }
}