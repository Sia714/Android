package com.example.appchooser

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val n=findViewById<Button>(R.id.per)
        n.setOnClickListener(){
            val i = Intent(this,permission::class.java)
            startActivity(i)
        }

        val qou = StringBuilder()
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4)
        val checkBox5 = findViewById<CheckBox>(R.id.checkBox5)
        val checkBox6 = findViewById<CheckBox>(R.id.checkBox6)
        val shareButton: Button =findViewById(R.id.button)
        shareButton.setOnClickListener(){
            if(checkBox1.isChecked){
                qou.append(checkBox1.text.toString())
                qou.append("\n")
            }
            if(checkBox2.isChecked){
                qou.append(checkBox2.text.toString())
                qou.append("\n")
            }
            if(checkBox3.isChecked){
                qou.append(checkBox3.text.toString())
                qou.append("\n")
            }
            if(checkBox4.isChecked){
                qou.append(checkBox4.text.toString())
                qou.append("\n")
            }
            if(checkBox5.isChecked){
                qou.append(checkBox5.text.toString())
                qou.append("\n")
            }
            if(checkBox6.isChecked){
                qou.append(checkBox6.text.toString())
                qou.append("\n")
            }
            share(qou.toString())
        }
    }
    private fun share(s: String) {
        val send:Intent=Intent().apply {
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,s)
            type="text/plain"
        }
        val chooser1: Intent=Intent.createChooser(send,"Share via")
        startActivity(chooser1)
    }
}