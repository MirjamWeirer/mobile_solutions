package com.example.layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //viewBinding - im build.gradle eintragen, damit das funktioniert!
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //layout über viewBindin "inflaten" und als contentView zuweisen
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
    }



    override fun onStart() {
        super.onStart()

        //Zugriff auf den TextView aus dem Code heraus
        val clickMeButton: TextView = findViewById(R.id.clickMeButton)
        val displayView: TextView = findViewById(R.id.displayView)

        //OnClickListner zuweisen (es gibt mehrere Methoden, siehe dazu Skriptum)
        // -> das hier ist die Lambda Methode
        clickMeButton.setOnClickListener {
            displayView.text = "I have been clicked (old)!"
        }

        //Zugriff mittles viewBinding
//        binding.clickMeButton.setOnClickListener {
//            binding.displayView.text = "I have been clicked!"
//        }
    }
}