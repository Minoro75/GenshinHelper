package io.minoro75.genshinhelper.presentation.character_details.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import io.minoro75.genshinhelper.presentation.character_details.CharacterDetailsScreenViewModel

@Composable
fun CharacterScreen(
    name:String,
    viewModel: CharacterDetailsScreenViewModel = hiltViewModel()
){
    val state = viewModel.state

    if (state.isLoading){
    CircularProgressIndicator(modifier = Modifier.size(20.dp))
    }
    else if (state.errorMessage == null){
        Column(modifier =
        Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp
            )) {

            state.characterDetails?.let {character ->


            }
            
        }
    }
}