package com.example.homework14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework14.databinding.FragmentItemsBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: FragmentItemsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentItemsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}