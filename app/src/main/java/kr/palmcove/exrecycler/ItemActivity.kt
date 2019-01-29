package kr.palmcove.exrecycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_item.*
import kr.palmcove.exrecycler.vo.Item

class ItemActivity : AppCompatActivity() {
    val TAG = ItemActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val item = intent.getSerializableExtra("item") as Item

        Glide.with(this@ItemActivity).load(item.img).into(iv_item)

        tv_item_name.text = item.name
        tv_item_location.text = item.location

        tv_item_title.text = item.title
        tv_item_category.text = item.category
        tv_item_content.text = item.content

        tv_item_info.text = "관심 ${item.like} · 조회 ${item.views}"
        tv_item_price.text = item.price

        tv_item_comment.text = "댓글 ${item.comment}개"

        iv_arrow_back.setOnClickListener {
            finish()
        }

        tv_item_trade.setOnClickListener {
            Snackbar.make(nsv_item, "채팅으로 이동", Snackbar.LENGTH_SHORT).show()
        }
    }
}
