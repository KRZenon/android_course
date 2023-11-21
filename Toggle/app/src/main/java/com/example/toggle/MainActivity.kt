package com.example.toggle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    lateinit var image: ImageView
    lateinit var result: TextView
    lateinit var btn: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById(R.id.image)
        result = findViewById(R.id.result)
        btn = findViewById(R.id.toggleBtn)

        btn.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                image.visibility = View.INVISIBLE
                result.text = "The image is invisible"
            }
            else{
                image.visibility = View.VISIBLE
                result.text = "The image is visible"
            }
        }
    }
}