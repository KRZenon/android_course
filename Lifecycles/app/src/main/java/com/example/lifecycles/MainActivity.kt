package com.example.lifecycles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var txt: TextView
    lateinit var btn: Button
    lateinit var btn1: Button
    var c = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt = findViewById(R.id.textView)
        btn = findViewById(R.id.button)
        btn1 = findViewById(R.id.button2)

        btn.setOnClickListener {
            c = c + 1
            txt.text = "${c}"
        }
        btn1.setOnClickListener {
            var intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
        }
        Log.d("Message","First Activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","First Activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","First Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","First Activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","First Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","First Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","First Activity onRestart")
    }
}