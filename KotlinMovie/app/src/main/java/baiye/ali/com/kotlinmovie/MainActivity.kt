package baiye.ali.com.kotlinmovie

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import baiye.ali.com.kotlinmovie.discover.Fragment2
import baiye.ali.com.kotlinmovie.host.Fragment1
import baiye.ali.com.kotlinmovie.hot.Fragment3
import baiye.ali.com.kotlinmovie.me.Fragment4
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_Main.init(supportFragmentManager)
                .setImgSize(50F, 50F)
                .setFontSize(8F)
                .setTabPadding(4F, 6F, 10F)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .addTabItem("首页", R.drawable.home_selected,  R.drawable.home_normal,Fragment1::class.java)
                .addTabItem("发现",R.drawable.find_selected,R.drawable.find_normal,Fragment2::class.java )
                 .addTabItem("热门", R.drawable.hot_selected,R.drawable.hot_normal,  Fragment3::class.java)
                 .addTabItem("我的",R.drawable.mine_selected , R.drawable.mine_normal,Fragment4::class.java)
                   .isShowDivider(false)


    }
}
