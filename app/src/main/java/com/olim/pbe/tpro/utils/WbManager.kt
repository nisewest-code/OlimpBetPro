package com.olim.pbe.tpro.utils

import android.app.Activity
import android.content.Intent
import android.webkit.WebView
import androidx.activity.result.ActivityResultLauncher
import com.olim.pbe.tpro.board.BoardLaunch
import com.olim.pbe.tpro.board.WbCustom
import com.olim.pbe.tpro.databinding.ActivityBoardLaunchBinding
import com.olim.pbe.tpro.delegate.OlimpBetProTitel
import com.olim.pbe.tpro.delegate.OlimpBetEcplore
import com.olim.pbe.tpro.route.OlimpBetProScore

object WbManager {
    fun wbCustom(context: BoardLaunch, binding: ActivityBoardLaunchBinding, listener: ActivityResultLauncher<Intent>): WbCustom {
        return WbCustom(context, binding, listener)
    }

    fun olimpBetProScore(webView: WebView, callback: (item: OlimpBetProScore)->Unit): OlimpBetProScore {
        return OlimpBetProScore(webView, callback)
    }

    fun olimpBetProTitle(webView: WebView?, callback: (item: OlimpBetProTitel)->Unit): OlimpBetProTitel {
        return OlimpBetProTitel(webView,  callback)
    }

    fun olimpBetExplore(activity: MutableList<Activity?>, uri:String): OlimpBetEcplore {
        return OlimpBetEcplore(activity, uri)
    }
}