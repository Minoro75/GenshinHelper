package io.minoro75.genshinhelper.presentation.character_details.composables

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import io.minoro75.genshinhelper.R

@Composable
fun YoutubeVideoPreviewView(
    videoId: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    OutlinedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        border = BorderStroke(2.dp, SolidColor(MaterialTheme.colorScheme.primary))
    ) {
        AsyncImage(
            model = "https://img.youtube.com/vi/${videoId}/maxresdefault.jpg",
            contentDescription = "Youtube video guide",
            contentScale = ContentScale.FillBounds,
            placeholder = painterResource(id = R.drawable.video_loading),
            error = painterResource(id = R.drawable.video_no_internet),
            modifier = modifier
                .fillMaxWidth()
                .clickable {
                    context.startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://www.youtube.com/watch?v=${videoId}")
                        )
                    )
                }
        )
    }
}

@Preview
@Composable
fun YoutubeVideoPreview() {
    YoutubeVideoPreviewView(videoId = "bLZ5nmVZXtw")
}