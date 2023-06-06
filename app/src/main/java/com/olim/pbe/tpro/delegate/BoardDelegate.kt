package com.olim.pbe.tpro.delegate

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.olim.pbe.tpro.R
import com.olim.pbe.tpro.board.BoardOlimpGame
import com.olim.pbe.tpro.board.BoardOlimpSettings
import com.olim.pbe.tpro.route.Router

class BoardDelegate: View.OnClickListener {

    override fun onClick(v: View) {
        when (v.id) {
            R.id.start -> Router.route(v.context, BoardOlimpGame::class.java)
            R.id.settings -> Router.route(v.context, BoardOlimpSettings::class.java)
            R.id.exit -> (v.context as AppCompatActivity).finish()
        }
    }
}