package com.example.flowershop

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Flower : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)


        val basePrice = intent.getIntExtra("BOUQUET_PRICE", 0) // Base price of the bouquet
        var currentPrice = basePrice

        val bouquetName = intent.getStringExtra("BOUQUET_NAME")
        val bouquetDesc = intent.getStringExtra("BOUQUET_DESC")


        val Fname = findViewById<TextView>(R.id.name)
        val Fdesc = findViewById<TextView>(R.id.desc)
        val Fprice = findViewById<TextView>(R.id.price)
        val Fimage = findViewById<ImageView>(R.id.image)
        val radioGroupSize = findViewById<RadioGroup>(R.id.radioGroupSize)
        val priceTextView = findViewById<TextView>(R.id.price)


        Fname.text = bouquetName
        Fdesc.text = bouquetDesc
        Fprice.text = "Price: ₹$basePrice"


        when (bouquetName) {
            "Rose Bouquet" -> Fimage.setImageResource(R.drawable.roses)
            "Tulip Bouquet" -> Fimage.setImageResource(R.drawable.tulips)
            "Daisy Bouquet" -> Fimage.setImageResource(R.drawable.daisy)
            "Peonies Bouquet" -> Fimage.setImageResource(R.drawable.peons)
            "Irises Bouquet" -> Fimage.setImageResource(R.drawable.irises)
            "Sunflower Bouquet" -> Fimage.setImageResource(R.drawable.sun)
            "Mixed Bouquet" -> Fimage.setImageResource(R.drawable.mix)
        }


        radioGroupSize.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radioSmall -> {
                    currentPrice = (basePrice * 1.0).toInt()
                    priceTextView.text = "Price: ₹$currentPrice"
                }
                R.id.radioMedium -> {
                    currentPrice = (basePrice * 1.5).toInt()
                    priceTextView.text = "Price: ₹$currentPrice"
                }
                R.id.radioLarge -> {
                    currentPrice = (basePrice * 2.0).toInt()
                    priceTextView.text = "Price: ₹$currentPrice"
                }
            }
        }


        val defaultSelectedRadio = findViewById<RadioButton>(R.id.radioSmall)
        defaultSelectedRadio.isChecked = true


        val buyNowButton = findViewById<Button>(R.id.buy)
        buyNowButton.setOnClickListener {
            val intent = Intent(this, Buy::class.java).apply {
                putExtra("BOUQUET_NAME", bouquetName)
                putExtra("BOUQUET_DESC", bouquetDesc)
                putExtra("BOUQUET_PRICE", currentPrice)
                putExtra("BOUQUET_IMAGE", when (bouquetName) {
                    "Rose Bouquet" -> R.drawable.roses
                    "Tulip Bouquet" -> R.drawable.tulips
                    "Daisy Bouquet" -> R.drawable.daisy
                    "Peonies Bouquet" -> R.drawable.peons
                    "Irises Bouquet" -> R.drawable.irises
                    "Sunflower Bouquet" -> R.drawable.sun
                    "Mixed Bouquet" -> R.drawable.mix
                    else -> 0
                })
            }
            startActivity(intent)
        }

        val homeButton = findViewById<Button>(R.id.home)
        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
