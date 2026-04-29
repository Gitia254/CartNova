package com.gitia.cartnova.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gitia.cartnova.R
import com.gitia.cartnova.navigation.ROUTE_REGISTER
import com.gitia.cartnova.ui.theme.darkestblue
import com.gitia.cartnova.ui.theme.white

@Composable
fun OnboardingScreen1(

    navController: NavController

){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(com.gitia.cartnova.R.drawable.back), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {

        Image(
            painter = painterResource(R.drawable.cart),
            contentDescription = "Cart",
            modifier = Modifier.size(200.dp)


        )


        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "Welcome to Cartnova",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            color = darkestblue,

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Millions of products await you in our vast market!",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            color = white
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate(ROUTE_REGISTER)
            },
            colors = ButtonDefaults.buttonColors(darkestblue),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.width(370.dp)

        ) {
            Text(text = "Get Started Now!")

        }

































    }


}

@Preview(showBackground = true)
@Composable
fun OnboardingScreen1Preview(){

    OnboardingScreen1(rememberNavController())



}