package com.example.day10_bikeecommerce.ui.widgets

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.day10_bikeecommerce.ui.theme.textColor
import com.example.day10_bikeecommerce.ui.theme.whiteTranslucent


@Composable
fun IconMaker(iconId: Int, color: Color = textColor, modifier: Modifier = Modifier, size: Int = 30 ) {
    IconButton(onClick = { /*TODO*/ }, modifier = modifier) {
        Icon(painterResource(id = iconId), contentDescription = "",
        Modifier.size(size.dp), tint = color)
    }
}