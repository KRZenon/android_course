package com.example.radiobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    lateinit var linerl: LinearLayout
    lateinit var rBtn1: RadioButton
    lateinit var rBtn2: RadioButton
    lateinit var rBtn3: RadioButton
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linerl = findViewById(R.id.linearl)
        rBtn1 = findViewById(R.id.rb1)
        rBtn2 = findViewById(R.id.rb2)
        rBtn3 = findViewById(R.id.rb3)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener{
            if(rBtn1.isChecked){
                linerl.setBackgroundColor(Color.GREEN)
            }
            else if(rBtn2.isChecked){
                linerl.setBackgroundColor(Color.YELLOW)
            }
            else if(rBtn3.isChecked){
                linerl.setBackgroundColor(Color.RED)
            }
        }
    }
}