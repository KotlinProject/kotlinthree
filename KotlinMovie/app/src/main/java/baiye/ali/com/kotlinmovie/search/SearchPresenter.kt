package baiye.ali.com.kotlinmovie.search

import baiye.ali.com.kotlinmovie.bean.SearchBean
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subscribers.DisposableSubscriber

/**
 * Created by 31962 on 2017/12/28.
 */
class SearchPresenter(searchView: SearchView) {
    var searchview:SearchView = searchView

    var searchmodel = SearchModel()

    fun relevance(string: String){
        val flowable = searchmodel.getdata(string)
        flowable!!.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSubscriber<SearchBean>() {
                    override fun onError(t: Throwable?) {

                    }

                    override fun onComplete() {

                    }

                    override fun onNext(t: SearchBean?) {
                        searchview.getdata(t!!)
                    }

                })

    }
}