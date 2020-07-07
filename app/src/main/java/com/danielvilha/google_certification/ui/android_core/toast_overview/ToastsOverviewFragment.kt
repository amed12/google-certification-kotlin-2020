package com.danielvilha.google_certification.ui.android_core.toast_overview

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R
import kotlinx.android.synthetic.main.fragment_toasts_overview.*

class ToastsOverviewFragment : Fragment() {

    companion object {
        fun newInstance() = ToastsOverviewFragment()
    }

    private lateinit var viewModel: ToastsOverviewViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_toasts_overview, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ToastsOverviewViewModel::class.java)

        button_the_basic.setOnClickListener {
            viewModel.basicToast(requireContext())
        }

        button_positioning_your_toast.setOnClickListener {
            viewModel.positioningToast(requireContext())
        }

        button_creating_custom_toast.setOnClickListener {
            viewModel.creatingCustomToast(requireContext())
        }
    }
}