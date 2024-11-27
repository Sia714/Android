package com.example.ca2

import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.i1->{
                Toast.makeText(this,"Language changed to English", Toast.LENGTH_SHORT)
                setLocale("en")
                true
            }
            R.id.i2->{
                Toast.makeText(this,"Language changed to Punjabi", Toast.LENGTH_SHORT)
                setLocale("hi")
                true
            }
            else->super.onOptionsItemSelected(item)
        }

    }

    private fun setLocale(s: String) {
        val curr=resources.configuration.locales.get(0).language
        if(s!=curr){
            val l=Locale(s)
            Locale.setDefault(l)
            val c=Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c,resources.displayMetrics)

        }
        recreate()
    }
}