package com.example.smackapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.smackapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View) {

    }

    fun loginCreateUserClicked(view: View) {

        val createUserIntent = Intent(this, CreateUserActivity::class.java)
        startActivity(createUserIntent)


    }

}