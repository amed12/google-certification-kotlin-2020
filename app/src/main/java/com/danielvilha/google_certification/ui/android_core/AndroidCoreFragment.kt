package com.danielvilha.google_certification.ui.android_core

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R

class AndroidCoreFragment : Fragment() {

    companion object {
        fun newInstance() = AndroidCoreFragment()
    }

    private lateinit var viewModel: AndroidCoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_android_core, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AndroidCoreViewModel::class.java)
        // TODO: Use the ViewModel
    }

}