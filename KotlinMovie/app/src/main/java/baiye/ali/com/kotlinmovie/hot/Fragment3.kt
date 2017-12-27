package baiye.ali.com.kotlinmovie.hot

import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment3 : BaseFragment<HotPresenter>() {
    override fun getPresenter(): HotPresenter {
        var hotpresenter = HotPresenter()
        return hotpresenter

    }

    override fun initData() {

    }

    override fun initView(view: View?) {


    }


    override fun getlayoutId(): Int {

        return R.layout.fragment3
    }

}