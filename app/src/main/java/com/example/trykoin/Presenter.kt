package com.example.trykoin

class Presenter(val repo: HelloRepository) {
    fun sayHello() = "${repo.giveHello()} from $this"
}