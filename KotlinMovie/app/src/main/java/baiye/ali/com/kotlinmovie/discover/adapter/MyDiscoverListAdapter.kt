package baiye.ali.com.kotlinmovie.discover.adapter

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.discover.bean.DiscoverlListBean
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by dy on 2017/12/28.
 */
class MyDiscoverListAdapter (context: Context,list: List<DiscoverlListBean.ItemListBean>) : RecyclerView.Adapter<MyDiscoverListAdapter.MyDiscoverListViewHolder>() {

    private val context: Context = context
    private val list: List<DiscoverlListBean.ItemListBean> = list
    override fun onBindViewHolder(holder: MyDiscoverListViewHolder?, position: Int) {
        holder!!.simp?.setImageURI(Uri.parse(list.get(position).data?.cover?.feed))
        holder!!.tv!!.text=list.get(position).data?.description
        holder!!.time!!.text=list.get(position).data?.tags?.get(0)?.name+"/"+list.get(position).data?.releaseTime!!/60
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyDiscoverListViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.discover_list_item, parent, false)
        return MyDiscoverListViewHolder(view)
    }

    class MyDiscoverListViewHolder (view : View) : RecyclerView.ViewHolder(view){
        val simp = view.findViewById<SimpleDraweeView>(R.id.discover_list_item_simp) as SimpleDraweeView
        val tv = view.findViewById<TextView>(R.id.discover_list_item_tv) as TextView
        val time = view.findViewById<TextView>(R.id.discover_list_item_time) as TextView
    }
}