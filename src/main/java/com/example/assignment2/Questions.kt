package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val trueButton = findViewById<Button>(R.id.trueButton)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val textView = findViewById<TextView>(R.id.textView)
        val nextButton = findViewById<Button>(R.id.nextButton)

        val questions = arrayOf("The adult human body has 32 teeth." ,
        "Ford v Ferrari” (2019) is based on a true story" ,
            "Affect” is a verb, and “effect” is a noun" ,
            "All sentences must have a subject." ,
            "A preposition is always found at the beginning of a prepositional phrase."
        )
        val answers = arrayOf( true, true, true, true, true)

        val score = 0
    }
}