package com.example.answerme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var answerEditText: EditText
    private lateinit var answerButton: Button
    private lateinit var answerTextResult: TextView

    private val answers = listOf("Yes", "No", "Maybe")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setViews()
        setListener()

    }

    private fun setViews() {

        answerEditText = findViewById(R.id.et_question)
        answerButton = findViewById(R.id.bt_makeQuestion)
        answerTextResult = findViewById(R.id.tv_answer)

    }

    private fun setListener() {

        answerButton.setOnClickListener {

            answerQuestion()

        }

    }

    private fun answerQuestion() {

        val counter = Random.nextInt(3)
        answerTextResult.text = answers[counter]

    }

}