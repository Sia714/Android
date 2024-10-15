package com.example.flipkart

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        var a = findViewById<EditText>(R.id.edit1)
        var b = findViewById<EditText>(R.id.edit2)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener() {
            val name = a.text.toString()
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("USER_NAME", name)

            startActivity(i)
        }
    }
}