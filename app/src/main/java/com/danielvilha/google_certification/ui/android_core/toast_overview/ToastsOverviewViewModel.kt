package com.danielvilha.google_certification.ui.android_core.toast_overview

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.danielvilha.google_certification.R

class ToastsOverviewViewModel : ViewModel() {

    fun basicToast(context: Context) {
        Toast.makeText(context, "Hello toast!", Toast.LENGTH_SHORT).show()
    }

    fun positioningToast(context: Context) {
        val toast = Toast.makeText(context, "Hello position top toast!", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0, 0)
        toast.show()
    }

    fun creatingCustomToast(context: Context) {
        val layout = LayoutInflater.from(context).inflate(R.layout.toast_custom, null)
        val text: TextView = layout.findViewById(R.id.text)
        text.text = "This is a custom toast!"
        with (Toast(context)) {
            setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }
}