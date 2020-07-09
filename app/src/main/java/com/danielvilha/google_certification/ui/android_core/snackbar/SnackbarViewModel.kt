package com.danielvilha.google_certification.ui.android_core.snackbar

import android.R
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.google.android.material.snackbar.Snackbar


class SnackbarViewModel : ViewModel() {

    private var snackBar: Snackbar? = null

    private fun toastAction(context: Context) {
        Toast.makeText(context, "Toast Text", Toast.LENGTH_LONG).show()
    }

    fun makeSnackbar(view: View) {
        Snackbar.make(view, "Long Snackbar", Snackbar.LENGTH_LONG).show()
    }

    fun makeLengthIndefiniteSnackbar(view: View) {
        if (snackBar == null || !snackBar?.isShown!!) {
            snackBar = Snackbar.make(view, "Length Indefinite Snackbar", Snackbar.LENGTH_INDEFINITE)
            snackBar?.show()
        } else {
            snackBar?.dismiss()
        }
    }

    fun makeActionTextColorSnackbar(view: View, context: Context) {
        Snackbar.make(view, "Action Text Color Snackbar", Snackbar.LENGTH_LONG)
            .setAction("Action") {
                toastAction(context)
            }
            .setActionTextColor(Color.GREEN)
            .show()
    }

    fun makeColorfulSnackbar(view: View, context: Context) {
        Snackbar.make(view, "Colorful Snackbar", Snackbar.LENGTH_LONG)
            .setTextColor(Color.GREEN)
            .setAction("Action") {
                toastAction(context)
            }
            .setActionTextColor(Color.BLUE)
            .setBackgroundTint(Color.RED)
            .show()
    }

    fun makeBackgroundTintList(view: View, context: Context) {
        val states = arrayOf(
            intArrayOf(R.attr.state_enabled),
            intArrayOf(-R.attr.state_enabled),
            intArrayOf(-R.attr.state_checked),
            intArrayOf(R.attr.state_pressed)
        )

        val colorsTint = intArrayOf(
            Color.BLACK,
            Color.RED,
            Color.GREEN,
            Color.BLUE
        )

        val colorsText = intArrayOf(
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.BLACK
        )

        val listTint = ColorStateList(states, colorsTint)
        val listText = ColorStateList(states, colorsText)

        Snackbar.make(view, "Background tint list Snackbar", Snackbar.LENGTH_INDEFINITE)
            .setAction("Action") {
                toastAction(context)
            }
            .setBackgroundTintList(listTint)
            .setActionTextColor(listText)
            .show()
    }
}