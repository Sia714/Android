package com.example.task2_language

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var b= findViewById<Button>(R.id.button)
        b.setOnClickListener{
            var d= LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            val englishTextView = d.findViewById<TextView>(R.id.textView)
            val hindiTextView = d.findViewById<TextView>(R.id.textView2)
            val punjabiTextView = d.findViewById<TextView>(R.id.textView3)
            val koreanTextView = d.findViewById<TextView>(R.id.textView4)
            val teluguTextView = d.findViewById<TextView>(R.id.textView5)
            var g=AlertDialog.Builder(this).setView(d).create()
            englishTextView.setOnClickListener {
                Toast.makeText(this, "English selected", Toast.LENGTH_SHORT).show()
                g.dismiss()
            }

            hindiTextView.setOnClickListener {
                Toast.makeText(this, "Hindi selected", Toast.LENGTH_SHORT).show()
                g.dismiss()
            }

            punjabiTextView.setOnClickListener {
                Toast.makeText(this, "Punjabi selected", Toast.LENGTH_SHORT).show()
                g.dismiss()
            }

            koreanTextView.setOnClickListener {
                Toast.makeText(this, "Korean selected", Toast.LENGTH_SHORT).show()
                g.dismiss()
            }

            teluguTextView.setOnClickListener {
                Toast.makeText(this, "Telugu selected", Toast.LENGTH_SHORT).show()
                g.dismiss()
            }

            g.show()
        }

    }

}