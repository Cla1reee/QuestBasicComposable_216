package com.example.mylayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.mylayout.ui.theme.MyLayoutTheme

// Import fungsi composable yang Anda buat
import com.example.mylayout.TataletakBoxColumnRow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Ganti fungsi Greeting dengan TataletakBoxColumnRow
                    TataletakBoxColumnRow(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}