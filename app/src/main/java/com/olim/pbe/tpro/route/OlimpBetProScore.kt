package com.olim.pbe.tpro.route

import android.view.ViewGroup
import android.webkit.CookieManager
import android.webkit.WebView


class OlimpBetProScore(val webView: WebView, callback: (item: OlimpBetProScore)->Unit) {

    init {
        webView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        callback(this)
    }
    fun initSettings() {
        CookieManager.getInstance().setAcceptThirdPartyCookies( webView, true)
        CookieManager.getInstance().setAcceptCookie(true)
        webView.setOnTouchListener { _, _ ->
            CookieManager.getInstance().flush()
            false
        }
    }
}