package com.example.popupmenu

import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val p1=findViewById<Button>(R.id.button)
        p1.setOnClickListener{
            val p2=PopupMenu(this,p1)
            val m1:MenuInflater=p2.menuInflater         
            m1.inflate(R.menu.main_menu,p2.menu)
            p2.setOnMenuItemClickListener { item:MenuItem->
                when(item.itemId){
                    R.id.share ->{
                        Toast.makeText(this,"Share Clicked",LENGTH_SHORT).show()
                        true
                    }
                    R.id.delete->{
                        Toast.makeText(this,"Delete Clicked",LENGTH_SHORT).show()
                        true
                    }
                    else-> false
                }
            }
            p2.show()
        }
    }
}