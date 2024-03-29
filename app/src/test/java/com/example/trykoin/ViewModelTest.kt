package com.example.trykoin

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.trykoin.apage.AViewModel
import com.example.trykoin.di.testModule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

/**
 * KoinTest 就是KoinComponent，implement KoinComponent的class都
 * 能使用inject(), get()
 */
class ViewModelTest : KoinTest {

    private val viewModelA: AViewModel by inject()

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock lateinit var testObserver: Observer<String>

    @Before
    fun before() {
        MockitoAnnotations.initMocks(this)
        startKoin {
            modules(testModule)
        }
    }

    @Test
    fun `declareMock with KoinTest`() {

        viewModelA.getTextData().observeForever(testObserver)
        verify(testObserver).onChanged("Hello Test: A")

    }
}