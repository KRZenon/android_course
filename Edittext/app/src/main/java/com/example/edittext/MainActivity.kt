package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var ok: Button
    lateinit var result: TextView
    lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextName)
        ok = findViewById(R.id.button)
        result = findViewById(R.id.textViewResult)
        image = findViewById(R.id.myImage)

        ok.setOnClickListener {
           /* var userName:String = name.text.toString()
            result.setText(userName)*/
            image.setImageResource(R.drawable.mo_bride)
        }
    }
}