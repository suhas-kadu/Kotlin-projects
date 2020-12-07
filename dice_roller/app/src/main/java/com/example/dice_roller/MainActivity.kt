package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //lateinit var rollButton: Button;
//    lateinit var outputText: TextView;
    var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roller_btn)
        val outputText: TextView = findViewById(R.id.output_text)
        val diceNumber: TextView = findViewById(R.id.dice_number)

        rollButton.setOnClickListener {
            rollDice()
            count++
            outputText.setText(
                "Dice Rolled $count times"
            )
            diceNumber.setText(
                getRandomNumber().toString()
            )
        }
    }

    private fun rollDice() {
         Toast.makeText(this, "Button clicked",Toast.LENGTH_SHORT).show();
    }

    private fun getRandomNumber():Int{
        val randomInt = (1..6).random()
        return randomInt;
    }
}