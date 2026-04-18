package com.gitia.cartnova.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gitia.cartnova.R
import com.gitia.cartnova.ui.theme.darkestblue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){


    Column(

        modifier = Modifier.fillMaxSize()



    ) {

        //TopAppBar

        TopAppBar(
            title = {Text(text = "Home")},
            navigationIcon = {

                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = "Menu"
                    )
                }

            },

            actions = {

                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_shop),
                        contentDescription = "ShoppingCart"
                    )
                }

                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_notifications),
                        contentDescription = "Notifications"
                    )
                }

            },

            colors = TopAppBarDefaults.topAppBarColors(

                containerColor = darkestblue,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White,
                titleContentColor = Color.White

            )
        )

        //End of TopAppBar







































    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){

    HomeScreen()



}