package com.example.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    init {
        Log.i("MainViewModel", "created")
    }

    fun loadData() {
        Log.i("MainViewModel", "load data")
    }
}