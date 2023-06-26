package com.example.tutorial3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class answer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        var txtanswer = findViewById<TextView>(R.id.answer)
        txtanswer.setText(intent.getDoubleExtra("answer",0.0).toString())
        var back = findViewById<Button>(R.id.back)

        back.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}