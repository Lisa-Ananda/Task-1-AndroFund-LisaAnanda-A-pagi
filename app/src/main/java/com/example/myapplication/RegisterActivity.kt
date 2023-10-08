package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister : Button = findViewById(R.id.btn_Register)
btnRegister.setOnClickListener(this)
    }

    override fun onClick(V: View?) {
        when(V.id)
    R.id.btn_Register -> {
    val intent = Intent(this@RegisterActivity, LoginActivity :: class.java)
            startActivity(Intent())

        }

    }
}