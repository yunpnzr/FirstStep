package com.example.firststep.ui.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.firststep.R
import com.example.firststep.ui.theme.FirstStepTheme

@Composable
fun OnBoarding(
    image: Int,
    text: String
){
    Column(

    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingPreview(){
    FirstStepTheme {
        OnBoarding(R.drawable.onboarding_one,"Welcome to FirstStep!")
    }
}