package baiye.ali.com.gsyplayer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // gsyVideoPlayer.setUp("http://ali.cdn.kaiyanapp.com/1497859203791_c9c1a602.mp4?auth_key=1514448702-0-0-487ed3fcb2cea795bd9bdf840f70dba0",false,"没有");
        //StandardGSYVideoPlayer standardGSYVideoPlayer = new StandardGSYVideoPlayer(this);
        // GSYVideoPlayer gsyVideoPlayer =  findViewById(R.id.gsyplay);
        //gsyVideoPlayer.setUp("http://ali.cdn.kaiyanapp.com/1497859203791_c9c1a602.mp4?auth_key=1514448702-0-0-487ed3fcb2cea795bd9bdf840f70dba0",false,"没有");

        gsy_player!!.setUp("http://ali.cdn.kaiyanapp.com/1497859203791_c9c1a602.mp4?auth_key=1514448702-0-0-487ed3fcb2cea795bd9bdf840f70dba0",false,"没有")

    }
}
