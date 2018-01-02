package com.example.mukarrimadam.mykotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.textViewRandom
import kotlinx.android.synthetic.main.activity_second.textViewLabel
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomValue = 0

        if (count>0) {
            randomValue = random.nextInt(count+1)
        }

        textViewRandom.text = randomValue.toString() //Integer.toString(randomValue)
//        textViewLabel.setText(randomValue.toString())

        textViewLabel.text = getString(R.string.random_heading, count)
    }
}
