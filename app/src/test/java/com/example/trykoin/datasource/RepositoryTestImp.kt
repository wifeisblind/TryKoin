package com.example.trykoin.datasource

class RepositoryTestImp : HelloRepository {
    override fun giveHello(): String {
        return "Hello Test"
    }
}