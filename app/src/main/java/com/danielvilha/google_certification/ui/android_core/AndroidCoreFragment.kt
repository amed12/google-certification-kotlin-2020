package com.danielvilha.google_certification.ui.android_core

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R
import com.danielvilha.google_certification.ui.android_core.snackbar.SnackbarFragment
import com.danielvilha.google_certification.ui.android_core.toast_overview.ToastsOverviewFragment
import kotlinx.android.synthetic.main.fragment_android_core.*

class AndroidCoreFragment : Fragment() {

    private lateinit var viewModel: AndroidCoreViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_android_core, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AndroidCoreViewModel::class.java)

        button_toast.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, ToastsOverviewFragment.newInstance())
                .commit()
        }

        button_snackbar.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, SnackbarFragment.newInstance())
                .commit()
        }

    }
}