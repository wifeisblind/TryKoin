package com.example.trykoin

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {

    single<HelloRepository> { HelloRepositoryImp() }

//    factory {
//        Presenter(get())
//    }
//
//    scope(named<MainActivity>()) {
//        scoped { MyViewModel(get()) }
//    }

    viewModel {
        AViewModel(get())
    }
    viewModel {
        BViewModel(get())
    }
}