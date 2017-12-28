package baiye.ali.com.kotlinmovie.discover

import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import baiye.ali.com.kotlinmovie.BaseActivity
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.adapter.MyDiscoverListAdapter
import baiye.ali.com.kotlinmovie.discover.bean.DiscoverlListBean
import baiye.ali.com.kotlinmovie.discover.presenter.DiscoverListPresenter
import baiye.ali.com.kotlinmovie.discover.view.DiscoverListView
import com.jcodecraeer.xrecyclerview.XRecyclerView
import kotlinx.android.synthetic.main.activity_discover_list.*

class DiscoverListActivity : BaseActivity<DiscoverListPresenter>(), DiscoverListView {

    var discover_list_xrecyclerview: XRecyclerView? = null
    override fun DiscoverListV(discoverlListBean: DiscoverlListBean) {
        val itemList = discoverlListBean.itemList
        val adapter = MyDiscoverListAdapter(this, itemList!!)
        discover_list_xrecyclerview!!.adapter = adapter
    }

    override fun layoutId(): Int {
        return R.layout.activity_discover_list
    }

    override fun initView() {
        setSupportActionBar(discover_list_tool)
        var bar = supportActionBar
        var name = intent
        var names: String = name.getStringExtra("name")
        bar?.title = names

        bar?.setDisplayHomeAsUpEnabled(true)
        discover_list_tool.setNavigationOnClickListener {
            onBackPressed()
        }
        discover_list_xrecyclerview!!.layoutManager = LinearLayoutManager(this)

    }

    override fun getPresenter(): DiscoverListPresenter? {
        var discoverListPresenter = DiscoverListPresenter(this)
        return discoverListPresenter
    }

    override fun initData() {
        var name = intent
        var names: String = name.getStringExtra("name")
        presenter!!.DiscoverListP(name.getStringExtra("name"))
        Log.i("TAG", names)
    }


}
