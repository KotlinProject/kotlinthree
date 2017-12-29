package baiye.ali.com.kotlinmovie.host

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.bean.ChildHomeBean
import baiye.ali.com.kotlinmovie.play.PlayActivity
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by 31962 on 2017/12/28.
 */
class HostAdapter(list: ArrayList<ChildHomeBean>, context: Context) : RecyclerView.Adapter<HostAdapter.MyViewHolder>() {

    var list: ArrayList<ChildHomeBean> = list
    var context: Context = context
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder!!.sdv1.setImageURI(Uri.parse(list.get(position).icon!!))
        holder!!.tv1.setText(list.get(position).title)
        holder!!.ll1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent()
                intent.setClass(context, PlayActivity::class.java)
                intent.putExtra("playurl", list.get(position).playUrl)
                context.startActivity(intent)
            }

        })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item1, parent, false)

        return MyViewHolder(view)
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var sdv1: SimpleDraweeView = view!!.findViewById<SimpleDraweeView>(R.id.sdv_item1) as SimpleDraweeView
        var tv1: TextView = view!!.findViewById<TextView>(R.id.tv_item1) as TextView
        var ll1: LinearLayout = view!!.findViewById<LinearLayout>(R.id.ll_item1) as LinearLayout

    }
}