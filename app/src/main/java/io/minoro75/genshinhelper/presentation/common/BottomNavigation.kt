package io.minoro75.genshinhelper.presentation.common

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import io.minoro75.genshinhelper.R

@Preview
@Composable
fun GenshinBottomNavigation(){
    NavigationBar(containerColor = MaterialTheme.colorScheme.background) {
        NavigationBarItem(selected = true,
            icon = {
                Icon(imageVector =Icons.Default.Home , contentDescription = "")
                },
            label = { Text(text = "Main")},
            onClick = { /*TODO*/ })

        NavigationBarItem(selected = false,
            icon = { Icon(imageVector = Icons.Default.Person, contentDescription = "" )},
            label = { Text(text = "Characters")},
            onClick = { /*TODO*/ })

        NavigationBarItem(selected = false,
            icon = { Icon(imageVector = Icons.Default.Settings, contentDescription = "" )},
            label = { Text(text = "Settings")},
            onClick = { /*TODO*/ })
    }
}