package baiye.ali.com.kotlinmovie.me

import android.content.Intent
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.me.activity.AdviseActivity
import baiye.ali.com.kotlinmovie.me.activity.SavaActivity
import baiye.ali.com.kotlinmovie.me.activity.UpdownActivity
import baiye.ali.com.kotlinmovie.me.activity.WatchsActivity
import kotlinx.android.synthetic.main.fragment4.*

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment4 : BaseFragment<MePresenter>(){

    override fun getPresenter(): MePresenter {
        var mepresenter:MePresenter = MePresenter()
        return mepresenter
    }

    override fun initData() {


    }

    override fun initView(view: View?) {

       //上传头像
        tv_tx.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent(activity, UpdownActivity::class.java)
                startActivity(intent)


            }
        })

        //缓存界面
        tv_save.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent(activity, SavaActivity::class.java)
                startActivity(intent)

            }

        })

        //观看历史记录
        tv_watch.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent(activity, WatchsActivity::class.java)
                startActivity(intent)

            }

        })

        //意见反馈
        tv_advise.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent(activity, AdviseActivity::class.java)
                startActivity(intent)

            }
        })


    }



    override fun getlayoutId(): Int {


        return R.layout.fragment4
    }

}