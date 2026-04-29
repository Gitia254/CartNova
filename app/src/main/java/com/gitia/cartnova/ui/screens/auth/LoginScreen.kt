package com.gitia.cartnova.ui.screens.auth



import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gitia.cartnova.navigation.ROUTE_HOME
import com.gitia.cartnova.navigation.ROUTE_REGISTER
import com.gitia.cartnova.ui.theme.black
import com.gitia.cartnova.ui.theme.darkestblue
import com.gitia.cartnova.ui.theme.white

@Composable
fun LoginScreen(

    navController: NavController

){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(com.gitia.cartnova.R.drawable.back), contentScale = ContentScale.FillBounds)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


        ) {


        Image(
            painter = painterResource(com.gitia.cartnova.R.drawable.cart),
            contentDescription = "Cart",
            modifier = Modifier.size(200.dp)


        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Welcome back!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = white



        )

        Spacer(modifier = Modifier.height(20.dp))

        //Variables


        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }


        //end of variables



        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
            label = { Text(text = "Email")},
            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            colors = OutlinedTextFieldDefaults.colors(

                unfocusedBorderColor = white,
                focusedBorderColor = darkestblue,
                unfocusedLeadingIconColor = white,
                focusedLeadingIconColor = darkestblue,
                unfocusedLabelColor = white,
                focusedLabelColor = darkestblue,
                focusedTextColor = white,
                cursorColor = white

            ),


            )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
            label = { Text(text = "Password")},
            leadingIcon = {Icon(imageVector = Icons.Default.Lock, contentDescription = "password")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(

                unfocusedBorderColor = white,
                focusedBorderColor = darkestblue,
                unfocusedLeadingIconColor = white,
                focusedLeadingIconColor = darkestblue,
                unfocusedLabelColor = white,
                focusedLabelColor = darkestblue,
                focusedTextColor = white,
                cursorColor = white


            ),
            visualTransformation = PasswordVisualTransformation()


        )





        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(darkestblue),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)






            ) {
            Text(text = "Sign in")

        }

        Spacer(modifier = Modifier.height(5.dp))

        TextButton(

            onClick = {navController.navigate(ROUTE_REGISTER)},
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color.White

            )


            ) {

            Text(text = "Don't have an account? Register")

        }

        TextButton(

            onClick = {navController.navigate(ROUTE_HOME)},
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color.White

            )


        ) {

            Text(
                text = "Enter as guest",
                textDecoration = TextDecoration.Underline
                )

        }

















































    }


}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){

    LoginScreen(rememberNavController())



    }