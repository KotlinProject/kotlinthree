package baiye.ali.com.kotlinmovie

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by 31962 on 2017/12/27.
 */
abstract class BaseFragment :Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(getlayoutId(), container, false)
        return view
    }

    abstract fun getlayoutId():Int


}