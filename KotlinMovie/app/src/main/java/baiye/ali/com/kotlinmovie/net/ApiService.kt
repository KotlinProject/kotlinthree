package baiye.ali.com.kotlinmovie.net

import baiye.ali.com.kotlinmovie.bean.HomeBean
import baiye.ali.com.kotlinmovie.discover.bean.DiscoverBean
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by 31962 on 2017/12/27.
 */
interface ApiService {
    @GET("v2/feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun getHomeData():Flowable<HomeBean>

    @GET("v2/categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun getDiscoverData():Flowable<List<DiscoverBean>>

    @GET("v2/feed")
    fun getHomeMoreData(@Query("date")date:String,@Query("num")num:String) : Flowable<HomeBean>


}