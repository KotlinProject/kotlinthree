package baiye.ali.com.kotlinmovie.discover

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.adapter.MyDiscoverAdapter
import baiye.ali.com.kotlinmovie.discover.bean.DiscoverBean
import baiye.ali.com.kotlinmovie.discover.presenter.DiscoverPresenter
import baiye.ali.com.kotlinmovie.discover.view.DiscoverView

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment2 : BaseFragment<DiscoverPresenter>(),DiscoverView{
    var recyclerView : RecyclerView? =null
    override fun DiscoverV(discoverBean: List<DiscoverBean>) {
        Log.i("TAG",discoverBean.get(0).name)
        val adapter = MyDiscoverAdapter(activity, discoverBean)
        recyclerView!!.adapter=adapter
    }


    override fun getPresenter(): DiscoverPresenter {
        var discoverpresenter : DiscoverPresenter = DiscoverPresenter(this)
        return discoverpresenter

    }

    override fun initData() {
        presenter!!.DiscoverP()
    }

    override fun initView(view: View?) {
        recyclerView = view!!.findViewById<RecyclerView>(R.id.discover_recyleview) as RecyclerView
        recyclerView!!.layoutManager=GridLayoutManager(activity,2)
    }


    override fun getlayoutId(): Int {

        return R.layout.fragment2
    }

}