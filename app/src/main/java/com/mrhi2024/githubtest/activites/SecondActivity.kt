package com.mrhi2024.githubtest.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mrhi2024.githubtest.R
import com.mrhi2024.githubtest.databinding.ActivitySecond2Binding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecond2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}