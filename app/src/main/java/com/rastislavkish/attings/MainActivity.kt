package com.rastislavkish.attings

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.provider.Settings

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))

        finish()
        }
    }
