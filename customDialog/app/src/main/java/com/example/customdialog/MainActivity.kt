package com.example.customdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
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
            var d=LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            var g=AlertDialog.Builder(this).setView(d)

            g.setPositiveButton("Subscribe!"){dialog, _->
                val e=d.findViewById<EditText>(R.id.editTextText)
                val email=e.text.toString()
                if(email.isNotBlank()){
                    Toast.makeText(this,"Subscribed with $email",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"Enter Valid Email",Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            g.setNegativeButton("Cancel"){dialog,_->dialog.dismiss()}
            g.create().show()
        }
    }
}