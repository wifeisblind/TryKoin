package com.example.trykoin.di

import com.example.trykoin.AViewModel
import com.example.trykoin.BViewModel
import com.example.trykoin.HelloRepository
import com.example.trykoin.datasource.RepositoryTestImp
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val test_module = module {
    single<HelloRepository> { RepositoryTestImp() }
    viewModel { AViewModel(get()) }
}