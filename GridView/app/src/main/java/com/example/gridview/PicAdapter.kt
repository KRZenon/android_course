package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PicAdapter(
    var context: Context,
    var nameList: ArrayList<String>,
    var imgList: ArrayList<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
        return nameList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.custom_layout,parent,false)
        var picName: TextView = view.findViewById(R.id.textView)
        var picImg: ImageView = view.findViewById(R.id.imageView)

        picName.text = nameList[position]
        picImg.setImageResource(imgList[position])
        return view
    }
}