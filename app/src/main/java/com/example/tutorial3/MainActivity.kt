package com.example.tutorial3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.tutorial3.models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var ednumber1 :EditText
    lateinit var  ednumber2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.design_activity_main)

        ednumber1 = findViewById(R.id.number1)
        ednumber2 = findViewById(R.id.number2)
    }

    fun buttonClick(v:View){
        var ans = 0.0
        val calculator = Calculator(
            ednumber1.text.toString().toDouble(),
            ednumber2.text.toString().toDouble())

        when(v.id) {
            R.id.plus -> ans = calculator.add()
            R.id.minus -> ans = calculator.substract()
            R.id.multiple -> ans = calculator.multiply()
            R.id.divide -> ans = calculator.divide()
        }
        println(ans)

        val intent = Intent (this,answer::class.java)
        intent.putExtra("answer",ans)
        startActivity(intent)
        finish()
    }
}