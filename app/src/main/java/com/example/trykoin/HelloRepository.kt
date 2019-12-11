package com.example.trykoin

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImp(): HelloRepository {
    override fun giveHello(): String {
        return "Hello Koin"
    }
}