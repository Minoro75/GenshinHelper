package io.minoro75.genshinhelper.presentation.map

import android.annotation.SuppressLint
import android.view.ViewGroup
import android.webkit.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.marginTop
import com.google.accompanist.insets.LocalWindowInsets

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun MapScreen() {

    val padding = WindowInsets.statusBars.asPaddingValues()
    Column(
        Modifier
            .fillMaxSize()
            .padding(padding)) {

        AndroidView(factory = {
            WebView(it).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webChromeClient = WebChromeClient()
                settings.javaScriptEnabled = true
                settings.userAgentString = System.getProperty("xml.agent")
                settings.allowContentAccess = true
                settings.databaseEnabled = true
                settings.domStorageEnabled = true

                loadUrl("https://act.hoyolab.com/ys/app/interactive-map/index.html?lang=en-us#/map/2")
            }
        },
            update = {}
        )
    }
}

