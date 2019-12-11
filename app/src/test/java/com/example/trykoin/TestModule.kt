package com.example.trykoin

import com.example.trykoin.di.testModule
import org.junit.Test
import org.koin.dsl.koinApplication
import org.koin.test.KoinTest
import org.koin.test.check.checkModules

/**
 * KoinTest 就是KoinComponent，implement KoinComponent的class都
 * 能使用inject(), get()
 */
class TestModule : KoinTest {

    //使用appModule會fail
    @Test
    fun `checking module`() {
        koinApplication { modules(testModule) }.checkModules()
    }
}