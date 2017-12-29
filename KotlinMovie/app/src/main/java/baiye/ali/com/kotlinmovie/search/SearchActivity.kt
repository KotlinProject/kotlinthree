package baiye.ali.com.kotlinmovie.search

import android.support.v7.widget.LinearLayoutManager
import baiye.ali.com.kotlinmovie.BaseActivity
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.bean.SearchBean
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : BaseActivity<SearchPresenter>(),SearchView {
    override fun getdata(searchBean: SearchBean) {

        val itemList = searchBean.itemList

        var adapter = SearchAdapter(itemList!!,this)

        xrv_search.adapter = adapter

    }

    override fun layoutId(): Int {

        return R.layout.activity_search
    }

    override fun initView() {

        iv_back_Search.setOnClickListener{
            finish()
        }

        xrv_search.layoutManager = LinearLayoutManager(this)

    }

    override fun getPresenter(): SearchPresenter? {

        var searchPresenter = SearchPresenter(this)
        return searchPresenter
    }

    override fun initData() {
        val edit = intent.getStringExtra("edit").toString()


        tv_content.setText(edit)
        presenter!!.relevance(edit)
    }


}
