package com.example.homework14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework14.databinding.FragmentParcelsBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: FragmentParcelsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentParcelsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}