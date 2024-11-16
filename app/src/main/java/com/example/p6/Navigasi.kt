package com.example.p6

import androidx.compose.runtime.Composable
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

}