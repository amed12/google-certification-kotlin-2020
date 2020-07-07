package com.danielvilha.google_certification.ui.data_management

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R

class DataManagementFragment : Fragment() {

    companion object {
        fun newInstance() = DataManagementFragment()
    }

    private lateinit var viewModel: DataManagementViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_data_management, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DataManagementViewModel::class.java)
        // TODO: Use the ViewModel
    }

}