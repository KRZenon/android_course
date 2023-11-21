package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var startClasSer: Button
    lateinit var startJoInSer: Button
    lateinit var stop: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startClasSer = findViewById(R.id.btn)
        startJoInSer = findViewById(R.id.btn2)
        stop = findViewById(R.id.btn3)

        startClasSer.setOnClickListener {
            val intent = Intent(this@MainActivity,ClasSer::class.java)
            startService(intent)
        }
        startJoInSer.setOnClickListener {
            val intent = Intent(this@MainActivity,JobIntent::class.java)
            JobIntent.myBackGroundService(this@MainActivity,intent)
            startService(intent)
        }
        stop.setOnClickListener {
            val intent = Intent(this@MainActivity,ClasSer::class.java)
            stopService(intent)
        }
    }
}