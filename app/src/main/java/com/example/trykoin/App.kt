package com.example.trykoin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Koin Android logger
            androidLogger()
            //inject Android context
            androidContext(this@App)
            // use modules
            modules(appModule)
        }
    }
}
//
//val appModule = module {
//
//    // create a Presenter instance with injection of R.string.mystring resources from Android
//    factory {
//        MyPresenter(androidContext().resources.getString(R.string.mystring))
//    }
//}