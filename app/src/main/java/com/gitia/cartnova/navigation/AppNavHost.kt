package com.gitia.cartnova.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gitia.cartnova.ui.screens.about.AboutScreen
import com.gitia.cartnova.ui.screens.auth.LoginScreen
import com.gitia.cartnova.ui.screens.auth.RegisterScreen
import com.gitia.cartnova.ui.screens.contact.ContactScreen
import com.gitia.cartnova.ui.screens.home.HomeScreen
import com.gitia.cartnova.ui.screens.intent.IntentScreen
import com.gitia.cartnova.ui.screens.onboarding.OnboardingScreen1
import com.gitia.cartnova.ui.screens.onboarding.OnboardingScreen2
import com.gitia.cartnova.ui.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }

        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }

        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)
        }

        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUTE_ONBOARDINGSCREEN1) {
            OnboardingScreen1(navController)
        }

        composable(ROUTE_ONBOARDINGSCREEN2) {
            OnboardingScreen2(navController)
        }

        composable(ROUTE_INTENT) {
            IntentScreen(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

    }
}