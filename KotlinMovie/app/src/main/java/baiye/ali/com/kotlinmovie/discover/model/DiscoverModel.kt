package baiye.ali.com.kotlinmovie.discover.model

import baiye.ali.com.kotlinmovie.discover.bean.DiscoverBean
import baiye.ali.com.kotlinmovie.net.Api
import baiye.ali.com.kotlinmovie.net.ApiService
import baiye.ali.com.kotlinmovie.net.Retrofitutil
import io.reactivex.Flowable

/**
 * Created by dy on 2017/12/27.
 */

class DiscoverModel {

    fun DiscoverM() : Flowable<DiscoverBean>{
        val instance = Retrofitutil.getInstance(Api.BASE_URL)
        val apiService = instance.create(ApiService::class.java)
        val flowable = apiService!!.getDiscoverData()
        return flowable
    }
}