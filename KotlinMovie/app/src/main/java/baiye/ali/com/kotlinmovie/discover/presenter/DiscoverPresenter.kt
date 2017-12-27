package baiye.ali.com.kotlinmovie.discover.presenter

import baiye.ali.com.kotlinmovie.discover.bean.DiscoverBean
import baiye.ali.com.kotlinmovie.discover.model.DiscoverModel
import baiye.ali.com.kotlinmovie.discover.view.DiscoverView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by 31962 on 2017/12/27.
 */
class DiscoverPresenter(discoverView : DiscoverView) : DiscoverPresenterInt{
    var discoverView: DiscoverView? = discoverView
    var discoverModel : DiscoverModel? = DiscoverModel()
    override fun DiscoverP() {
        val flowable = discoverModel!!.DiscoverM()
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<List<DiscoverBean>>(){
                    override fun onError(t: Throwable?) {

                    }

                    override fun onNext(t: List<DiscoverBean>?) {
                        discoverView!!.DiscoverV(t!!)
                    }

                    override fun onComplete() {

                    }


                })
    }

}