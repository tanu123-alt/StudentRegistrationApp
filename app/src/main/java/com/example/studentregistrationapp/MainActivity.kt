package com.example.studentregistrationapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.etName)
        val roll = findViewById<EditText>(R.id.etRoll)
        val email = findViewById<EditText>(R.id.etEmail)
        val phone = findViewById<EditText>(R.id.etPhone)
        val submit = findViewById<Button>(R.id.btnSubmit)

        submit.setOnClickListener {
            if (name.text.isEmpty() ||
                roll.text.isEmpty() ||
                email.text.isEmpty() ||
                phone.text.isEmpty()
            ) {
                Toast.makeText(this, "Fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG).show()
            }
        }
    }
}