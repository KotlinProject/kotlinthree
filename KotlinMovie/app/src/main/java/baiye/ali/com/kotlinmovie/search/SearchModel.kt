package baiye.ali.com.kotlinmovie.search

import baiye.ali.com.kotlinmovie.bean.SearchBean
import baiye.ali.com.kotlinmovie.net.Api
import baiye.ali.com.kotlinmovie.net.ApiService
import baiye.ali.com.kotlinmovie.net.Retrofitutil
import io.reactivex.Flowable

/**
 * Created by 31962 on 2017/12/28.
 */
class SearchModel {
    fun getdata(string: String):Flowable<SearchBean>{
        val retrofitutil = Retrofitutil.getInstance(Api.BASE_URL)
        val apiService = retrofitutil.create(ApiService::class.java)
        val flowable = apiService!!.getSearchData(10, string, 10)
        return flowable
    }
}