package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.loginBtn).setOnClickListener {
            val user = findViewById<EditText>(R.id.usernameTxt)
            val username = user.text.toString();

            val pass = findViewById<EditText>(R.id.passwordTxt)
            val password = pass.text.toString();

    }
}