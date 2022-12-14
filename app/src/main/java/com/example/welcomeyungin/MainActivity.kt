package com.example.welcomeyungin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val button = findViewById<Button>(R.id.button)
        val myTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        // set on-click listener
        button.setOnClickListener {
            //timesClicked = timesClicked + 1
            timesClicked += 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hi Seyi.", Toast.LENGTH_SHORT).show()
        }
    }
}