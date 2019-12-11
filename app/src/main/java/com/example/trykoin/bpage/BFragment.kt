package com.example.trykoin.bpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.trykoin.R
import kotlinx.android.synthetic.main.b_fragment.*
import org.koin.android.viewmodel.ext.android.viewModel


class BFragment : Fragment() {

    private val viewModel: BViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.b_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.getText().observe(this, Observer {
            textView.text = it
        })
    }
}
