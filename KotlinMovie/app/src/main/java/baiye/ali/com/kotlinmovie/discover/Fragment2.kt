package baiye.ali.com.kotlinmovie.discover

import android.support.v7.widget.RecyclerView
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.bean.DiscoverBean
import baiye.ali.com.kotlinmovie.discover.presenter.DiscoverPresenter
import baiye.ali.com.kotlinmovie.discover.view.DiscoverView

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment2 : BaseFragment<DiscoverPresenter>(),DiscoverView{
    override fun DiscoverV(discoverBean: DiscoverBean) {

    }


    override fun getPresenter(): DiscoverPresenter {
        var discoverpresenter : DiscoverPresenter = DiscoverPresenter(this)
        return discoverpresenter

    }

    override fun initData() {
        presenter
    }

    override fun initView(view: View?) {
        val recyclerView = view!!.findViewById<RecyclerView>(R.id.discover_recyleview) as RecyclerView
    }


    override fun getlayoutId(): Int {

        return R.layout.fragment2
    }

}