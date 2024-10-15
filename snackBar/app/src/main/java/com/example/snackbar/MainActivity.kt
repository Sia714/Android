package com.example.snackbar

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val but=findViewById<Button>(R.id.btn)
        but.setOnClickListener{view ->
            Snackbar.make(view,"This is a Snackbar!", Snackbar.LENGTH_LONG).setAction("undo?"){
                Toast.makeText(this,"undo was clicked", Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}