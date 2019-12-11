package com.example.trykoin

import org.junit.Test
import org.koin.dsl.koinApplication
import org.koin.test.KoinTest
import org.koin.test.check.checkModules

class TestModule : KoinTest {

    @Test
    fun `checking module`() {
        koinApplication { modules(appModule) }.checkModules()
    }
}