package com.example.school

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var inte=findViewById<Button>(R.id.loc)
        inte.setOnClickListener(){
            val intent=Intent(this,Localised::class.java)
            startActivity(intent)
        }
        var i=findViewById<ImageButton>(R.id.CA)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to School of Computer Applications?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.ca)
                intent.putExtra("pro","Empower yourself for the future. Our Computer Applications program equips you with the latest technologies and industry-aligned skills to tackle real-world challenges. Gain invaluable real-world experience through hands-on projects. Work on industry-relevant problems, hone your problem-solving skills, and build a portfolio which makes you a tech trailblazer.")
                intent.putExtra("hp","₹24 Lac")
                intent.putExtra("ap","₹8.42 Lac")
                intent.putExtra("tr","80+")
                intent.putExtra("sd","290+")
                startActivity(intent)
            }.show()
        }

        i=findViewById<ImageButton>(R.id.Bio)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to School of Bio Engineering and BioSciences?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.bio)
                intent.putExtra("pro","Welcome to the cutting edge of bioengineering and biosciences. At our school, we combine pioneering research with real-world solutions to shape the future of healthcare, sustainability, and technology. Join us on a journey of innovation, where biological insight meets engineering excellence to break new ground and make a profound global impact.\n")
                intent.putExtra("hp","₹12 Lac")
                intent.putExtra("ap","₹8.79 Lac")
                intent.putExtra("tr","80+")
                intent.putExtra("sd","160+")
                startActivity(intent)
            }.show()
        }
//        i=findViewById<ImageButton>(R.id.CSE)
//        i.setOnClickListener(){view->
//            Snackbar.make(view,"Go to School of Computer Science Engineering?",Snackbar.LENGTH_LONG).setAction("Yes"){
//                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
//                val intent= Intent(this,School::class.java)
//                intent.putExtra("LOGO",R.drawable.cse)
//                intent.putExtra("pro","Program your future today… script the world of tomorrow! Computer Science and Engineering/IT/Computing Discipline encourages all-around development through industry adapted curriculum focusing on enhancing both technical skills and soft skills.")
//                intent.putExtra("hp","₹64 Lac")
//                intent.putExtra("ap","₹14.97 Lac")
//                intent.putExtra("tr","900+")
//                intent.putExtra("sd","2350+")
//                startActivity(intent)
//            }.show()
//        }
        i=findViewById<ImageButton>(R.id.ECE)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to School of Electronics & Electrical Engineering?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.ece)
                intent.putExtra("pro","An Engineering program which ensures learning of basic concepts and relevant practices with a choice of specializations such as Communication systems, Signal Image processing, Embedded/VLSI design and Artificial intelligence to be successful entrepreneurs, do corporate jobs and higher studies.")
                intent.putExtra("hp","₹46.41 Lac")
                intent.putExtra("ap","₹12.91 Lac")
                intent.putExtra("tr","230+")
                intent.putExtra("sd","249+")
                startActivity(intent)
            }.show()
        }
        i=findViewById<ImageButton>(R.id.Agri)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to School of Agriculture?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.agri)
                intent.putExtra("pro","Be the leader in the future of agriculture! Our ICAR accredited program, the first for any private university in India, offers a unique learning experience. Gain hands-on knowledge at our expansive research farms that encompass diverse agricultural fields. We equip students with the skills to innovate through state-of-the-art facilities like poly houses, beehives, horticulture labs, and dedicated farms for agronomy and dairy production. Together, we address critical challenges in farming and contribute to agricultural advancements nationwide.\n" + "\n")
                intent.putExtra("hp","₹19.25 Lac")
                intent.putExtra("ap","₹7.95 Lac")
                intent.putExtra("tr","100+")
                intent.putExtra("sd","500+")
                startActivity(intent)
            }.show()
        }
        i=findViewById<ImageButton>(R.id.Arch)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to School of Architecture & Design?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.arch)
                intent.putExtra("pro","Give a Concrete Foundation to Your Career. Think Big. Think LPU. C.O.A approved professional degree offering elite architectural education and nourishing students with designing and software skills.")
                intent.putExtra("hp","₹31.69 Lac")
                intent.putExtra("ap","₹7.46 Lac")
                intent.putExtra("tr","50+")
                intent.putExtra("sd","75%")
                startActivity(intent)
            }.show()
        }
        i=findViewById<ImageButton>(R.id.Law)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to School of Law?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.law)
                intent.putExtra("pro","Our law program boasts of an intensive and holistic pedagogy with focus on mastering practical training aspects, high -quality industry exposure, cruise through the complexities of real world legal challenges and state of the art curriculum which equips you to excel in the ever evolving landscape of legal profession.")
                intent.putExtra("hp","₹12 Lac")
                intent.putExtra("ap","₹6.79 Lac")
                intent.putExtra("tr","40+")
                intent.putExtra("sd","80+")
                startActivity(intent)
            }.show()
        }
        i=findViewById<ImageButton>(R.id.MBA)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to Mittal School of Business?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.mba)
                intent.putExtra("pro","The business education at LPU attracts students from different parts of the world as it stands out for its industry-aligned and technology-centric curriculum, experiential learning, complemented by extensive industry interaction that includes training by seasoned industry experts. A multidisciplinary campus and diverse cultural atmosphere brimming with student activity ensure holistic development of its graduates, preparing them for thriving international careers and entrepreneurship. The business discipline is taken care by two different Schools namely, Mittal School of Business which offers MBA & Ph.D. programs and School of Management & Commerce offering all other programs in Management, Commerce & Economics.")
                intent.putExtra("hp","₹29.3 Lac")
                intent.putExtra("ap","₹13.60 Lac")
                intent.putExtra("tr","100+")
                intent.putExtra("sd","400+")
                startActivity(intent)
            }.show()
        }
        i=findViewById<ImageButton>(R.id.Mech)
        i.setOnClickListener(){view->
            Snackbar.make(view,"Go to School of Mechanical Engineering?",Snackbar.LENGTH_LONG).setAction("Yes"){
                Toast.makeText(this,"Going to the school", Toast.LENGTH_LONG).show()
                val intent= Intent(this,School::class.java)
                intent.putExtra("LOGO",R.drawable.mech)
                intent.putExtra("pro","Among the best Engineering Colleges for Aerospace Engineering, Automobile Engineering, Mechatronics Engineering, and Mechanical Engineering in Punjab, India. Mechanical Engineering Discipline encourages all-round development through industry adapted curriculum focusing on innovation and problem solving in a broad spectrum of topics that impact all sectors of our society. Its curriculum integrates design, materials, manufacturing, automation, robotics experience through multidisciplinary knowledge approach. Each year, our Engineers set the benchmark a step higher by securing placements in top companies.")
                intent.putExtra("hp","₹54.90 Lac")
                intent.putExtra("ap","₹6.72 Lac")
                intent.putExtra("tr","90+")
                intent.putExtra("sd","400+")
                startActivity(intent)
            }.show()
        }
    }
}