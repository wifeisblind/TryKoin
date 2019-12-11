package com.example.trykoin

import org.junit.Test
import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.dsl.module

class TestKoin {

    data class HelloMessageData (val message: String = "Hello Koin!")

    interface HelloService {
        fun hello(): String
    }

    class HelloServiceImp(private val helloMessageData: HelloMessageData): HelloService {
        override fun hello(): String {
            return "Hey, ${helloMessageData.message}"
        }
    }

    class HelloApplication : KoinComponent {
        val helloService by inject<HelloService>()
        fun sayHello() = println(helloService.hello())
    }

    val helloModule = module {
        single { HelloMessageData() }

        single { HelloServiceImp(get()) as HelloService }
    }

    @Test
    fun startApplication() {
        startKoin {
            printLogger()
            modules(helloModule)
        }

        HelloApplication().sayHello()
    }
}