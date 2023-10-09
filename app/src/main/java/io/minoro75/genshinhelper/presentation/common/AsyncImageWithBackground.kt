package io.minoro75.genshinhelper.presentation.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun AsyncImageWithBackground(
    url: String,
    contentDescription: String?,
    @DrawableRes placeholder: Int,
    @DrawableRes error: Int,
    contentScale: ContentScale,
    @DrawableRes background: Int,
    @DrawableRes elementImage: Int?,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = modifier.matchParentSize()

        )
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(url)
                .crossfade(true)
                .build(),
            contentDescription = contentDescription,
            placeholder = painterResource(id = placeholder),
            error = painterResource(id = error),
            contentScale = contentScale,
            modifier = modifier.matchParentSize()
        )

        if (elementImage != null) {
            Image(
                painter = painterResource(id = elementImage),
                contentDescription = null,
                modifier = Modifier
                    .padding(3.dp)
                    .size(30.dp)
                    .align(Alignment.TopStart)
            )
        }
    }
}
