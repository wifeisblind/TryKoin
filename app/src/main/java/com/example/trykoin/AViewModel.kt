package com.example.trykoin

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AViewModel(private val repo: HelloRepository) : ViewModel() {

    private val textA: MutableLiveData<String> = MutableLiveData()

    fun getTextData(): LiveData<String> {
        return textA.also {
            textA.value = "${repo.giveHello()}: A"
        }
    }

    override fun onCleared() {
        Log.d(this::class.java.simpleName, "onCleared")
    }
}
