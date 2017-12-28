package baiye.ali.com.kotlinmovie.play

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import baiye.ali.com.kotlinmovie.R

class PlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        var playurl = intent.getStringExtra("playurl")

    }
}
