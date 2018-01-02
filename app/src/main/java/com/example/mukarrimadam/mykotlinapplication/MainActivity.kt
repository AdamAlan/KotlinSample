package com.example.mukarrimadam.mykotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG)
        myToast.show()
    }

    fun countMe(view: View) {
        // Get the text view
//        val showCountTextView = findViewById<TextView>(R.id.textView)
//        val showCountTextView: TextView = findViewById(R.id.textView)

        // Get the value of the text view.
        val countString = textView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        textView.text = count.toString();
    }

    fun randomMe(view: View) {
        val randomValue = Intent(this, SecondActivity::class.java)
        randomValue.putExtra(SecondActivity.TOTAL_COUNT, Integer.parseInt(textView.text.toString()))
        startActivity(randomValue)
    }
}
