package com.bwie.sctouxiang

import io.reactivex.Flowable
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiServices {

    //上传头像
    //https://www.zhaoapi.cn/file/upload

    @Multipart
    @POST("file/upload")
    fun uploadPic(@Part("uid") uid: RequestBody, @Part file: MultipartBody.Part): Call<ResultBean>

    @GET("user/getUserInfo?uid=552&token=4B5DAF274221936555E01E5F7BC271F4")
    fun getdd(): Flowable<UserBean>
}
