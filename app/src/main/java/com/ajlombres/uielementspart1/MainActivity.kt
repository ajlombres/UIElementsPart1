package com.ajlombres.uielementspart1

import android.app.DatePickerDialog
import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var emailAdd: EditText
    lateinit var phoneNum: EditText
    lateinit var dateTxt: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstName = findViewById(R.id.firstName)
        lastName = findViewById(R.id.lastName)
        emailAdd = findViewById(R.id.emailAdd)
        phoneNum = findViewById(R.id.phoneText)
        dateTxt = findViewById(R.id.dateText)
        val pickDatePickerDialog = findViewById<Button>(R.id.dateButton)
        val textView = findViewById<TextView>(R.id.dateText)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val switch_button = findViewById<Switch>(R.id.phoneSwitch)
        val phone_edit = findViewById<EditText>(R.id.phoneText)
        val button = findViewById<Button>(R.id.submitButton)

        button.setOnClickListener {
            val i = Intent(this, DisplayActivity::class.java).apply {
                putExtra("LName", lastName.text.toString())
                putExtra("FName", firstName.text.toString())
                putExtra("Email", emailAdd.text.toString())
                putExtra("Num", phoneNum.text.toString())
                putExtra("Date", dateTxt.text.toString())

            }

            startActivity(i)
        }

            pickDatePickerDialog.setOnClickListener {
                val dpd = DatePickerDialog(
                        this,
                        DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                            textView.setText("" + dayOfMonth + "/" + month + "/" + year)
                        },
                        year, month, day

                )
                dpd.show()
            }
        switch_button.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                phone_edit.visibility = (View.VISIBLE)
            } else {
                phone_edit.visibility = (View.INVISIBLE)
            }
        }

    }
}