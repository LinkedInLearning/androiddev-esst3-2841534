package com.example.myapplication

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val LOG_TAG = "MainViewModel"

class MainViewModel : ViewModel() {

    private val _info : MutableLiveData<Int> = MutableLiveData()
    val info: LiveData<Int> = _info

    init {
        Log.i(LOG_TAG, "created")
        _info.value = 0
    }

    fun loadData() {
        _info.value = _info.value!! + 1
    }
}