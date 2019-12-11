package com.example.trykoin.cpage

import com.example.trykoin.datasource.HelloRepository

class CPresenter(private val view: Contract.View,
                 private val repo: HelloRepository)
    : Contract.Presenter {

    override fun loadData() {
        view.setText("${repo.giveHello()}: C")
    }
}
