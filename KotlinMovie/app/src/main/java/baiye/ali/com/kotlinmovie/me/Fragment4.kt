package baiye.ali.com.kotlinmovie.me

import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment4 : BaseFragment<MePresenter>(),View.OnClickListener {
    override fun getPresenter(): MePresenter {
        var mepresenter:MePresenter = MePresenter()
        return mepresenter
    }

    override fun initData() {

    }

    override fun initView(view: View?) {


    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.



}



    override fun getlayoutId(): Int {


        return R.layout.fragment4
    }

}