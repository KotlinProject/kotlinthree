package baiye.ali.com.kotlinmovie

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<T> : AppCompatActivity() {

    var presenter : T? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId())
        initView()
        presenter = getPresenter()
        initData()
    }

    abstract fun layoutId(): Int
    abstract fun initView()
    internal abstract fun getPresenter(): T?
    abstract fun initData()
}
