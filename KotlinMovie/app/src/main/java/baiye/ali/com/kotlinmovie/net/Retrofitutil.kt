package baiye.ali.com.kotlinmovie.net

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by 31962 on 2017/12/26.
 */
class Retrofitutil private constructor(baseurl:String){


    var murl:String = baseurl
    var okhttpclient:OkHttpClient? = null
    var retrofit:Retrofit?=null
    init {
        //okhttp创建了
        okhttpclient = OkHttpClient.Builder()
                .addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build()
        //retrofit创建了
        retrofit = Retrofit.Builder()
                .client(okhttpclient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(murl)
                .build()
    }

    companion object {
        @Volatile
        var instance : Retrofitutil? = null
        fun getInstance(baseurl: String):Retrofitutil {
            if(instance == null){
                synchronized(Retrofitutil::class){
                    if(instance == null){
                        instance = Retrofitutil(baseurl)
                    }
                }

            }
            return instance!!
        }
    }

    fun <T> create(service:Class<T>?):T?{
        if(service == null){
            throw RuntimeException("Api service is null!")
        }
        return retrofit?.create(service)
    }



}