package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val PRICE_PER_OLIVE = 5

class MainViewModel : ViewModel() {

    private val _quantity: MutableLiveData<Int> = MutableLiveData(0)
    private val _totalAmount: MutableLiveData<Int> = MutableLiveData()
    // Expose variables for use in the MainActivity => quantity, totalAmount

    fun increaseQuantity() {
        TODO("Not yet implemented")
    }

    fun decreaseQuantity() {
        TODO("Not yet implemented")
    }

    fun checkout() {
        _totalAmount.value = _quantity.value!! * PRICE_PER_OLIVE
    }

}