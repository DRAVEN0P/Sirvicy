package com.example.sirvicy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var NavController = findNavController(R.id.fragmentContainerView13)
        var bottomnav = findViewById<BottomNavigationView>(R.id.bottomnavigationview)
        bottomnav.setupWithNavController(NavController)
    }
}

// heyy test comment !!
