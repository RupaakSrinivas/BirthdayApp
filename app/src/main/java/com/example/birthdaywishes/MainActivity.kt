package com.example.birthdaywishes

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createBirthdayCard(view: View) {

        val name = findViewById<EditText>(R.id.nameInput)
        Toast.makeText(this, "Name is ${name.editableText}", Toast.LENGTH_LONG).show()
    }
}