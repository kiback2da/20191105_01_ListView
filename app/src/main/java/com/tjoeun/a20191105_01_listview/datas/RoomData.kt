package com.tjoeun.a20191105_01_listview.datas

import android.util.Log

class RoomData(price:Int,address:String,floor:Int) {

    var price:Int = 0
    var address:String = ""
    var floor:Int = 1 // 음수 : 지하. -1 -> 지하1층, 0 -> 반지하

    //기본 생성자를 호출할때 하는 행동
    init {
        //this는 RoomData 객체가 가진 이라는 의미
        //일반 변수 : 파라미터로 들어오는 변수
        this.price = price
        this.address = address
        this.floor = floor
    }


    constructor() : this(0,"미입력",0){
        Log.d("룸데이터","보조 생성자 빈칸 호출")
    }

    constructor(address:String) : this(-1,address,-1){
        Log.d("룸데이터","보조 생성자(주소만) 호출")
    }
}