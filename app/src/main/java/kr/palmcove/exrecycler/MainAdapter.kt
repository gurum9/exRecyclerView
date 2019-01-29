package kr.palmcove.exrecycler

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.custom_recycler_main.view.*
import kr.palmcove.exrecycler.vo.Item

class MainAdapter(var context: Context, val itemList: ArrayList<Item>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    val TAG = MainAdapter::class.java.simpleName

    init {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_recycler_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(context)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {
            val itt = Intent(context, ItemActivity::class.java)
            itt.putExtra("item", itemList[adapterPosition])
            context.startActivity(itt)
        }

        private val tvTitle = itemView.tv_item_title
        private val tvContent = itemView.tv_item_content
        private val tvLocation = itemView.tv_item_location
        private val tvPrice = itemView.tv_item_price
        private val tvLike = itemView.tv_item_like

        fun bind(context: Context) {
            val item = itemList[adapterPosition]
            Glide.with(context).load(item.img).into(itemView.iv_item)

            tvTitle.text = item.title
            tvContent.text = item.content
            tvLocation.text = item.location
            tvPrice.text = item.price
            tvLike.text = item.like

            itemView.setOnClickListener(this)
        }
    }
}