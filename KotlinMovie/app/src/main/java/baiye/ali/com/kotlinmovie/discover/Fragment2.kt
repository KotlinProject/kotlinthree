package baiye.ali.com.kotlinmovie.discover

import android.support.v7.widget.RecyclerView
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.presenter.DiscoverPresenter

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment2 : BaseFragment<DiscoverPresenter>() {


    override fun getPresenter(): DiscoverPresenter {
        var discoverpresenter : DiscoverPresenter = DiscoverPresenter()
        return discoverpresenter

    }

    override fun initData() {

    }

    override fun initView(view: View?) {
        val recyclerView = view!!.findViewById<RecyclerView>(R.id.discover_recyleview) as RecyclerView
    }


    override fun getlayoutId(): Int {

        return R.layout.fragment2
    }

}