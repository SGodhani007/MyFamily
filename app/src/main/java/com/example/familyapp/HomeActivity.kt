package com.example.familyapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        Toast.makeText(this, "Welcome To Home Page", Toast.LENGTH_SHORT).show()

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomBar.setOnItemSelectedListener {

            inflatFragment()
            false
        }
    }

    private fun inflatFragment() {
        TODO("Not yet implemented")
    }

//    fun openscreen(view: View) {
//        val intent = Intent(this,GuardActivity::class.java)
//        startActivity(intent)
//
//    }

//    fun add(view: View) {
//
//        var numa = findViewById<EditText>(R.id.num1)
//        var numb = findViewById<EditText>(R.id.num2)
//        var tv = findViewById<TextView>(R.id.tv)
//        var valueA = numa.text.toString().toInt()
//        var valueB = numb.text.toString().toInt()
//        var sum = valueA+valueB
//        Toast.makeText(this, "Button Clicked Sum is : $sum", Toast.LENGTH_SHORT).show()
//        tv.setText("Sum is : $sum")
//    }




}