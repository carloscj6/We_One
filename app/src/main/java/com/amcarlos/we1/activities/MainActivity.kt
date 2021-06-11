package com.amcarlos.we1.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amcarlos.we1.R
import splitties.toast.toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user:String?= null
        if (user==null){
            toast("User null, must log In")
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }
    }
}