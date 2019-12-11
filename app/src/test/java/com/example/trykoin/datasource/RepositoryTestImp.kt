package com.example.trykoin.datasource

import com.example.trykoin.HelloRepository

class RepositoryTestImp : HelloRepository {
    override fun giveHello(): String {
        return "Hello Test"
    }
}