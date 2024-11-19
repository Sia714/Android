package com.example.eduwave

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
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
        val t=findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(t)
        var btn=findViewById<Button>(R.id.exit)
        btn.setOnClickListener{
            var b=AlertDialog.Builder(this)
            b.setTitle("Exit")
            b.setMessage("Do you really want to exit?")
            b.setCancelable(false)
            b.setPositiveButton("Yes"){dialog, _->finish()}
            b.setNegativeButton("No"){dialog,_->dialog.dismiss()}
            b.setNeutralButton("Maybe"){dialog,_->Toast.makeText(this,"We'll ask you later!",Toast.LENGTH_LONG).show()}
            b.create()
            b.show()
        }
        btn=findViewById<Button>(R.id.exit)
        btn.setOnClickListener{
            var b=AlertDialog.Builder(this)
            b.setTitle("Rate Us")
            b.setMessage("Do you really want to give feedback?")
            b.setCancelable(false)
            b.setPositiveButton("Yes"){dialog, _-> startActivity(Intent(this,Alert::class.java))}
            b.setNegativeButton("No"){dialog,_->finish()}
            b.setNeutralButton("Maybe"){dialog,_->Toast.makeText(this,"We'll ask you later!",Toast.LENGTH_LONG).show()}
            b.create()
            b.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.i1 -> {
                Toast.makeText(this, "Menu", Toast.LENGTH_SHORT)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }
}