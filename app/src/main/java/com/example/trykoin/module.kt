package com.example.trykoin

import com.example.trykoin.apage.AViewModel
import com.example.trykoin.bpage.BViewModel
import com.example.trykoin.cpage.CFragment
import com.example.trykoin.cpage.CPresenter
import com.example.trykoin.cpage.Contract
import com.example.trykoin.datasource.HelloRepository
import com.example.trykoin.datasource.HelloRepositoryImp
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {

    single<HelloRepository> { HelloRepositoryImp() }

    factory<Contract.Presenter> {(view: Contract.View) ->
        CPresenter(view, get())
    }
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