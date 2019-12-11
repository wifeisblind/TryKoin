package com.example.trykoin

import androidx.lifecycle.ViewModel

class MyViewModel(val repo: HelloRepository) : ViewModel() {
    fun sayHello() = "${repo.giveHello()} from $this"
}