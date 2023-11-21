package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var nameList = ArrayList<String>()
    var imgList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        fillArray()
        val adapter = PicAdapter(this@MainActivity, nameList, imgList)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,"You chose picture ${nameList[position]}",Toast.LENGTH_LONG).show()
        }
    }

    fun fillArray(){
        nameList.add("p1")
        nameList.add("p2")
        nameList.add("p3")
        nameList.add("p4")
        nameList.add("p5")
        nameList.add("p6")
        nameList.add("p7")
        nameList.add("p8")
        nameList.add("p9")

        imgList.add(R.drawable.mo)
        imgList.add(R.drawable.mo_bride)
        imgList.add(R.drawable.mo_chinese)
        imgList.add(R.drawable.mo_cute)
        imgList.add(R.drawable.mo_dangerousbeast)
        imgList.add(R.drawable.mo_mizugi)
        imgList.add(R.drawable.mo_kawaishoujo)
        imgList.add(R.drawable.mo_queen)
        imgList.add(R.drawable.mor)
    }
}