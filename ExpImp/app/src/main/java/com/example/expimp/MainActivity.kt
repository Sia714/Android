package com.example.expimp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        val b=findViewById<Button>(R.id.btn)
//        b.setOnClickListener{
//            val i = Intent(this,Log::class.java)
//            startActivity(i)
//        }
//        val but=findViewById<Button>(R.id.button)
//        but.setOnClickListener{
//            val i = Intent(this,MainActivity2::class.java)
//            startActivity(i)
//        }
//        val but2=findViewById<Button>(R.id.button2)
//        but.setOnClickListener{
//            val url="https://www.google.com"
//            val i = Intent(Intent.ACTION_VIEW)
//            i.data= Uri.parse(url)
//            startActivity(i)
//        }

        val b1=findViewById<Button>(R.id.button)
        b1.setOnClickListener{
            val i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i)
        }

        val b2=findViewById<Button>(R.id.button2)
        b2.setOnClickListener{
            val i5=Intent()
            i5.action= Intent.ACTION_VIEW
            i5.type="image/*"
            startActivity(i5)
        }

        val b3=findViewById<Button>(R.id.button3)
        b3.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW)
            i.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i)
        }

        val b4=findViewById<Button>(R.id.button4)
        b4.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("https://google.com"))
            startActivity(i)
        }

        val b5=findViewById<Button>(R.id.button5)
        b5.setOnClickListener{
            val i = Intent(Intent.ACTION_DIAL)
            i.setData(Uri.parse("tel: +9877542077"))
            startActivity(i)
        }

//        val b6=findViewById<Button>(R.id.button6)
//        b6.setOnClickListener{
//            val i = Intent(Intent.ACTIOn_)
//            startActivity(i)
//        }
    }
}