package com.gitia.cartnova.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gitia.cartnova.R
import com.gitia.cartnova.navigation.ROUTE_INTENT
import com.gitia.cartnova.ui.theme.darkestblue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {


    Column(

        modifier = Modifier
            .fillMaxSize()



    ) {

        //TopAppBar

        TopAppBar(
            title = { Text(text = "Home") },
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

        Spacer(modifier = Modifier.height(10.dp))

        //Search Bar

        var search by remember { mutableStateOf("") }

        TextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp, bottom = 10.dp),
            placeholder = { Text(text = "Search for products...") },
            leadingIcon = {  Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search")
            }
        )


        //End of Search Bar



        Text(
            text = "Featured Categories",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 10.dp)


            )

        Spacer(modifier = Modifier.height(10.dp))

        //Row

        Row(

            modifier = Modifier.padding(start = 10.dp).horizontalScroll(rememberScrollState())
        ) {

            //column one
            Column(

            ) {

                Image(
                    painter = painterResource(R.drawable.grocery),
                    contentDescription = "Grocery",
                    modifier = Modifier.size(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop


                )

                Text(
                    text = "Groceries",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,



                )

                Button(
                    onClick = {
                        navController.navigate(ROUTE_INTENT)
                    },
                    colors = ButtonDefaults.buttonColors(darkestblue),
                    shape = RoundedCornerShape(90.dp),


                ) {
                    Text(text = "Shop Now")

                }








            }

            Spacer(modifier = Modifier.width(10.dp))

            //column two
            Column() {

                Image(
                    painter = painterResource(R.drawable.electronics),
                        contentDescription = "Electronics",
                    modifier = Modifier.size(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop


                )

                Text(
                    text = "Electronics",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,



                    )

                Button(
                    onClick = {
                        navController.navigate(ROUTE_INTENT)
                    },
                    colors = ButtonDefaults.buttonColors(darkestblue),
                    shape = RoundedCornerShape(90.dp),


                    ) {
                    Text(text = "Shop Now")

                }








            }

            Column(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp)
            ) {

                Image(
                    painter = painterResource(R.drawable.electronics),
                    contentDescription = "Electronics",
                    modifier = Modifier.size(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop


                )

                Text(
                    text = "Electronics",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,



                    )

                Button(
                    onClick = {
                        navController.navigate(ROUTE_INTENT)
                    },
                    colors = ButtonDefaults.buttonColors(darkestblue),
                    shape = RoundedCornerShape(90.dp),


                    ) {
                    Text(text = "Shop Now")

                }








            }



        }



        //End of row







    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {

    HomeScreen(rememberNavController())


}