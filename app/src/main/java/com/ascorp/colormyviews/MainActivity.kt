package com.ascorp.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton = findViewById<Button>(R.id.red_button)
        redButton.setOnClickListener {
            makeRed(it)
        }

        val greenButton = findViewById<Button>(R.id.green_button)
        greenButton.setOnClickListener {
            makeGreen(it)
        }

        val blueButton = findViewById<Button>(R.id.blue_button)
        blueButton.setOnClickListener {
            makeBlue(it)
        }
    }

    private fun makeRed(view: View) {
        findViewById<TextView>(R.id.box_one).setBackgroundColor(Color.DKGRAY)
        findViewById<TextView>(R.id.box_three).setBackgroundColor(Color.parseColor("#CF0000"))
        findViewById<TextView>(R.id.box_five).setBackgroundColor(Color.BLACK)
    }

    private fun makeGreen(view: View) {
        findViewById<TextView>(R.id.box_one).setBackgroundColor(Color.DKGRAY)
        findViewById<TextView>(R.id.box_four).setBackgroundColor(Color.GRAY)
        findViewById<TextView>(R.id.box_five).setBackgroundColor(Color.parseColor("#FF018786"))
    }

    private fun makeBlue(view: View) {
        findViewById<TextView>(R.id.box_one).setBackgroundColor(Color.BLACK)
        findViewById<TextView>(R.id.box_three).setBackgroundColor(Color.DKGRAY)
        findViewById<TextView>(R.id.box_five).setBackgroundColor(Color.BLUE)
    }
}