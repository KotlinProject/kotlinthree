package baiye.ali.com.kotlinmovie.search

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import baiye.ali.com.kotlinmovie.R
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        iv_back_Edit.setOnClickListener{
            finish()
        }


        iv_search_Edit.setOnClickListener{
            val text = et_Edit.text.toString()
            var intent = Intent()
            intent.setClass(this,SearchActivity::class.java)
            intent.putExtra("edit",text)
           startActivity(intent)
            finish()
        }



    }
}
