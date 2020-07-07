package com.danielvilha.google_certification.ui.user_interface

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.danielvilha.google_certification.R

class UserInterfaceFragment : Fragment() {

    companion object {
        fun newInstance() = UserInterfaceFragment()
    }

    private lateinit var viewModel: UserInterfaceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user_interface, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(UserInterfaceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}