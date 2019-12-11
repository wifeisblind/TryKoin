package com.example.trykoin.di

import com.example.trykoin.apage.AViewModel
import com.example.trykoin.datasource.HelloRepository
import com.example.trykoin.datasource.RepositoryTestImp
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val test_module = module {
    single<HelloRepository> { RepositoryTestImp() }
    viewModel { AViewModel(get()) }
}