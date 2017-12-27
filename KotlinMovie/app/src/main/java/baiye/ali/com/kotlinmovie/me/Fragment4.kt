package baiye.ali.com.kotlinmovie.me

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.View
import baiye.ali.com.kotlinmovie.BaseFragment
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.me.activity.AdviseActivity
import baiye.ali.com.kotlinmovie.me.activity.SavaActivity
import baiye.ali.com.kotlinmovie.me.activity.WatchsActivity
import kotlinx.android.synthetic.main.fragment4.*
import java.io.File

/**
 * Created by 31962 on 2017/12/27.
 */
class Fragment4 : BaseFragment<MePresenter>(){

    private var mBitmap: Bitmap? = null
    protected val CHOOSE_PICTURE = 0
    protected val TAKE_PICTURE = 1
    private val CROP_SMALL_PICTURE = 2
    protected lateinit var tempUri: Uri

    override fun getPresenter(): MePresenter {
        var mepresenter:MePresenter = MePresenter()
        return mepresenter
    }

    override fun initData() {


    }

    override fun initView(view: View?) {

       //上传头像
        tv_tx.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                /*var intent = Intent(activity, UpdownActivity::class.java)
                startActivity(intent)*/

                showChoosePicDialog()

            }
        })

        //缓存界面
        tv_save.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent(activity, SavaActivity::class.java)
                startActivity(intent)

            }

        })

        //观看历史记录
        tv_watch.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent(activity, WatchsActivity::class.java)
                startActivity(intent)

            }

        })

        //意见反馈
        tv_advise.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                var intent = Intent(activity, AdviseActivity::class.java)
                startActivity(intent)

            }
        })


    }


    override fun getlayoutId(): Int {

        return R.layout.fragment4
    }

    /**
     * 显示修改图片的对话框
     */
    private fun showChoosePicDialog() {

        val builder = AlertDialog.Builder(activity)
        builder.setTitle("添加图片")
        val items = arrayOf("选择本地照片", "拍照")
        builder.setNegativeButton("取消", null)

        builder.setItems(items) { dialog, which ->
            when (which) {
            // 选择本地照片
                CHOOSE_PICTURE -> {
                    val openAlbumIntent = Intent(
                            Intent.ACTION_GET_CONTENT)
                    openAlbumIntent.type = "image/*"
                    //用startActivityForResult方法，重写onActivityResult()方法，拿到图片做裁剪操作
                    startActivityForResult(openAlbumIntent, CHOOSE_PICTURE)
                }
             // 拍照
                TAKE_PICTURE-> {
                    val openCameraIntent = Intent(
                            MediaStore.ACTION_IMAGE_CAPTURE)
                    tempUri = Uri.fromFile(File(Environment
                            .getExternalStorageDirectory(), "temp_image.jpg"))
                    // 将拍照所得的相片保存到SD卡根目录
                    openCameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, tempUri)
                    startActivityForResult(openCameraIntent, TAKE_PICTURE)
                }
            }
        }
        builder.show()

    }

       /**
         * 裁剪图片方法实现
         */
    protected fun cutImage(uri: Uri?) {
            if (uri == null) {
                Log.i("alanjet", "The uri is not exist.")
            }
            tempUri = uri!!
            val intent = Intent("com.android.camera.action.CROP")
            //com.android.camera.action.CROP这个action是用来裁剪图片用的
            intent.setDataAndType(uri, "image/*")
            // 设置裁剪
            intent.putExtra("crop", "true")
            // aspectX aspectY 是宽高的比例
            intent.putExtra("aspectX", 1)
            intent.putExtra("aspectY", 1)
            // outputX outputY 是裁剪图片宽高
            intent.putExtra("outputX", 150)
            intent.putExtra("outputY", 150)
            intent.putExtra("return-data", true)
            startActivityForResult(intent, CROP_SMALL_PICTURE)
        }

        /**
         * 保存裁剪之后的图片数据
         */
        protected fun setImageToView(data: Intent) {
            val extras = data.extras
            if (extras != null) {
                mBitmap = extras.getParcelable<Bitmap>("data")
                //利用工具将头像切成圆形
                tv_tx.setImageBitmap(mBitmap)//显示图片

            }
        }

}