package com.tjoeun.a20191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191105_01_listview.Adapters.PosetAdapter
import com.tjoeun.a20191105_01_listview.datas.PostData
import kotlinx.android.synthetic.main.activity_list_view_practice.*

class ListViewPracticeActivity : AppCompatActivity() {

    var postList = ArrayList<PostData>()
    var postAdapter:PosetAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_practice)

        addPost()

        postAdapter = PosetAdapter(this,R.layout.port_list_item,postList)
        postListView.adapter = postAdapter
    }

    fun addPost(){

        postList.add(PostData("1번째 글입니다.","내용을 1번째로 적습니다."))
        postList.add(PostData("2번째 글입니다.","내용을 2번째로 적습니다."))
        postList.add(PostData("3번째 글입니다.","내용을 3번째로 적습니다."))
        postList.add(PostData("4번째 글입니다.","내용을 4번째로 적습니다."))
        postList.add(PostData("5번째 글입니다.","내용을 5번째로 적습니다."))
        postList.add(PostData("6번째 글입니다.","내용을 6번째로 적습니다."))
        postList.add(PostData("7번째 글입니다.","내용을 7번째로 적습니다."))
        postList.add(PostData("8번째 글입니다.","내용을 8번째로 적습니다."))
        postList.add(PostData("9번째 글입니다.","내용을 9번째로 적습니다."))


    }
}
