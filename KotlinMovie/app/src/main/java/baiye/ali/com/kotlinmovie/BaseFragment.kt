package baiye.ali.com.kotlinmovie

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by 31962 on 2017/12/27.
 */
abstract class BaseFragment<T> :Fragment() {

    var presenter:T? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(getlayoutId(), container, false)

        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(view!!)
        presenter = getPresenter()
        initData()
    }
    //初始化布局
    abstract fun getlayoutId():Int
    //初始化view
    abstract fun initView(view: View?)
    //初始化p层
    internal abstract fun getPresenter():T
    //初始化数据
    abstract fun initData()


}