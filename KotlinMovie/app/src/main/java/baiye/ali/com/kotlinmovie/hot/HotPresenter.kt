package baiye.ali.com.kotlinmovie.hot

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 *
 * Created by 31962 on 2017/12/27.
 */
class HotPresenter(hotView: HotView) {

    var hotView: HotView = hotView

    var hotmodel: HotModel = HotModel()
    //p跟m关联
    fun pm() {
        val flowable = hotmodel!!.getServerData()

        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<List<HotBean>>() {
                    override fun onComplete() {
                    }

                    override fun onNext(t: List<HotBean>?) {
                        //把数据给view
                        hotView!!.getdata(t!!)
                    }

                    override fun onError(t: Throwable?) {
                    }

                })

//
//    fun relevance() {
//
//        val flowable = hotmodel!!.Searchdata()
//        flowable.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(object : DisposableSubscriber<HotBean>() {
//                    override fun onComplete() {
//
//
//                    }
//
//                    override fun onNext(t: HotBean?) {
//
//                        hotView.getdata(t!!)
//                    }
//
//                    override fun onError(t: Throwable?) {
//
//
//                    }
//
//                })
//

//    }
//
    }
}