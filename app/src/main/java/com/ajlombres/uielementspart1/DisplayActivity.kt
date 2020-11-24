package com.ajlombres.uielementspart1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val intentValue = intent.getStringExtra("FName")
        findViewById<TextView>(R.id.firstNameView).apply {
            text = intentValue.toString()
        }
        val intentValue2 = intent.getStringExtra("LName")
        findViewById<TextView>(R.id.lastNameView).apply {
            text = intentValue2.toString()
        }
        val intentValue3 = intent.getStringExtra("Email")
        findViewById<TextView>(R.id.emailView).apply {
            text = intentValue3.toString()
        }
        val intentValue4 = intent.getStringExtra("Num")
        findViewById<TextView>(R.id.NumView).apply {
            text = intentValue4.toString()
        }
        val intentValue5 = intent.getStringExtra("Date")
        findViewById<TextView>(R.id.birthdayView).apply {
            text = intentValue5.toString()
        }
    }
}
