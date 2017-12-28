package baiye.ali.com.kotlinmovie.discover

import android.util.Log
import baiye.ali.com.kotlinmovie.BaseActivity
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.bean.DiscoverlListBean
import baiye.ali.com.kotlinmovie.discover.presenter.DiscoverListPresenter
import baiye.ali.com.kotlinmovie.discover.view.DiscoverListView
import kotlinx.android.synthetic.main.activity_discover_list.*

class DiscoverListActivity : BaseActivity<DiscoverListPresenter>(),DiscoverListView {


    override fun DiscoverListV(discoverlListBean: DiscoverlListBean) {

    }

    override fun layoutId(): Int {
        return R.layout.activity_discover_list
    }

    override fun initView() {
        setSupportActionBar(discover_list_tool)
        var bar = supportActionBar
        intent.getStringExtra("name")?.let {
            var name: String = intent.getStringExtra("name")
            Log.i("AAA",name+"aa0000")
            bar?.title = name
        }
        bar?.setDisplayHomeAsUpEnabled(true)
        discover_list_tool.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun getPresenter(): DiscoverListPresenter? {
        var discoverListPresenter = DiscoverListPresenter(this)
        return discoverListPresenter
    }

    override fun initData() {
        var name = intent
        var names: String=name.getStringExtra("name")
        presenter!!.DiscoverListP(name.getStringExtra("name"))
        Log.i("TAG",names)
    }


}
