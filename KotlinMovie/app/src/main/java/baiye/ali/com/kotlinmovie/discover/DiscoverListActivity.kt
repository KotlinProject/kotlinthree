package baiye.ali.com.kotlinmovie.discover

import baiye.ali.com.kotlinmovie.BaseActivity
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.presenter.DiscoverListPresenter
import baiye.ali.com.kotlinmovie.discover.view.DiscoverListView

class DiscoverListActivity : BaseActivity<DiscoverListPresenter>(),DiscoverListView {
    override fun layoutId(): Int {
        return R.layout.activity_discover_list
    }

    override fun initView() {

    }

    override fun getPresenter(): DiscoverListPresenter? {
        var discoverListPresenter = DiscoverListPresenter(this)
        return discoverListPresenter
    }

    override fun initData() {

    }


}
