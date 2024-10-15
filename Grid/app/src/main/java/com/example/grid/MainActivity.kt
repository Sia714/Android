package com.example.a1demo

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grid.R

class GridLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_layout)
        var a = findViewById<ImageButton>(R.id.imageButton5)
        var b = findViewById<ImageButton>(R.id.imageButton4)
        var c = findViewById<ImageButton>(R.id.imageButton6)
        var d = findViewById<ImageButton>(R.id.imageButton2)

        a.setOnClickListener {
            Toast.makeText(this,"Image 1 clicked",Toast.LENGTH_LONG). show()
        }
        b.setOnClickListener {
            Toast.makeText(this,"Image 2 clicked",Toast.LENGTH_LONG).show()
        }
        c.setOnClickListener {
            Toast.makeText(this,"Image 3 clicked",Toast.LENGTH_LONG).show()
        }
        d.setOnClickListener {
            Toast.makeText(this,"Image 4 clicked",Toast.LENGTH_LONG).show()
        }
    }
}