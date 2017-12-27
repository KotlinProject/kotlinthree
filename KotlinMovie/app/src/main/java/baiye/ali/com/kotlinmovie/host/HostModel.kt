package baiye.ali.com.kotlinmovie.host

import baiye.ali.com.kotlinmovie.bean.HomeBean
import baiye.ali.com.kotlinmovie.net.Api
import baiye.ali.com.kotlinmovie.net.ApiService
import baiye.ali.com.kotlinmovie.net.Retrofitutil
import io.reactivex.Flowable

/**
 * Created by 31962 on 2017/12/27.
 */
class HostModel {

    fun Searchdata():Flowable<HomeBean>{
        val retrofitutil = Retrofitutil.getInstance(Api.BASE_URL)
        val service = retrofitutil.create(ApiService::class.java)
        val homeData = service!!.getHomeData()
        return homeData
    }

    /*fun Searchdata2():Flowable<>{

    }*/
}