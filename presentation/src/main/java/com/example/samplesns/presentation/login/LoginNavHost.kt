package com.example.samplesns.presentation.login

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginNavHost() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = LoginRoute.WelcomeScreen.name,
    ) {
        composable(route = LoginRoute.WelcomeScreen.name) {
            WelcomeScreen(
                onNavigateToLoginScreen = {
                    navController.navigate(route = LoginRoute.LoginScreen.name)
                }
            )
        }
        composable(route = LoginRoute.LoginScreen.name) {
            LoginScreen()
        }
        composable(route = LoginRoute.SignUpScreen.name) {
            SignUpScreen(
                id = TODO(),
                username = TODO(),
                password1 = TODO(),
                password2 = TODO(),
                onIdChange = TODO(),
                onUsernameChange = TODO(),
                onPassword1Change = TODO(),
                onPassword2Change = TODO(),
                onSignUpClick = TODO()
            )
        }
    }
}