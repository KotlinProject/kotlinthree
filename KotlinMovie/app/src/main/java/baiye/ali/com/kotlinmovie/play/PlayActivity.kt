package baiye.ali.com.kotlinmovie.play

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import baiye.ali.com.kotlinmovie.R
import cn.jzvd.JZVideoPlayerStandard
import kotlinx.android.synthetic.main.activity_play.*

class PlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val bundle = intent.getBundleExtra("play")
        val playUrl = bundle.get("playUrl").toString()
        val title = bundle.get("title").toString()
        val icon = bundle.get("icon").toString()
        val description = bundle.get("description").toString()
        val blurred = bundle.get("blurred").toString()



        videoplayer.setUp(playUrl
                , JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, title);
        videoplayer.thumbImageView.setImageURI(Uri.parse(icon))

        tv_play_title.setText(title)
        tv_play_describe.setText(description)
        sdv_fram.setImageURI(Uri.parse(blurred))


    }
}
