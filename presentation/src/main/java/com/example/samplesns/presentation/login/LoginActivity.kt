package com.example.samplesns.presentation.login

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.samplesns.presentation.theme.SampleSNSTheme

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleSNSTheme {
                LoginNavHost()
            }
        }
    }
}