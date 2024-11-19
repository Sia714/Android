package com.example.act_portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File

class details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)
        val titleTextView = findViewById<TextView>(R.id.head)
        val title = intent.getStringExtra("TITLE")
        titleTextView.text = title
        when (title) {
            "Skills" -> {
                titleTextView.text="Technical Skills"
                setImageAndLink(findViewById(R.id.ibtn1), R.drawable.cpp, "https://github.com/Sia714")
                setImageAndLink(findViewById(R.id.ibtn2), R.drawable.c, "https://github.com/Sia714")
                setImageAndLink(findViewById(R.id.ibtn3), R.drawable.pyt, "https://github.com/Sia714")
                setImageAndLink(findViewById(R.id.ibtn4), R.drawable.sql, "https://github.com/Sia714")

                val titleView = findViewById<TextView>(R.id.head2)
                titleView.text = "Tools and libraries"
                setImageAndLink(findViewById(R.id.ibt1), R.drawable.mon, "https://github.com/Sia714")
                setImageAndLink(findViewById(R.id.ibt2), R.drawable.git, "https://github.com/Sia714")
                setImageAndLink(findViewById(R.id.ibt3), R.drawable.boo, "https://github.com/Sia714")
                setImageAndLink(findViewById(R.id.ibt4), R.drawable.ora, "https://github.com/Sia714")

                val tView = findViewById<TextView>(R.id.head3)
                tView.text = "Soft Skills"
                setImageAndLink(findViewById(R.id.ib1), R.drawable.man, null)
                setImageAndLink(findViewById(R.id.ib2), R.drawable.ada, null)
                setImageAndLink(findViewById(R.id.ib3), R.drawable.col, null)
                setImageAndLink(findViewById(R.id.ib4), R.drawable.psl, null)
            }

            "Hobbies" -> {
                setImageAndLink(findViewById(R.id.ibtn1), R.drawable.art, null)
                setImageAndLink(findViewById(R.id.ibtn2), R.drawable.mus, null)
                setImageAndLink(findViewById(R.id.ibtn3), R.drawable.com, "https://www.geeksforgeeks.org/user/sayjankc5n/")
            }
        }

        val ho=findViewById<Button>(R.id.home)
        ho.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun setImageOrNull(imageButton: ImageButton, imageResource: Int?) {
        if (imageResource != null) {
            imageButton.setImageResource(imageResource)
            imageButton.visibility = View.VISIBLE
        } else {
            imageButton.setImageDrawable(null)
        }
    }
    private fun setImageAndLink(imageButton: ImageButton, imageResource: Int?, link: String?) {
        if (imageResource != null) {
            imageButton.setImageResource(imageResource)
            imageButton.visibility = View.VISIBLE
            imageButton.setOnClickListener {
                if (!link.isNullOrEmpty()) {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                    startActivity(intent)
                }
            }
        }
    }
}