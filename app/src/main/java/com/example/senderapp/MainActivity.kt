package com.example.senderapp

import android.app.Notification
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.senderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            Intent(Intent.ACTION_SEND).run {
                putExtra("username",binding.usernameField.text.toString())
                putExtra("age",binding.ageField.text.toString())
                type="text/plain"
                startActivity(Intent.createChooser(this, "Choose App"))
            }
        }
    }
}