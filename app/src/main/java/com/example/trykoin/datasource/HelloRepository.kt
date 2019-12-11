package com.example.trykoin.datasource

interface HelloRepository {
    fun giveHello(): String
}

class HelloRepositoryImp(): HelloRepository {
    override fun giveHello(): String {
        return "Hello Koin"
    }
}