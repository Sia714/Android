package com.example.expimp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Log : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log)
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            Log.v(TAG,"Verbose log: lowest prioity, detailed entry, no use during production")
            Log.d(TAG,"Debug log: highest priority, This is used to debug the app")
            Log.i(TAG,"Info log: moderate level importance, They give information of con")
            Log.w(TAG,"Warning log: highest priority, This is a warning message for unexpected behaviour")
        }
    }
}