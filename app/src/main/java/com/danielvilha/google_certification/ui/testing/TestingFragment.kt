package com.danielvilha.google_certification.ui.testing

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R

class TestingFragment : Fragment() {

    companion object {
        fun newInstance() = TestingFragment()
    }

    private lateinit var viewModel: TestingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_testing, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(TestingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}