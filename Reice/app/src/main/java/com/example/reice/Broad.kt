package com.example.reice

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class Broad: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplanMode: Boolean = intent!!.getBooleanExtra("state",false)
        if(isAirplanMode){
            Toast.makeText(context,"The device is in airplane mode.",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context,"The device is not in airplane mode.",Toast.LENGTH_LONG).show()
        }
    }
}