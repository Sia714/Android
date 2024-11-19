package com.example.logcat

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btnlog= findViewById<Button>(R.id.btnlog)
        btnlog.setOnClickListener {
            Log.v(TAG,"Verbose log: lowest priority,detailed entry, no use during production")
            Log.d(TAG,"Debug log: highest priority , This is used to debug the app")
            Log.i(TAG,"Info log: moderate level priority,they give information of content")
            Log.w(TAG,"Warning log: This is a warning message for unexpected behaviour")
        }
    }
}