package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityMainBinding

const val LOG_TAG = "lifecycle_monitor"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i(LOG_TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG, "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG, "onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG, "onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG, "onDestroy")
    }
}