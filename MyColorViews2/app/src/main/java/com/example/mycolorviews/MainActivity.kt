package com.example.mycolorviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.solver.state.State
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.img1)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.img2)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.img3)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.img4)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.img5)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<ConstraintLayout>(R.id.constraint_layout)

        val clickableViews : List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText)

        for (item in clickableViews){
            item.setOnClickListener{ makeColored(it) }
        }
    }
}