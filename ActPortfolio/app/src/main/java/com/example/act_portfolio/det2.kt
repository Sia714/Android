package com.example.act_portfolio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class det2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_det2)

        val titleTextView = findViewById<TextView>(R.id.head)
        val title = intent.getStringExtra("TITLE")
        titleTextView.text = title

        when (title) {
            "Certifications" -> setCertifications()
            "Projects" -> setProjects()
            "Achievements" -> setAchievements()
            "Education" -> setEducation()
        }
        val ho=findViewById<Button>(R.id.home)
        ho.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setCertifications() {
        setImageResourceWithLink(R.id.ibtn1, R.drawable.csec,"https://www.dsci.in/cyber-shikshaa/programs/cybershikshaa-fundamentals#:~:text=CyberShikshaa%20Fundamentals%20is%20an%20online,it%20as%20a%20career%20option.")
        setImageResourceWithLink(R.id.ibtn2, R.drawable.beg,"https://www.coursera.org/projects/chatgpt-for-beginners-save-time-with-microsoft-excel")
        setImageResourceWithLink(R.id.ibtn3, R.drawable.full,"https://www.linkedin.com/learning/paths/become-a-full-stack-web-developer")
        setImageResourceWithLink(R.id.ibtn4, R.drawable.llm,"https://www.coursera.org/learn/introduction-to-large-language-models")
        setImageResourceWithLink(R.id.ibtn5, R.drawable.prompt,"https://www.coursera.org/learn/prompt-engineering")
    }

    private fun setProjects() {
        setImageResourceWithLink(R.id.ibtn1, R.drawable.maze, "https://github.com/Sia714/Maze-Solver")
        setImageResourceWithLink(R.id.ibtn2, R.drawable.rest, "https://github.com/Sia714/Ready-Set-Banquet-Restaurant")
    }

    private fun setAchievements() {
        setImageResourceWithLink(R.id.ibtn1, R.drawable.ps, "https://www.hackerrank.com/profile/sayjan7777")
        setImageResourceWithLink(R.id.ibtn2, R.drawable.cg, "https://www.hackerrank.com/profile/sayjan7777")
    }

    private fun setEducation() {
        setImageResourceWithLink(R.id.ibtn1, R.drawable.lov, "https://www.lpu.in/")
        setTextViewContent(R.id.t1, "CGPA: 8.63                 Duration: 2022-Pursuing")

        setImageResourceWithLink(R.id.ibtn2, R.drawable.apj, "https://www.apeejay.edu/jalandhar/")
        setTextViewContent(R.id.t2, "Grade: 87.6%               Duration: 2020-2022")

        setImageResourceWithLink(R.id.ibtn3, R.drawable.apj, "https://www.apeejay.edu/jalandhar/")
        setTextViewContent(R.id.t3, "Grade: 91.6%               Duration: 2019-2020")
    }

    private fun setImageResource(buttonId: Int, imageResource: Int) {
        val imageButton = findViewById<ImageButton>(buttonId)
        imageButton.setImageResource(imageResource)
        imageButton.visibility = View.VISIBLE
    }

    private fun setImageResourceWithLink(buttonId: Int, imageResource: Int, url: String) {
        val imageButton = findViewById<ImageButton>(buttonId)
        imageButton.setImageResource(imageResource)
        imageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        imageButton.visibility = View.VISIBLE
    }

    private fun setTextViewContent(textViewId: Int, text: String) {
        val textView = findViewById<TextView>(textViewId)
        textView.text = text
        textView.visibility = View.VISIBLE
    }
}
