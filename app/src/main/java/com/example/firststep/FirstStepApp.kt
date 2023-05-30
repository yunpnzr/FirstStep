package com.example.firststep

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.firststep.ui.onboarding.App
import com.example.firststep.ui.theme.FirstStepTheme

@Composable
fun FirstStepApp () {
    App()
}

@Preview(showBackground = true)
@Composable
fun FirstStepAppPreview(){
    FirstStepTheme {
        FirstStepApp()
    }
}