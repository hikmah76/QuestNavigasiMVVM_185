package com.example.p6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.p6.ui.theme.viewmodel.MahasiswaViewModel

enum class  Halaman {
    Form,
    Data
}
@Composable
fun Navigasi (
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostcontroller = rememberNavContoller()

) {
    Scaffold { paddingValues ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost (
            modifier = modifier.padding(paddingValues),
            navController = navHost,
            startDestination = Halaman.Form.name
        ){

        }
    }
}