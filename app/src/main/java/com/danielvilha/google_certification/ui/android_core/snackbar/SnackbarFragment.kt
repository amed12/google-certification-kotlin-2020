package com.danielvilha.google_certification.ui.android_core.snackbar

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R
import kotlinx.android.synthetic.main.fragment_snackbar.*

class SnackbarFragment : Fragment() {

    companion object {
        fun newInstance() = SnackbarFragment()
    }

    private lateinit var viewModel: SnackbarViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_snackbar, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SnackbarViewModel::class.java)

        button_make_snackbar.setOnClickListener {
            viewModel.makeSnackbar(button_make_snackbar)
        }

        button_length_indefinite_snackbar.setOnClickListener {
            viewModel.makeLengthIndefiniteSnackbar(button_length_indefinite_snackbar)
        }

        button_action_text_color.setOnClickListener {
            viewModel.makeActionTextColorSnackbar(button_action_text_color, requireContext())
        }

        button_make_colorful_snackbar.setOnClickListener {
            viewModel.makeColorfulSnackbar(button_make_colorful_snackbar, requireContext())
        }

        button_colorful_snackbar.setOnClickListener {
            viewModel.makeBackgroundTintList(button_colorful_snackbar, requireContext())
        }
    }
}