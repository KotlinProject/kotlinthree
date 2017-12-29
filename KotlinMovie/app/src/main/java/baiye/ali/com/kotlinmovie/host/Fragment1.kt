package baiye.ali.com.kotlinmovie.host

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.bean.ChildHomeBean
import baiye.ali.com.kotlinmovie.bean.HomeBean
import baiye.ali.com.kotlinmovie.search.SearchActivity
import kotlinx.android.synthetic.main.fragment1.*

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment1 : BaseFragment<HostPresenter>(),Frag1View {

    override fun getdata(homeBean: HomeBean) {


        val itemList = homeBean.issueList!![1].itemList

       // val playUrl1 = homeBean.issueList!![1].itemList!![1].data!!.playUrl

        var list = ArrayList<ChildHomeBean>()
        for (i in itemList!!.indices) {


            if(i!=0){
                val itemListBean = itemList[i]
                val data = itemListBean.data
                val title = data!!.title
                val detail = data!!.cover?.detail
                val description = data!!.description
                val playUrl = data!!.playUrl


                var childhomebean: ChildHomeBean? = ChildHomeBean(detail.toString(), title.toString(), description.toString(), playUrl.toString())
                list!!.add(childhomebean!!)
            }


        }

        val hostAdapter = HostAdapter(list, activity)
        rcy_frag1.adapter = hostAdapter


    }

    override fun getPresenter(): HostPresenter {
        var hostpresenter:HostPresenter = HostPresenter(this)
        return hostpresenter
    }

    override fun initData() {
            presenter!!.relevance()
    }

    override fun initView(view: View?) {

        iv_frag1_search.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent()
                intent.setClass(activity,SearchActivity::class.java)
                startActivity(intent)

            }

        })

        rcy_frag1.layoutManager = LinearLayoutManager(activity)

    }

    override fun getlayoutId(): Int {
        return R.layout.fragment1
    }


}