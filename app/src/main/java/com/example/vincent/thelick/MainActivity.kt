package com.example.vincent.thelick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO load in counter from file

    }

    fun onLickPress (view : View) {
        //play the lick, disable button while playing
        view.isEnabled = false
        playLick()
        view.isEnabled = true
        //increment the counter and display
        increment()
    }

    fun playLick() {
        //play mp3 file
    }

    fun increment() {
        counter ++
        val counterNumber = findViewById<TextView>(R.id.counterNumber)
        counterNumber.text = counter.toString()
    }
}
