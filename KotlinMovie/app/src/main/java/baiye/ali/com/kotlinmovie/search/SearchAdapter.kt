package baiye.ali.com.kotlinmovie.search

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import baiye.ali.com.kotlinmovie.R
import baiye.ali.com.kotlinmovie.bean.SearchBean
import baiye.ali.com.kotlinmovie.play.PlayActivity
import com.facebook.drawee.view.SimpleDraweeView

/**
 * Created by 31962 on 2017/12/28.
 */
 class SearchAdapter(list: List<SearchBean.ItemListBean> , context: Context) : RecyclerView.Adapter<SearchAdapter.MyViewHolder>() {

    var list: List<SearchBean.ItemListBean> = list
    var context:Context = context
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

        holder!!.sdv_search.setImageURI(Uri.parse(list!!.get(position)!!.data!!.cover!!.feed))
        holder!!.tv_title_search.setText(list.get(position).data!!.title)
        holder!!.tv_type_seachitem.setText(list.get(position).data!!.category)
        holder!!.ll_searchitem.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                val intent = Intent()
                intent.setClass(context, PlayActivity::class.java)
               // intent.putExtra("childhomebean",list.get(position))
               // intent.putExtra("childhomebean",list.get(position))
                //intent.putExtra("childhomebean",list.get(position))

                var bundle = Bundle()
                bundle.putString("icon",list.get(position).data!!.cover!!.detail)
                bundle.putString("title",list.get(position).data!!.title)
                bundle.putString("description",list.get(position).data!!.description)
                bundle.putString("playUrl",list.get(position).data!!.playUrl)
                bundle.putString("blurred",list.get(position).data!!.cover!!.blurred)

                intent.putExtra("play",bundle)
                context.startActivity(intent)
            }

        })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.search_item, parent, false)

        return MyViewHolder(view)
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var sdv_search  = view!!.findViewById(R.id.sdv_searchitem) as SimpleDraweeView
        var tv_title_search = view!!.findViewById(R.id.tv_title_searchitem) as TextView
        var tv_type_seachitem = view!!.findViewById(R.id.tv_type_searchitem) as TextView
        var ll_searchitem = view!!.findViewById(R.id.ll_searchitem) as LinearLayout


    }
}