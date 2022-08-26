package io.minoro75.genshinhelper.presentation.common

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import io.minoro75.genshinhelper.R

@Composable
fun GenshinBottomNavigation(){
    NavigationBar(containerColor = MaterialTheme.colorScheme.background) {
        NavigationBarItem(selected = true,
            icon = { Icon(painter = painterResource(id = R.drawable.geo), contentDescription = "")},
            label = { Text(text = "Main")},
            onClick = { /*TODO*/ })

        NavigationBarItem(selected = false,
            icon = { Icon(painter = painterResource(id = R.drawable.cryo), contentDescription = "")},
            label = { Text(text = "Characters")},
            onClick = { /*TODO*/ })

        NavigationBarItem(selected = false,
            icon = { Icon(painter = painterResource(id = R.drawable.electro), contentDescription = "")},
            label = { Text(text = "Settings")},
            onClick = { /*TODO*/ })
    }
}