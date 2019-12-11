package com.example.trykoin.bpage

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.trykoin.datasource.HelloRepository

class BViewModel(private val repo: HelloRepository) : ViewModel() {
    private val text: MutableLiveData<String> = MutableLiveData()

    fun getText(): LiveData<String> {
        return text.also {
            text.value = "${repo.giveHello()} B"
        }
    }

    override fun onCleared() {
        Log.d(this::class.java.simpleName, "onCleared")
    }
}
