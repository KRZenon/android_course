package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recView: RecyclerView

    var optionNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imgList = ArrayList<Int>()

    lateinit var adapter: OptionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recView = findViewById(R.id.recycleView)

        recView.layoutManager = LinearLayoutManager(this)
        optionNameList.add("Option 1")
        optionNameList.add("Option 2")
        optionNameList.add("Option 3")

        detailsList.add("You chose queen baseball")
        detailsList.add("You chose queen wolf")
        detailsList.add("You chose queen china")

        imgList.add(R.drawable.mo_baseball)
        imgList.add(R.drawable.w_m)
        imgList.add(R.drawable.mo_chinese)

        adapter = OptionAdapter(optionNameList,detailsList,imgList,this@MainActivity)
        recView.adapter = adapter


    }
}