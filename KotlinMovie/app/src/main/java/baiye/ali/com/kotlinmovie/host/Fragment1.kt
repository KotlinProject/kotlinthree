package baiye.ali.com.kotlinmovie.host

import android.view.View
import android.widget.Toast
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import kotlinx.android.synthetic.main.fragment1.*

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment1 : BaseFragment<HostPresenter>() {
    override fun getPresenter(): HostPresenter {
        var hostpresenter = HostPresenter()
        return hostpresenter
    }

    override fun initData() {

    }

    override fun initView(view: View?) {

        iv_frag1_search.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                Toast.makeText(activity,"啦啦",Toast.LENGTH_LONG).show()
            }

        })
    }

    override fun getlayoutId(): Int {
        return R.layout.fragment1
    }


}