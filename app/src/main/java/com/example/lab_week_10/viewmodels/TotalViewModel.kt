package com.example.lab_week_10.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel : ViewModel() {

    // private mutable
    private val _total = MutableLiveData<Int>().apply { value = 0 }

    // public immutable
    val total: LiveData<Int> = _total

    fun incrementTotal() {
        val current = _total.value ?: 0
        _total.value = current + 1
    }
}
