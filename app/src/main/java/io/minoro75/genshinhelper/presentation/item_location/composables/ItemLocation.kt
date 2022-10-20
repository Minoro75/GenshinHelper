package io.minoro75.genshinhelper.presentation.item_location.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.minoro75.genshinhelper.domain.model.HowToObtainItem
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme
import io.minoro75.genshinhelper.presentation.theme.GenshinTypography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemLocation(
    item: HowToObtainItem,
    modifier: Modifier = Modifier
) {
    GenshinHelperTheme {
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
            Column(modifier = Modifier.padding(8.dp)) {
                Text(text = item.name, modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center, style = GenshinTypography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimaryContainer)

                Spacer(modifier = Modifier.height(8.dp))

                Image(painter = painterResource(id = item.getImageResource())
                    , contentDescription = item.domainName,
                    alignment = Alignment.Center,
                modifier = modifier
                    .clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth()
                    )
                
                Spacer(modifier = Modifier.height(8.dp))

                Text(text = item.description, modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center, style = GenshinTypography.bodyMedium,
                    color = MaterialTheme.colorScheme.onPrimaryContainer)
            }

        }
    }
}

@Preview
@Composable
fun PreviewItemLocation() {
    GenshinHelperTheme {
        ItemLocation(
            item = HowToObtainItem(
                description = "You can collect Bloodjade Branch as a random reward from the Azhdaha domain located near Mt. Hulao.",
                name = "Bloodjade Branch",
                domainName = "Convert: Bloodjade Branch"
            )
        )
    }
}