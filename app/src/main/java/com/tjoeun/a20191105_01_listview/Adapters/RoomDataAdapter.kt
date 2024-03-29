package com.tjoeun.a20191105_01_listview.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeun.a20191105_01_listview.R
import com.tjoeun.a20191105_01_listview.datas.RoomData

class RoomDataAdapter(context:Context, resource:Int,list:ArrayList<RoomData>) : ArrayAdapter<RoomData>(context,resource,list){

    var mContext:Context? = null
    var mList:ArrayList<RoomData>? = null
    var inf:LayoutInflater? = null

    init {
        mContext = context
        mList = list
        inf = LayoutInflater.from(mContext)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        var row = convertView
        if(row == null){
            row = inf?.inflate(R.layout.room_list_item,null)
        }

        var roomData = mList?.get(position)

        var priceTxt = row?.findViewById<TextView>(R.id.priceTxt)
        var addressFloorTxt = row?.findViewById<TextView>(R.id.addressAndFloorTxt)

        priceTxt?.text = roomData?.price.toString()
        addressFloorTxt?.text = "${roomData?.address}, ${roomData?.floor}층"
        return row!!
    }
}