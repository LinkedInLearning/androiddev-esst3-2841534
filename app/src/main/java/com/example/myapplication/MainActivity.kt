package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel by viewModels<MainViewModel>()

        binding.addQuantityButton.setOnClickListener { viewModel.increaseQuantity() }
        binding.removeQuantityButton.setOnClickListener { viewModel.decreaseQuantity() }
        binding.checkoutButton.setOnClickListener { viewModel.checkout() }

        viewModel.quantity.observe(this) { TODO("Not yet implemented") }
        viewModel.totalAmount.observe(this) { TODO("Not yet implemented") }
    }

    private fun updateTotalCount(total: Int) {
       binding.total.text = total.toString()
    }

    private fun handleCheckout(totalAmount: Int) {
        Toast.makeText(
            this,
            getString(R.string.total_message, totalAmount),
            Toast.LENGTH_SHORT
        ).show()
    }
}