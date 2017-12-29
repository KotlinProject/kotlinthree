package baiye.ali.com.kotlinmovie.hot

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import baiye.ali.com.kotlinmovie.R

/**
 * Created by Administrator on 2017/12/29.
 */
class HotAdapter(list: List<HotBean.RetBean.ListBean.ChildListBean>, context: Context) : RecyclerView.Adapter<HotAdapter.MyViewHolder>() {
    private val context: Context = context

    private val list: List<HotBean.RetBean.ListBean.ChildListBean> = list
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        //  holder?.imageview?.setImageURI(Uri.parse(list.get(position).pic))

        holder?.text?.setText(list.get(position).title)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {

        val view: View = LayoutInflater.from(context).inflate(R.layout.hot_adapter, parent, false)

        val holder = MyViewHolder(view)
        return holder
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //  var imageview: SimpleDraweeView = view!!.findViewById<SimpleDraweeView>(R.id.hot_image) as SimpleDraweeView

        var text: TextView = view!!.findViewById<TextView>(R.id.text) as TextView
    }


}