package baiye.ali.com.kotlinmovie.discover.presenter

import baiye.ali.com.kotlinmovie.discover.bean.DiscoverlListBean
import baiye.ali.com.kotlinmovie.discover.model.DiscoverListModel
import baiye.ali.com.kotlinmovie.discover.view.DiscoverListView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by dy on 2017/12/28.
 */
class DiscoverListPresenter (discoverListView: DiscoverListView) : DiscoverListPresenterInt {

    var discoverListView: DiscoverListView = discoverListView
    var discoverListModel : DiscoverListModel = DiscoverListModel()

    override fun DiscoverListP(name: String) {
        val flowable = discoverListModel.DiscoverListM(name)
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<DiscoverlListBean>(){
                    override fun onError(t: Throwable?) {

                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: DiscoverlListBean?) {
                        discoverListView.DiscoverListV(t!!)
                    }

                })
    }






}