package com.olim.pbe.tpro.delegate

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.olim.pbe.tpro.R
import com.olim.pbe.tpro.utils.FieldSupport

class BoardDelegateGame: View.OnClickListener {

    override fun onClick(v: View) {
        when (v.id) {
            R.id.back -> (v.context as AppCompatActivity).finish()
//            R.id.myach -> FieldSupport.supportBall(v)
        }
    }
}