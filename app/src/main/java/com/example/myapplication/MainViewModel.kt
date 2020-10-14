package com.example.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel

private const val LOG_TAG = "MainViewModel"

class MainViewModel : ViewModel() {

    init {
        Log.i(LOG_TAG, "created")
    }

    fun loadData() {
        Log.i(LOG_TAG, "load data")
    }
}