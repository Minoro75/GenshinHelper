package io.minoro75.genshinhelper.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.squareup.moshi.adapter
import dagger.hilt.android.AndroidEntryPoint
import io.minoro75.genshinhelper.domain.model.CharacterModel
import io.minoro75.genshinhelper.presentation.characters_list_screen.composables.CharactersListScreen
import io.minoro75.genshinhelper.presentation.theme.GenshinHelperTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            GenshinHelperTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CharactersListScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GenshinHelperTheme {
        Greeting("Android")
    }
}