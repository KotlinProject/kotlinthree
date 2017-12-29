package baiye.ali.com.kotlinmovie.search

import baiye.ali.com.kotlinmovie.BaseActivity
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.bean.SearchBean

class SearchActivity : BaseActivity<SearchPresenter>(),SearchView {
    override fun getdata(searchBean: SearchBean) {


    }

    override fun layoutId(): Int {

        return R.layout.activity_search
    }

    override fun initView() {

    }

    override fun getPresenter(): SearchPresenter? {

        var searchPresenter = SearchPresenter(this)
        return searchPresenter
    }

    override fun initData() {
        presenter!!.relevance("我")
    }


}
