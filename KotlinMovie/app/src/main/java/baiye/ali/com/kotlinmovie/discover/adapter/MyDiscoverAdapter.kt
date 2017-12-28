package baiye.ali.com.kotlinmovie.discover.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.DiscoverListActivity
import baiye.ali.com.kotlinmovie.discover.bean.DiscoverBean
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by dy on 2017/12/27.
 */
class MyDiscoverAdapter (context: Context,list: List<DiscoverBean>) : RecyclerView.Adapter<MyDiscoverAdapter.MyViewHolder>(){

    private val context : Context = context
    private val list : List<DiscoverBean> = list
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder!!.simp.setImageURI(Uri.parse(list.get(position).bgPicture))
        holder!!.tv.text=list.get(position).name
        holder!!.ll.setOnClickListener(View.OnClickListener {
            val intent = Intent()
            intent.setClass(context,DiscoverListActivity::class.java)
            intent.putExtra("name",list.get(position).name)
            context.startActivity(intent)
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment2_item, parent, false)
        val holder = MyViewHolder(view)
        return holder
    }

    class MyViewHolder(view:View?) :RecyclerView.ViewHolder(view){
        val simp  = itemView.findViewById<SimpleDraweeView>(R.id.discover_simp) as SimpleDraweeView
        val tv = itemView.findViewById<TextureView>(R.id.discover_tv_title) as TextView
        val ll = itemView.findViewById<LinearLayout>(R.id.discover_ll) as LinearLayout
    }
}