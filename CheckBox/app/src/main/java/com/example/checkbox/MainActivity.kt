package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var maleS : CheckBox
    lateinit var femaleS: CheckBox
    lateinit var textv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        maleS = findViewById(R.id.male)
        femaleS = findViewById(R.id.female)
        textv = findViewById(R.id.textV)

        maleS.setOnClickListener{
            if(maleS.isChecked){
                textv.text = "Your gender is male"
                femaleS.isChecked = false
            }
            else textv.text = "What is your gender"
        }
        femaleS.setOnClickListener{
            if(femaleS.isChecked){
                textv.text = "Your gender is female"
                maleS.isChecked = false
            }
            else textv.text = "What is your gender"
        }
    }
}