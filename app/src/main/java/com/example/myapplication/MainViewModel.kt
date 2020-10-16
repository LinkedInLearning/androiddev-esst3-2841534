package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val PRICE_PER_OLIVE = 5

class MainViewModel : ViewModel() {

    private val _quantity: MutableLiveData<Int> = MutableLiveData(0)
    val quantity: LiveData<Int> = _quantity

    private val _totalAmount: MutableLiveData<Int> = MutableLiveData()
    val totalAmount: LiveData<Int> = _totalAmount

    fun increaseQuantity() {
        _quantity.value = _quantity.value!! + 1
    }

    fun decreaseQuantity() {
        _quantity.value = _quantity.value!! - 1
    }

    fun checkout() {
        _totalAmount.value = _quantity.value!! * PRICE_PER_OLIVE
    }

}