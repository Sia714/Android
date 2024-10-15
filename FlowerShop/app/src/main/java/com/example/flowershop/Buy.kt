package com.example.flowershop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.content.DialogInterface


class Buy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buy)

        val bouquetName = intent.getStringExtra("BOUQUET_NAME")
        val bouquetDesc = intent.getStringExtra("BOUQUET_DESC")
        val bouquetPrice = intent.getIntExtra("BOUQUET_PRICE", 0)
        var Fimage = findViewById<ImageView>(R.id.image)

        val Fname = findViewById<TextView>(R.id.bouquetTitle)
        val Fdesc = findViewById<TextView>(R.id.desc)
        val Fprice = findViewById<TextView>(R.id.price)


        Fname.text = bouquetName
        Fdesc.text = bouquetDesc
        Fprice.text = "Price: ₹$bouquetPrice"

        when (bouquetName) {
            "Rose Bouquet" -> Fimage.setImageResource(R.drawable.roses)
            "Tulip Bouquet" -> Fimage.setImageResource(R.drawable.tulips)
            "Daisy Bouquet" -> Fimage.setImageResource(R.drawable.daisy)
            "Peonies Bouquet" -> Fimage.setImageResource(R.drawable.peons)
            "Irises Bouquet" -> Fimage.setImageResource(R.drawable.irises)
            "Sunflower Bouquet" -> Fimage.setImageResource(R.drawable.sun)
            "Mixed Bouquet" -> Fimage.setImageResource(R.drawable.mix)
        }
        val confirm=findViewById<Button>(R.id.buy)
        confirm.setOnClickListener{
            val msg="Order Confirmed"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }



        val homeButton = findViewById<Button>(R.id.home)
        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
