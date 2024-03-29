package com.example.trykoin.apage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.trykoin.R
import com.example.trykoin.SharedViewModel
import kotlinx.android.synthetic.main.a_fragment.*
import org.koin.android.viewmodel.ext.android.sharedViewModel
import org.koin.android.viewmodel.ext.android.viewModel


class AFragment : Fragment() {

    private val viewModel: AViewModel by viewModel()
//    private val viewModel: AViewModel by sharedViewModel()

    private val sharedViewModel: SharedViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.a_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.getTextData().observe(this, Observer {
            textView.text = it
        })

        sharedViewModel.getSharedData().observe(this, Observer {
            textView2.text = it
        })
    }
}
