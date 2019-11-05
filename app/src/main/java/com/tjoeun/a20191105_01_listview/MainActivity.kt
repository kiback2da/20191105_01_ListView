package com.tjoeun.a20191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191105_01_listview.Adapters.RoomDataAdapter
import com.tjoeun.a20191105_01_listview.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val roomList = ArrayList<RoomData>()
    var roomAdapter:RoomDataAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRooms()

        /*sum(10,20)
        sum2(10,20)*/

        roomAdapter = RoomDataAdapter(this,R.layout.room_list_item,roomList)

        roomListView.adapter = roomAdapter
    }

    //Ex 두숫자의 합계를 Return 해주는 함수 생성
    fun sum(num1:Int, num2:Int): Int {
        val result = num1 + num2
        return result
    }

    fun sum2(num1:Int, num2: Int) = num1 + num2

    fun addRooms(){
        //방을 추가 하는 로직
        roomList.add(RoomData(8000,"마포구 서교동",1))
        roomList.add(RoomData(28500,"마포구 서교동",3))
        roomList.add(RoomData(12000,"마포구 성산동",5))
        roomList.add( RoomData(12000,"마포구 망원1동",3))
        roomList.add(RoomData(15000,"마포구 망원동",2))
        roomList.add(RoomData())
        roomList.add(RoomData("광명시 광명5동"))
        roomList.add(RoomData(8000,"마포구 서교동",1))
        roomList.add(RoomData(28500,"마포구 서교동",3))
        roomList.add(RoomData(12000,"마포구 성산동",5))
        roomList.add( RoomData(12000,"마포구 망원1동",3))
        roomList.add(RoomData(15000,"마포구 망원동",2))
        roomList.add(RoomData())
        roomList.add(RoomData("광명시 광명5동"))

    }
}
