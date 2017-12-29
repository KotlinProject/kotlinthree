package baiye.ali.com.kotlinmovie.hot

import baiye.ali.com.kotlinmovie.net.Api
import baiye.ali.com.kotlinmovie.net.ApiService
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import io.reactivex.Flowable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Administrator on 2017/12/29.
 */
class HotModel {

    fun getServerData(): Flowable<HotBean> {
        val retrofit = Retrofit.Builder().baseUrl(Api.DDDD_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        val apiService = retrofit.create(ApiService::class.java)
        val flowable = apiService.getDDDD()

        return flowable
    }


//    fun Searchdata(): Flowable<HotBean> {
//        val retrofitutil = Retrofitutil.getInstance(Api.DDDD_URL)
//        val service = retrofitutil.create(ApiService::class.java)
//        val homeData = service!!.getDDDD()
//        return homeData
//    }
}