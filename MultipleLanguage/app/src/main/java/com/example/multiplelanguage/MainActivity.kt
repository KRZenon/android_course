package com.example.multiplelanguage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.multiplelanguage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var cid: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cid = ActivityMainBinding.inflate(layoutInflater)
        val view = cid.root
        setContentView(view)

        cid.button.setOnClickListener {
            Toast.makeText(applicationContext,R.string.toast,Toast.LENGTH_LONG).show()
        }
    }
}