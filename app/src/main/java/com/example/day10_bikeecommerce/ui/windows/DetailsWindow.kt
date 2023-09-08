package com.example.day10_bikeecommerce.ui.windows

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.day10_bikeecommerce.R
import com.example.day10_bikeecommerce.ui.theme.primaryGreenBg
import com.example.day10_bikeecommerce.ui.theme.secondaryGreenSurface
import com.example.day10_bikeecommerce.ui.theme.textColor
import com.example.day10_bikeecommerce.ui.theme.textWhiteTranslucent
import com.example.day10_bikeecommerce.ui.theme.whiteTranslucent
import com.example.day10_bikeecommerce.ui.widgets.HeadingText
import com.example.day10_bikeecommerce.ui.widgets.IconMaker


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsWindow(navController: NavHostController) {
    Scaffold(
    ) {

        Column() {

        }
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .background(primaryGreenBg))
        {

            Row() {
                IconButton(onClick = { navController.popBackStack() },
                    modifier = Modifier.padding(20.dp)) {
                    Icon(painter = painterResource(id = R.drawable.arrow_back),
                        contentDescription = "back",
                        tint = textColor,
                        modifier = Modifier.size(25.dp))
                }
            }

            Row(horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = R.drawable.background_rectangle),
                    contentDescription = "", modifier = Modifier.size(220.dp),
                    tint = secondaryGreenSurface
                )
            }

            Column(horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 35.dp)) {
                Spacer(modifier = Modifier.height(90.dp))
                HeadingText(text = "ART", size = 70, color = whiteTranslucent)
                HeadingText(text = "BIKEs", size = 70, color = whiteTranslucent)

            }

            Column(
                Modifier
                    .fillMaxSize()
                    ) {
                Row(Modifier.fillMaxWidth().weight(1f),
                    horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom) {
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(painter = painterResource(id = R.drawable.bike_half),
                        contentDescription = "", Modifier.size(320.dp))
                }

                Column(
                    Modifier
                        .weight(1f)
                        .padding(horizontal = 30.dp)
                        .verticalScroll(rememberScrollState())) {
                    Spacer(modifier = Modifier.height(20.dp))
                    HeadingText(text = "the art bike".uppercase(), size =36)
                    val detail = "There are three major types of motorcycle: street, off-road, and dual purpose. Within these types, there are many sub-types of motorcycles for different purposes."
                    Spacer(modifier = Modifier.height(20.dp))
                    HeadingText(text = detail, size = 16, color = textWhiteTranslucent)
                    Spacer(modifier = Modifier.height(20.dp))

                    Row(horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()) {
                        repeat(3) {
                            BikeDetailCard(header = "", detail = "")
                        }
                    }
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = 30.dp)) {
                        Card(colors = CardDefaults.cardColors(containerColor = textColor),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.fillMaxHeight(),
                        elevation = CardDefaults.cardElevation(30.dp)
                        ) {
                            IconMaker(iconId = R.drawable.shopping_bag, color = primaryGreenBg,
                            size = 25, modifier = Modifier.padding(10.dp))
                        }
                        Spacer(modifier = Modifier.width(30.dp))
                        Card(
                            colors = CardDefaults.cardColors(containerColor = secondaryGreenSurface),
                            shape = RoundedCornerShape(10.dp),
                            elevation = CardDefaults.cardElevation(30.dp),
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .weight(1f)
                        ) {
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 20.dp), horizontalArrangement = Arrangement.Center) {
                                HeadingText(text = "add to card", size = 25)
                            }
                        }
                    }
                }

            }


        }
    }
}


@Composable
fun BikeDetailCard(header: String, detail: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = secondaryGreenSurface),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(30.dp)
    ) {
        Column(Modifier.padding(horizontal = 20.dp, vertical = 15.dp),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            HeadingText(text = "Top Speed", size = 10)
            HeadingText(text = "120 MPH", size = 18)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewDetails() {
    DetailsWindow(rememberNavController())
}