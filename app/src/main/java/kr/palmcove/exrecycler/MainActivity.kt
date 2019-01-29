package kr.palmcove.exrecycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kr.palmcove.exrecycler.vo.Item

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_main.setHasFixedSize(false)
        val layoutManager = LinearLayoutManager(this)
        rv_main.layoutManager = layoutManager

        val mainList = ArrayList<Item>()
        mainList.add(
            Item(
                "https://dnvefa72aowie.cloudfront.net/origin/article/201901/c82d72a9ea89752bc398d1c6bdb2cf3601418d83e5496ebd4fe593b8fa5f54c3.jpg?q=95&s=1440x1440&t=inside",
                "(아낌없이 주는 나무)5단 서랍장", """사이즈는 90×53×125 입니다

깨끗한편입니다~~
고급스러워 보이고
우리아이 학교 입학할때
책상이랑 옷장 서랍장 같이 셋트로 구매한거예요~~

세트로120만원정도 준걸로 기억해요~
세트로 드시면 더 예뻐요~""",
                "우제3동", "35,000원", "5", "0",
                "가구/인테리어", "607", "쵸코하임", true
            )
        )

        mainList.add(
            Item(
                "https://dnvefa72aowie.cloudfront.net/origin/article/201901/b50a09dcbbeaf0a23cb6062b0bcc05f0e95ba64229a39754e5eef687bef4fea4.jpg?q=95&s=1440x1440&t=inside",
                "파로마 3단 서랍장 겸 화장대", """90×55×72 사이즈입니다

깨끗한 편입니다

저가 올린 키높이장 침대랑 셋트입니다""",
                "우제3동", "30,000원", "1", "0",
                "가구/인테리어", "577", "쵸코하임", true
            )
        )

        mainList.add(
            Item(
                "https://dnvefa72aowie.cloudfront.net/origin/article/201901/7b4ead446a2b544d134d8798f97f93671866d953c93b6020d58705c7695d03a9.jpg?q=95&s=1440x1440&t=inside",
                "파로마 퀸 사이즈 침대", """퀸 사이즈입니다
166×210이구요

깨끗한편입니다
저가 올린 키높이장이랑 화장대랑 세트입니다""",
                "우제3동", "20,000원", "3", "0",
                "가구/인테리어", "470", "쵸코하임", true
            )
        )

        mainList.add(
            Item(
                "https://dnvefa72aowie.cloudfront.net/origin/article/201901/8c31e5db97be319eeb97eb0aa8b45f32eb0a55be9edaee38b56bcbdb6defb10f.jpg?q=95&s=1440x1440&t=inside",
                "커피잔세트", """오션 카페라테 컵세트 박스채 새상품입니다.
커피나 차좋아하시는 데려갔으면 좋겠네요~
무게감이 묵직하고 두꺼워서 차가 잘 식지 않아요~
컵 바닥 디자인이 약간 네모집니다 참고하세요~
컵2p+잔2p 입니다""",
                "우제2동", "5,000원", "0", "0",
                "생활/가공식품", "95", "크림새우", true
            )
        )

        mainList.add(
            Item(
                "https://dnvefa72aowie.cloudfront.net/origin/article/201901/06d53eccb1a07afa0c1c88056cfaed37d5eea11a075b020745866f3ba7f1786a.jpg?q=95&s=1440x1440&t=inside",
                "베개솜 (60×40) 두개 (한두번 사용했음)", """한개당 2천원도 가능합니다~
(베이스커버 옆지퍼 있음)

※ 사용감 거의 없음
(사서 친구들 한두번 베고 자긴했지만 깨끗해요~)""",
                "좌제3동", "4,000원", "0", "0",
                "가구/인테리어", "79", "모닝커피", true
            )
        )

        mainList.add(
            Item(
                "https://dnvefa72aowie.cloudfront.net/origin/article/201901/e2c63beff831f73b17dd409f80a043badc321bcc9221626d833ed078066744b6.jpg?q=95&s=1440x1440&t=inside",
                "분수대", """사용안해서 오늘 내놨어요
필요하신분 직접가져가세요
기장으로 오세요
반품X""",
                "좌제2동", "10,000원", "1", "0",
                "가구/인테리어", "83", "숨김", true
            )
        )

        mainList.add(
            Item(
                "https://dnvefa72aowie.cloudfront.net/origin/article/201901/c777f2be9c209ff7c917e1f1add2c66e69e7401c575f5475480c08050e6782bd.jpg?q=95&s=1440x1440&t=inside",
                "가볍고 따뜻한 구스다운", """두번밖에 안입은 거의 새옷 같아요~
따뜻한 겨울. 쌀쌀한 봄에 입기 좋아요~
비슷한 두께가 있어서 정리해요^^""",
                "중제1동", "10,000원", "3", "0",
                "여성의류", "264", "darleen", true
            )
        )

        val mainAdapter = MainAdapter(this, mainList)
        rv_main.adapter = mainAdapter
    }
}
