package com.example.flowershop

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val r=findViewById<ImageButton>(R.id.Rose)
        r.setOnClickListener(){
            val i= Intent(this,Flower::class.java)
            i.putExtra("BOUQUET_NAME", "Rose Bouquet")
            i.putExtra("BOUQUET_IMAGE", R.drawable.roses)
            i.putExtra("BOUQUET_DESC", "Express your love in the most timeless way with our luxurious bouquet of Roses! Whether it's a romantic gesture or simply to brighten someone’s day, the rich colors and intoxicating fragrance of fresh roses will speak volumes. Show them how much they mean to you with the classic elegance of Roses.")
            i.putExtra("BOUQUET_PRICE", 299)
            startActivity(i)
        }
        val d=findViewById<ImageButton>(R.id.Daisy)
        d.setOnClickListener(){
            val i= Intent(this,Flower::class.java )
            i.putExtra("BOUQUET_NAME", "Daisy Bouquet")
            i.putExtra("BOUQUET_IMAGE", R.drawable.daisy)
            i.putExtra("BOUQUET_DESC", "Bring a burst of joy with our cheerful Daisy bouquets! These fresh, vibrant flowers are the perfect way to spread positivity and happiness. Simple, charming, and full of life, a Daisy bouquet is just what you need to lift spirits and brighten any space.")
            i.putExtra("BOUQUET_PRICE", 599)
            startActivity(i)

        }
        val I=findViewById<ImageButton>(R.id.Irise)
        I.setOnClickListener(){
            val i= Intent(this,Flower::class.java)
            i.putExtra("BOUQUET_NAME", "Irises Bouquet")
            i.putExtra("BOUQUET_IMAGE", R.drawable.irises)
            i.putExtra("BOUQUET_DESC", "Add a touch of sophistication with our enchanting Irises. Known for their deep, striking colors and elegant design, Irises symbolize wisdom, hope, and trust. Whether for a special celebration or just because, a bouquet of Irises is a stunning way to leave a lasting impression.")
            i.putExtra("BOUQUET_PRICE", 399)
            startActivity(i)
        }
        val t=findViewById<ImageButton>(R.id.Tulip)
        t.setOnClickListener(){
            val i= Intent(this,Flower::class.java)
            i.putExtra("BOUQUET_NAME", "Tulip Bouquet")
            i.putExtra("BOUQUET_IMAGE", R.drawable.tulips)
            i.putExtra("BOUQUET_DESC", "Delicate yet full of grace, Tulips represent beauty in its purest form. Their vibrant colors and sleek shape make Tulip bouquets a perfect choice for any occasion. Whether for a friend or a loved one, brighten their day with a bouquet of fresh Tulips, a symbol of renewal and joy.")
            i.putExtra("BOUQUET_PRICE", 365)
            startActivity(i)
        }
        val p=findViewById<ImageButton>(R.id.Peonies)
        p.setOnClickListener(){
            val i= Intent(this,Flower::class.java)
            i.putExtra("BOUQUET_NAME", "Peonies Bouquet")
            i.putExtra("BOUQUET_IMAGE", R.drawable.peons)
            i.putExtra("BOUQUET_DESC", "A Celebrate life’s most beautiful moments with the lush elegance of Peonies. Known for their full, delicate petals and romantic allure, Peonies are a perfect gift for weddings, anniversaries, or any time you want to show someone how much they are cherished. Indulge in the luxury of a Peony bouquet today!")
            i.putExtra("BOUQUET_PRICE", 249)
            startActivity(i)

        }
        val s=findViewById<ImageButton>(R.id.Sunflower)
        s.setOnClickListener(){
            val i= Intent(this,Flower::class.java)
            i.putExtra("BOUQUET_NAME", "Sunflower Bouquet")
            i.putExtra("BOUQUET_IMAGE", R.drawable.sun)
            i.putExtra("BOUQUET_DESC", "Bring the warmth of sunshine indoors with our radiant Sunflower bouquets! Bold, bright, and full of energy, Sunflowers are the perfect way to add a splash of color and happiness to any room. Make every day feel like a sunny day with the unmatched vibrance of Sunflowers.")
            i.putExtra("BOUQUET_PRICE", 499)
            startActivity(i)

        }
        val m=findViewById<ImageButton>(R.id.Mix)
        m.setOnClickListener(){
            val i= Intent(this,Flower::class.java)
            i.putExtra("BOUQUET_NAME", "Mixed Bouquet")
            i.putExtra("BOUQUET_IMAGE", R.drawable.mix)
            i.putExtra("BOUQUET_DESC", "Discover the perfect harmony of color and elegance with our Mixed Bouquet! This stunning arrangement brings together the romance of Roses, the joy of Daisies, the sophistication of Irises, the warmth of Sunflowers, the lush beauty of Peonies, and the grace of Tulips. Whether you're celebrating a special occasion or simply wanting to brighten someone's day, this vibrant mix of blooms will leave a lasting impression. Each flower adds its own unique charm, creating a bouquet that’s as dynamic and unforgettable as the person receiving it!")
            i.putExtra("BOUQUET_PRICE", 799)
            startActivity(i)
        }
    }
}
