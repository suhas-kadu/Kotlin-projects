package com.example.dice_roller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //lateinit var rollButton: Button;
//    lateinit var outputText: TextView;
    var count = 0;
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roller_btn)
        val clearButton: Button = findViewById(R.id.clear_btn)
        val outputText: TextView = findViewById(R.id.output_text)
        val diceNumber: TextView = findViewById(R.id.dice_number)
        val diceNumber2: TextView = findViewById(R.id.dice_number2)

        diceImage = findViewById(R.id.dice_image)
         diceImage2 = findViewById(R.id.dice_image2)

        rollButton.setOnClickListener {
            //rollDice()
            count++

            val randomInt = getRandomNumber()
            val randomInt2 = getRandomNumber()

            outputText.setText(
                "Dice Rolled $count times"
            )
            diceNumber.setText(
                randomInt.toString()
            )
            diceNumber2.setText(
                randomInt2.toString()
            )


            diceImage.setImageResource(R.drawable.empty_dice)

            var drawableResource = when(randomInt){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6

            }
            diceImage2.setImageResource(R.drawable.empty_dice)
            var drawableResource2 = when(randomInt2){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6

            }

             diceImage.setImageResource(drawableResource)
             diceImage2.setImageResource(drawableResource2)

        }

        clearButton.setOnClickListener {
            outputText.setText(
                "Dice Rolled 0 times"
            )

            diceNumber.setText(
                "0"
            )
            diceNumber2.setText(
                "0"
            )
            diceImage.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)

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