package com.example.ca1

import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
    val c=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val but=findViewById<Button>(R.id.button)
        but.setOnClickListener {
            if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.MANAGE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Permission Problem" )
                builder.setCancelable(false)
                builder.setMessage("External Storage Permission is necessary to Upload an image")
                builder.setNeutralButton("Try Again") { dialog, _ -> dialog.dismiss()
                    ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.MANAGE_EXTERNAL_STORAGE), c)}
                builder.create().show()
            }
            else{
                Toast.makeText(this,"Permission Granted", Toast.LENGTH_LONG).show()
            }
            if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.MANAGE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED) {

            }
        }
    }
}