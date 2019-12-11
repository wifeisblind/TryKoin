package com.example.trykoin.cpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.trykoin.R
import kotlinx.android.synthetic.main.a_fragment.*
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class CFragment : Fragment(), Contract.View {

    private val presenter: Contract.Presenter by inject{ parametersOf(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.a_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        presenter = get { parametersOf(this) }

        presenter.loadData()
    }

    override fun setText(text: String) {
        textView.text = text
    }
}
