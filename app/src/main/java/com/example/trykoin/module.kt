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

    /**
     *single definition: create an object that persistent with the entire container lifetime (can’t be dropped).
     * 簡單說就是Singleton
     */
    single<HelloRepository> { HelloRepositoryImp() }

    /**
     *factory definition: create a new object each time. Short live. No persistence in the container (can’t be shared).
     * 靜態工廠，每次都會new 一個新的物件
     */
    factory<Contract.Presenter> {(view: Contract.View) ->
        CPresenter(view, get())
    }

    /**
     * To help declare a ViewMode component and bind it to an Android Component lifecycle.
     * 為了使ViewModel綁定 LifeCycle而寫的一個 extension library
     */
    viewModel {
        AViewModel(get())
    }
    viewModel {
        BViewModel(get())
    }
}