package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.toolbarLayout.title = getString(R.string.app_name)

        viewModel.info.observe(this) {
            displaySnackbar(it)
        }
        binding.fab.setOnClickListener {
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_share -> handleShare()
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun handleShare(): Boolean {
        val intent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT,
                    "I just purchased ${viewModel.info.value} bottles of olive oil!")
        }
        startActivity(intent)
        return true
    }
}