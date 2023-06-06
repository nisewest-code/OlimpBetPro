package com.olim.pbe.tpro.delegate

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.olim.pbe.tpro.R

class BoardDelegateSettings: View.OnClickListener {

    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> (v.context as AppCompatActivity).finish()
        }
    }
}