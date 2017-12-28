package baiye.ali.com.kotlinmovie.host



import baiye.ali.com.kotlinmovie.bean.HomeBean
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by 31962 on 2017/12/27.
 */
class HostPresenter(frag1View: Frag1View) {

    var frag1view : Frag1View? = frag1View

    var hostmodel :HostModel?= HostModel()

    fun relevance(){
        val flowable = hostmodel!!.Searchdata()
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<HomeBean>() {
                    override fun onComplete() {

                    }

                    override fun onNext(t: HomeBean?) {
                        frag1view!!.getdata(t!!)
                    }

                    override fun onError(t: Throwable?) {

                    }

                })
    }
}