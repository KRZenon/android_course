package com.example.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobIntent: JobIntentService() {
    override fun onHandleWork(intent: Intent) {
        Log.d("Service", "Job IntentService is started")
        Log.d("Service Thread",Thread.currentThread().name)

    }

   companion object{
       fun myBackGroundService(context: Context, intent: Intent){
           enqueueWork(context,JobIntent::class.java,1,intent)
       }
   }

    override fun onDestroy() {
        Log.d("Service", "Job Intent Service is stopped")
        super.onDestroy()
    }
}