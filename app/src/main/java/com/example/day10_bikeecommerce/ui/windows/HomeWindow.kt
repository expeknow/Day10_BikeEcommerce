package com.example.day10_bikeecommerce.ui.windows

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.day10_bikeecommerce.R
import com.example.day10_bikeecommerce.ui.Manager
import com.example.day10_bikeecommerce.ui.theme.primaryGreenBg
import com.example.day10_bikeecommerce.ui.theme.secondaryGreenSurface
import com.example.day10_bikeecommerce.ui.theme.textColor
import com.example.day10_bikeecommerce.ui.theme.textColorLight
import com.example.day10_bikeecommerce.ui.widgets.HeadingText
import com.example.day10_bikeecommerce.ui.widgets.IconMaker
import com.example.day10_bikeecommerce.ui.widgets.NavRailIcons
import com.example.day10_bikeecommerce.ui.widgets.NavRailText
import com.example.day10_bikeecommerce.ui.widgets.SparePartIcon

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeWindow(navController: NavHostController) {

    val manager = remember {
        mutableStateOf(Manager())
    }

    Scaffold(
    containerColor = primaryGreenBg) {

        Column {
            Spacer(modifier = Modifier.height(15.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                IconMaker(iconId = R.drawable.heart, size = 25)
                IconMaker(iconId = R.drawable.more_vert, size = 25)
            }

            Row(
                Modifier
                    .weight(1f),verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End) {
                BikeCard(navController)
            }
            ButtomIconRow()
            Spacer(modifier = Modifier.height(20.dp))
        }

        NavigationRail(
            containerColor = secondaryGreenSurface,
            header = {
                Spacer(modifier = Modifier.height(10.dp))
                IconMaker(iconId = R.drawable.menu)
                     },
            modifier = Modifier.clip(RoundedCornerShape(0.dp, 25.dp, 25.dp, 0.dp))
        ) {
            val selectedOption = manager.value.currentSelectedCat.value

            Spacer(modifier = Modifier.height(250.dp))
            NavRailItemCustom(text = "Best sale", selectedOption = selectedOption, manager)
            Spacer(modifier = Modifier.height(40.dp))
            NavRailItemCustom(text = "Popular", selectedOption = selectedOption, manager)
            Spacer(modifier = Modifier.height(40.dp))
            NavRailItemCustom(text = "New Arrival", selectedOption = selectedOption, manager)
            Spacer(modifier = Modifier.height(150.dp))

        }

        Column(Modifier.padding(horizontal = 40.dp, vertical = 100.dp)) {
            HeadingText(text = "Bikes".uppercase(), size = 50)
            HeadingText(text = "Collections".uppercase(), size = 50)
        }

    }
}


@Composable
fun BikeCard(navController: NavHostController) {
    Box(modifier = Modifier.height(IntrinsicSize.Max)) {

        Row() {
            Spacer(modifier = Modifier.width(80.dp))
            Card(shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(30.dp)
                    .clickable { navController.navigate("detail") },
                elevation = CardDefaults.cardElevation(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = secondaryGreenSurface
                )) {
                Row(Modifier.padding(15.dp), verticalAlignment = Alignment.CenterVertically) {
                    IconMaker(iconId = R.drawable.star, color = Color.Yellow, size = 25)
                    HeadingText(text = "4.5", size = 22, modifier = Modifier.weight(1f))
                    IconMaker(iconId = R.drawable.heart, size = 25)
                }
                Spacer(modifier = Modifier.height(200.dp))

                Row(Modifier.padding(20.dp), verticalAlignment = Alignment.CenterVertically) {
                    Column(Modifier.weight(1f)) {
                        HeadingText(text = "Art bike".uppercase(), size = 22)
                        HeadingText(text = "$5,560", size = 22,)
                    }
                    Button(onClick = { /*TODO*/ },
                        border = BorderStroke(1.dp, textColor),
                        shape = RoundedCornerShape(10.dp),
                        contentPadding = PaddingValues(3.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = secondaryGreenSurface
                        )
                    ) {
                        IconMaker(iconId = R.drawable.shopping_bag, size= 20)
                    }
                }
            }
        }
        //Bike row
        Row(horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxHeight()
        ) {
            Spacer(modifier = Modifier.width(85.dp))
            Image(painter = painterResource(id = R.drawable.bike), contentDescription = "bike",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    )
        }
    }
}

@Composable
fun ButtomIconRow() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)) {
        Spacer(modifier = Modifier.width(60.dp))

        SparePartIcon(iconId = R.drawable.tyre, size = 30)
        SparePartIcon(iconId = R.drawable.car_engine, size = 30)
        SparePartIcon(iconId = R.drawable.steering, size = 30)

    }
}


@Composable
fun NavRailItemCustom(text: String, selectedOption: String, manager: MutableState<Manager>) {
    NavigationRailItem(selected = selectedOption == text,
        onClick = {manager.value.changeSelectedCat(text)},
        icon = { NavRailIcons(iconId = R.drawable.line) },
        interactionSource = MutableInteractionSource(),
        label = { NavRailText(text = text) },
        colors = NavigationRailItemDefaults.colors(
            unselectedIconColor = textColorLight,
            selectedIconColor = textColor,
            selectedTextColor = textColor,
            indicatorColor = secondaryGreenSurface,
            unselectedTextColor = textColorLight
        ),
        modifier = Modifier.rotate(-270f)
    )
}


@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeWindow(rememberNavController())
}