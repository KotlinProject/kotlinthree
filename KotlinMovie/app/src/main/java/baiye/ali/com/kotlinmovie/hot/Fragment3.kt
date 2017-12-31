package baiye.ali.com.kotlinmovie.hot

import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import kotlinx.android.synthetic.main.fragment3.*

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment3 : BaseFragment<HotPresenter>(), HotView {
    override fun getdata(hotbean: List<HotBean>) {

        val list = hotbean.get(0).ret!!.list!!.get(0).childList

        Log.i("xxx", hotbean.get(0).ret!!.list!!.get(0).title)
        val hotAdapter = HotAdapter(list!!, this!!.activity)
        recyview.adapter = hotAdapter

    }
//    override fun getdata(hotbean: HotBean) {
//
//        val list = hotbean.ret?.list!!.get(0).childList
//
//        Log.i("xx", list!!.get(0).title)
//
//        val hotAdapter = HotAdapter(list, activity)
//
//        recyview.adapter = hotAdapter
//    }

    override fun getPresenter(): HotPresenter {
        var hotpresenter = HotPresenter(this)
        return hotpresenter

    }

    override fun initData() {

        presenter!!.pm()
    }

    override fun initView(view: View?) {

        recyview.layoutManager = LinearLayoutManager(activity)

    }


    override fun getlayoutId(): Int {

        return R.layout.fragment3
    }

}