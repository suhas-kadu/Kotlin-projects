package com.example.mycolorviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.solver.state.State
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Button as Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(R.color.my_green)
            R.id.box_two_text -> view.setBackgroundColor(R.color.navyBlue)
            R.id.box_three_text -> view.setBackgroundColor(R.color.my_yellow)
            R.id.box_four_text -> view.setBackgroundColor(R.color.my_red)
            R.id.box_five_text -> view.setBackgroundColor(R.color.deepOrange)
            R.id.box_six_text -> view.setBackgroundColor(R.color.teal_700)
            R.id.box_seven_text -> view.setBackgroundColor(R.color.purple_700)
            R.id.box_eight_text -> view.setBackgroundColor(R.color.cyan)
            R.id.box_nine_text -> view.setBackgroundColor(R.color.gold)
            R.id.box_ten_text -> view.setBackgroundColor(R.color.navyBlue)
            R.id.box_eleven_text -> view.setBackgroundColor(R.color.my_yellow)
            R.id.box_twelve_text -> view.setBackgroundColor(R.color.maroon)
            R.id.box_thirteen_text -> view.setBackgroundColor(R.color.deepOrange)
            R.id.box_fourteen_text -> view.setBackgroundColor(R.color.pink)
            R.id.box_fifteen_text -> view.setBackgroundColor(R.color.chocolate)
            R.id.box_sixteen_text -> view.setBackgroundColor(R.color.maroon)
            R.id.box_seventeen_text -> view.setBackgroundColor(R.color.skyBlue)


            R.id.red_button -> view.setBackgroundColor(R.color.my_red)
            R.id.yellow_button -> view.setBackgroundColor(R.color.my_yellow)
            R.id.green_button -> view.setBackgroundColor(R.color.my_green)


            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)
        val boxTenText = findViewById<TextView>(R.id.box_ten_text)
        val boxElevenText = findViewById<TextView>(R.id.box_eleven_text)
        val boxTweleveText = findViewById<TextView>(R.id.box_twelve_text)
        val boxThirteenText = findViewById<TextView>(R.id.box_thirteen_text)
        val boxFourteenText = findViewById<TextView>(R.id.box_fourteen_text)
        val boxFifteenText = findViewById<TextView>(R.id.box_fifteen_text)
        val boxSixteenText = findViewById<TextView>(R.id.box_sixteen_text)
        val boxSeventeenText = findViewById<TextView>(R.id.box_seventeen_text)

        val redButton = findViewById<Button>(R.id.red_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)
        val greenButton = findViewById<Button>(R.id.green_button)


        val rootConstraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)

        val clickableViews : List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,boxSixText, boxSevenText, boxEightText, boxNineText, boxTenText, boxElevenText, boxTweleveText, boxThirteenText, boxFourteenText, boxFifteenText, boxSixteenText, boxSeventeenText, redButton, yellowButton, greenButton)

        for (item in clickableViews){
            item.setOnClickListener{ makeColored(it) }
        }
    }
}