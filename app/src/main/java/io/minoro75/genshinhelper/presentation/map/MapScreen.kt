package io.minoro75.genshinhelper.presentation.map

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.util.Log
import android.view.ViewGroup
import android.webkit.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.accompanist.web.*
import io.minoro75.genshinhelper.common.Constants

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun MapScreen() {
    Column {

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

