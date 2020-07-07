package com.danielvilha.google_certification.ui.debugging

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R

class DebuggingFragment : Fragment() {

    companion object {
        fun newInstance() = DebuggingFragment()
    }

    private lateinit var viewModel: DebuggingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_debugging, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DebuggingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}