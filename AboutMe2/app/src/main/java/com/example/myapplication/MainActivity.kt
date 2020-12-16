package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethod
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var doneButton:Button
    lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Aleks Haecky")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName

          binding.doneBtn.setOnClickListener{
              addNickName(it)
          }
//        doneButton = findViewById<Button>(R.id.done_btn)
//                doneButton.setOnClickListener {
//            addNickName(it)
//        }
//
//        findViewById<TextView>(R.id.nickName).setOnClickListener {
//            updateNickName(it)
//        }
    }

    private fun addNickName(view: View) {

//        myName?.nickname = binding.nickName.text.toString()
//        binding.editText.visibility = View.GONE
//        binding.doneBtn.visibility = View.GONE
//        binding.nickName.visibility = View.VISIBLE

        binding.apply {
            myName?.nickname = nickName.text.toString()
            nickName.visibility = View.VISIBLE

            invalidateAll()
            editText.visibility = View.GONE
            doneBtn.visibility = View.GONE
            nickName.visibility = View.VISIBLE
        }

        // Hiding the keyboard
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

//    private fun addNickName(view: View) {
//        val editText=findViewById<EditText>(R.id.editText)
//        val outputText=findViewById<TextView>(R.id.nickName)
//
//        outputText.text = editText.text
//
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        outputText.visibility = View.VISIBLE
//
//        // Hiding the keyboard
//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
//    }

//    private fun updateNickName(view: View) {
//        val editText = findViewById<EditText>(R.id.editText)
//
//        editText.visibility = View.VISIBLE
//        doneButton.visibility = View.VISIBLE
//        view.visibility = View.GONE
//
//        editText.requestFocus()
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.showSoftInput(editText,0)
//
//    }

}