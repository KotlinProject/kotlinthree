package baiye.ali.com.kotlinmovie.App

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 * Created by 31962 on 2017/12/27.
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }

}