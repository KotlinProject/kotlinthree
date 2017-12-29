package baiye.ali.com.kotlinmovie.host

import android.content.Intent
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.bean.ChildHomeBean
import baiye.ali.com.kotlinmovie.bean.HomeBean
import baiye.ali.com.kotlinmovie.search.EditActivity
import kotlinx.android.synthetic.main.fragment1.*

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment1 : BaseFragment<HostPresenter>(),Frag1View {

    override fun getdata(homeBean: HomeBean) {

        //val date = homeBean.issueList!!.get(1).date

      // homeBean.issueList!!.get(0).itemList!!.get(1)!!.data!!.image

      //  homeBean!!.issueList!![1]!!.itemList!![5]!!.data!!.
       // homeBean.issueList!![1].itemList!![1]!!.data!!.playUrl

        val itemList = homeBean.issueList!![1].itemList

       // val playUrl1 = homeBean.issueList!![1].itemList!![1].data!!.playUrl

        var list = ArrayList<ChildHomeBean>()
        for (i in itemList!!.indices) {

           /* val image = i?.data!!.image!!
            val title = i?.data!!.title!!
            val description = i?.data!!.description!!
            val playUrl = i?.data!!.playUrl!!

            var childhomebean: ChildHomeBean? = ChildHomeBean(image!!, title!!, description!!, playUrl!!)!!
            list!!.add(childhomebean!!)*/

            if(i!=0){
                val itemListBean = itemList[i]
                val data = itemListBean.data
                val title = data!!.title
                val detail = data!!.cover?.detail
                val blurred = data!!.cover?.blurred
                val description = data!!.description
                val playUrl = data!!.playUrl


                var childhomebean: ChildHomeBean? = ChildHomeBean(detail.toString(), title.toString(), description.toString(), playUrl.toString(),blurred.toString())
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
                intent.setClass(activity,EditActivity::class.java)
                startActivity(intent)

            }

        })

        rcy_frag1.layoutManager = LinearLayoutManager(activity)

    }

    override fun getlayoutId(): Int {
        return R.layout.fragment1
    }


}