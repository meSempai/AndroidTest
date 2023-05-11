package com.example.yourtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yourtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            CalculateBtn.setOnClickListener {
                resultTv.text =
                    Math().add(firstName.text.toString(), secondnName.text.toString())
            }
            devideBtn.setOnClickListener {
                resultTv.text =
                    Math().divide(firstName.text.toString(), secondnName.text.toString())
            }
        }
    }
}