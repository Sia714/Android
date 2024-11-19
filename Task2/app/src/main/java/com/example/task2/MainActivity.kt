package com.example.task2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.TableRow
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
        val t=findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(t)
        val breakfastRow = findViewById<TableRow>(R.id.t1)
        breakfastRow.setOnClickListener { showPopupMenu(it, "Breakfast") }

        val lunchRow = findViewById<TableRow>(R.id.t2)
        lunchRow.setOnClickListener { showPopupMenu(it, "Lunch") }

        val snacksRow = findViewById<TableRow>(R.id.t3)
        snacksRow.setOnClickListener { showPopupMenu(it, "Snacks") }

        val dinnerRow = findViewById<TableRow>(R.id.t4)
    }
    private fun showPopupMenu(view: android.view.View, mealType: String) {
        val popup = PopupMenu(this, view)
        val menu = popup.menu

        when (mealType) {
            "Breakfast" -> {
                menu.add(0, 1, 0, "Pancakes")
                menu.add(0, 2, 1, "Omelette")
                menu.add(0, 3, 2, "Smoothie")
                menu.add(0, 4, 3, "Toast")
                menu.add(0, 5, 4, "Idli")
            }
            "Lunch" -> {
                menu.add(0, 1, 0, "Chicken Salad")
                menu.add(0, 2, 1, "Pasta")
                menu.add(0, 3, 2, "Sandwich")
                menu.add(0, 4, 3, "Soup")

            }
            "Snacks" -> {
                menu.add(0, 1, 0, "Nachos")
                menu.add(0, 2, 1, "Fries")
                menu.add(0, 3, 2, "Cupcakes")
                menu.add(0, 4, 3, "Samosa")
                menu.add(0, 5, 4, "Idli")

            }
            "Dinner" -> {
                menu.add(0, 1, 0, "Grilled Chicken")
                menu.add(0, 2, 1, "Steak")
                menu.add(0, 3, 2, "Paneer Curry")
                menu.add(0, 4, 3, "Rice and Dal")
                menu.add(0, 5, 4, "Idli")

            }
        }

        popup.setOnMenuItemClickListener { item: MenuItem ->
            val dishName = item.title.toString()
            navigateToRecipePage(mealType, dishName)
            true
        }
        popup.show()
    }

    private fun navigateToRecipePage(mealType: String, dishName: String): Boolean {
        val intent = Intent(this, recipe::class.java)
        intent.putExtra("MEAL_TYPE", mealType)
        intent.putExtra("DISH_NAME", dishName)
        startActivity(intent)
        return true
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.get->{
                Toast.makeText(this,"Get idea Clicked", Toast.LENGTH_SHORT)
                true
            }
            R.id.Recipe->{
                Toast.makeText(this,"Recipe of the day Clicked", Toast.LENGTH_SHORT)
                true
            }
            R.id.pop->{
                Toast.makeText(this,"Popular Clicked", Toast.LENGTH_SHORT)
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }
}