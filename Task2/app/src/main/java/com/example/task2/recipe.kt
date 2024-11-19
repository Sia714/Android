package com.example.task2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class recipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recipe)
        val dishImage = findViewById<ImageView>(R.id.imageView)
        val titleText = findViewById<TextView>(R.id.textViewTitle)
        val mealTypeText = findViewById<TextView>(R.id.textViewMealType)
        val recipeText = findViewById<TextView>(R.id.textViewRecipe)
        val recipeText2 = findViewById<TextView>(R.id.textViewRecipe2)

        val mealType = intent.getStringExtra("MEAL_TYPE") ?: "Unknown Meal"
        val dishName = intent.getStringExtra("DISH_NAME") ?: "Unknown Dish"

        titleText.text = dishName
        mealTypeText.text = "Meal Type: $mealType"

        recipeText.text =
            "Here is a simple recipe to prepare $dishName. Enjoy making this perfect dish for $mealType!/n"+""
        when(titleText.text){
            "Omelette"->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            "Pancakes"->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            "Smoothie"->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            "Toast"->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }

            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }
            ""->{
                dishImage.setImageResource(R.drawable.ic_launcher_foreground)
                recipeText2.text=""
            }

        }


    }
}