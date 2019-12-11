package com.example.trykoin

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val data: MutableLiveData<String> = MutableLiveData<String>().also {
        it.postValue(System.currentTimeMillis().toString())
    }

    fun getSharedData(): LiveData<String> {
        return data
    }

    override fun onCleared() {
        Log.d(this::class.java.simpleName, "onCleared")
    }
}