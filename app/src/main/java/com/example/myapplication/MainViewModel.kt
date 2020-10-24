package com.example.myapplication

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val LOG_TAG = "MainViewModel"

class MainViewModel : ViewModel() {

    private val _info : MutableLiveData<Int> = MutableLiveData(0)
    val info: LiveData<Int> = _info

    fun loadData() {
        _info.value = _info.value!! + 1
    }
}