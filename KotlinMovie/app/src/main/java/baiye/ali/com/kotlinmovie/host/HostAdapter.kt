package baiye.ali.com.kotlinmovie.host

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.bean.HomeBean
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by 31962 on 2017/12/28.
 */
 class HostAdapter (list: HomeBean.IssueListBean.ItemListBean,context: Context) : RecyclerView.Adapter<HostAdapter.MyViewHolder>() {

    var list: HomeBean.IssueListBean.ItemListBean = list
    var context:Context = context
    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item1, parent, false)

        return MyViewHolder(view)
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var sdv1 : SimpleDraweeView = view!!.findViewById(R.id.sdv_item1) as SimpleDraweeView
        var tv1:TextView = view!!.findViewById(R.id.tv_item1) as TextView

    }
}