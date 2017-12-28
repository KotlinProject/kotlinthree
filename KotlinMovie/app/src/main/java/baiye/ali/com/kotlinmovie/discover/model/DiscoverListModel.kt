package baiye.ali.com.kotlinmovie.discover.model

import baiye.ali.com.kotlinmovie.discover.bean.DiscoverlListBean
import baiye.ali.com.kotlinmovie.net.Api
import baiye.ali.com.kotlinmovie.net.ApiService
import baiye.ali.com.kotlinmovie.net.Retrofitutil
import io.reactivex.Flowable

/**
 * Created by dy on 2017/12/28.
 */
class DiscoverListModel {

    fun DiscoverListM(name : String) : Flowable<DiscoverlListBean> {
        val instance = Retrofitutil.getInstance(Api.BASE_URL)
        val apiService = instance.create(ApiService::class.java)
        val flowable=apiService!!.getDiscoverListData(name,"date","26868b32e808498db32fd51fb422d00175e179df","83")
        return flowable
    }
}