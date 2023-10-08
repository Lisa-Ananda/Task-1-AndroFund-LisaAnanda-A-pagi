package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHome : Button = findViewById(R.id.btn_home)
        btnHome.setOnClickListener(this)
    }

    override fun onClick(V: View?) {
        when(V.id){
            R.id.btn_home ->{
                val message = "Halo"
                val intent = Intent()
                intent.action= Intent.ACTION_SEND
                intent.putExtras(Intent.EXTRA_TEXT, message)
                intent.type= "text/plain"
                startActivity(intent)
            }
        }
    }
}