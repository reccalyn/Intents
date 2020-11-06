package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        findViewById<Button>(R.id.calendarBtn).setOnClickListener { showCalendar() }
        findViewById<Button>(R.id.wifiBtn).setOnClickListener { showWifi() }
        findViewById<Button>(R.id.messagesBtn).setOnClickListener { showMessages() }
        findViewById<Button>(R.id.settingsBtn).setOnClickListener { showSettings() }
        findViewById<Button>(R.id.alarmBtn).setOnClickListener { showAlarm() }
    }

    private fun showCalendar(){

    }

    private fun showWifi(){

    }

    private fun showMessages(){

    }

    private fun showSettings(){

    }

    private fun showAlarm(){

    }
}