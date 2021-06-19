package com.amcarlos.we1.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.amcarlos.we1.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginUser()
    }
    private fun loginUser(){
        val button:Button = findViewById(R.id.buttonLogin)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).putExtra("User","Cate"))
            finish()
        }
    }
}