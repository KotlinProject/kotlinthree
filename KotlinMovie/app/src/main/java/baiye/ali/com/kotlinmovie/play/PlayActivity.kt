package baiye.ali.com.kotlinmovie.play

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import baiye.ali.com.kotlinmovie.R
import kotlinx.android.synthetic.main.activity_play.*
import cn.jzvd.JZVideoPlayerStandard

class PlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val bundle = intent.getBundleExtra("play")
        val playUrl = bundle.get("playUrl").toString()

        videoplayer.setUp(playUrl
                , JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, "飙车");

    }
}
