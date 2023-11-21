package com.example.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var cid: ActivityMainBinding
    var count: Int = 0
    var name:String? = null
    var message:String? = null
    var isChecke:Boolean? = null
    lateinit var shared: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cid = ActivityMainBinding.inflate(layoutInflater)
        val view = cid.root
        setContentView(view)

        cid.btn.setOnClickListener {
            count ++
            cid.btn.text = count.toString()
        }
    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    fun saveData(){
        shared = this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        name = cid.name.text.toString()
        message = cid.editText.text.toString()
        isChecke = cid.checkBox.isChecked

        val editor = shared.edit()
        editor.putString("key name", name)
        editor.putString("key message", message)
        editor.putInt("key count", count)
        editor.putBoolean("key remember", isChecke!!)

        editor.apply()
        Toast.makeText(applicationContext,"Your data is saved",Toast.LENGTH_LONG).show()
    }

    fun retreiveData(){
        shared = this.getSharedPreferences("saveData", Context.MODE_PRIVATE)
        name = shared.getString("key name", null)
        message = shared.getString("key message", null)
        count = shared.getInt("key count", 0)
        isChecke = shared.getBoolean("key remember", false)

        cid.name.setText(name)
        cid.editText.setText(message)
        cid.btn.setText(""+ count)
        cid.checkBox.isChecked = isChecke!!
    }

    override fun onResume() {
        super.onResume()
        retreiveData()
    }
}