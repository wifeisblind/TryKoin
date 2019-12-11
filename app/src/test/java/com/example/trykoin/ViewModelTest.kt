package com.example.trykoin

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import org.mockito.Mock

class ViewModelTest : KoinTest {

    private val viewModelA: AViewModel by inject()

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock lateinit var testObserver: Observer<String>

    @Before
    fun before() {
        startKoin {
            modules(appModule)
        }
    }

    @Test
    fun `declareMock with KoinTest`() {

        var uiData: String? = null


        viewModelA.getTextData().observeForever{
            uiData = it
        }

        print(uiData)
    }
}