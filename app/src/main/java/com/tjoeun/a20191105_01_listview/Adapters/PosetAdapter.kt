package com.tjoeun.a20191105_01_listview.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tjoeun.a20191105_01_listview.R
import com.tjoeun.a20191105_01_listview.datas.PostData
import java.util.zip.Inflater

class PosetAdapter(context: Context,res:Int,list:ArrayList<PostData>) : ArrayAdapter<PostData>(context,res,list){

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        var row = convertView
        if(row == null){
            row = inf.inflate(R.layout.port_list_item, null)
        }



        return row!!
    }

}