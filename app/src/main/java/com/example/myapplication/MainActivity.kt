package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.toolbarLayout.title = getString(R.string.app_name)

        val viewModel by viewModels<MainViewModel>()

        viewModel.info.observe(this) {
            displaySnackbar(it)
        }
        binding.fab.setOnClickListener { view ->
            viewModel.loadData()
        }
    }

    private fun displaySnackbar(count: Int) {
        Snackbar.make(
            binding.root,
            "Current value: $count",
            Snackbar.LENGTH_LONG
        ).show()
    }
}