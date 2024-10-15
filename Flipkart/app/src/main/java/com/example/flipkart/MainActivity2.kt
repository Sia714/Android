package com.example.flipkart

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val welcomeMessage = findViewById<TextView>(R.id.text1)

        // Retrieve the username from the Intent
        val username = intent.getStringExtra("USER_NAME")

        // Display the welcome message with the username
        welcomeMessage.text = "Welcome back, $username!"

    }
}