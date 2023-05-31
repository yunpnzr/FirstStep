package com.example.firststep

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firststep.component.Login
import com.example.firststep.component.Register
import com.example.firststep.component.SplashScreen
import com.example.firststep.navigation.Screen
import com.example.firststep.ui.theme.FirstStepTheme
import kotlin.system.exitProcess

@Composable
fun FirstStepApp () {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Screen.SplashScreen.route) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(Screen.Login.route) {
            Login(navController) {
                exitProcess(0)
            }
        }
        composable(Screen.Register.route) {
            Register(navController) {
                exitProcess(0)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstStepAppPreview(){
    FirstStepTheme {
        FirstStepApp()
    }
}