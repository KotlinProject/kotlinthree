package baiye.ali.com.kotlinmovie.me.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import baiye.ali.com.kotlinmovie.R
import kotlinx.android.synthetic.main.activity_sava.*

/**
 * 缓存
 */

class SavaActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sava)

        //返回上一层
        fan_sava.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                finish()
            }

        })

    }

}
