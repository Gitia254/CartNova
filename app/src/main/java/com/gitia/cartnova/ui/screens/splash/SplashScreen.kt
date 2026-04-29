package com.gitia.cartnova.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gitia.cartnova.R
import com.gitia.cartnova.navigation.ROUTE_ONBOARDINGSCREEN1
import com.gitia.cartnova.ui.theme.darkestblue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(@SuppressLint("CoroutineCreationDuringComposition") navController: NavController){

    //navigation

    val x = rememberCoroutineScope()

    x.launch {

        delay(1500)
        navController.navigate(ROUTE_ONBOARDINGSCREEN1)


    }


    //end of navigation


    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(darkestblue)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center



    ) {

        Image(
            painter = painterResource(R.drawable.cart),
            contentDescription = "Cart",
            modifier = Modifier.size(200.dp)


        )





























    }


}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

   SplashScreen(rememberNavController())



}