package com.example.calculateyourage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val ageInput = findViewById<EditText>(R.id.editAge)
        val calculateButton = findViewById<Button>(R.id.btnCalculate)
        val resultText = findViewById<TextView>(R.id.resultText)

        calculateButton.setOnClickListener {

            val age = ageInput.text.toString().toInt()

            val yearsTo100 = 100 - age
            val ageMonths = age * 12
            val ageDays = age * 365
            val remainder = age % 5

            val results = """
                Years until 100: $yearsTo100
                Age in months: $ageMonths
                Age in days: $ageDays
                Remainder when age is divided by 5: $remainder
            """.trimIndent()

            resultText.text = results
        }
    }
}