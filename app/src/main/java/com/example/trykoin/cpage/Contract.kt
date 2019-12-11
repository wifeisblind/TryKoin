package com.example.trykoin.cpage

interface Contract {

    interface View {
        fun setText(text: String)
    }

    interface Presenter {
        fun loadData()
    }
}