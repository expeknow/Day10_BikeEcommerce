package com.example.day10_bikeecommerce.ui.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.day10_bikeecommerce.ui.theme.textColor

@Composable
fun NavRailText(text: String, modifier : Modifier = Modifier, size: Int = 15) {
    Text(text = text, modifier.rotate(-180f), fontSize = size.sp,
    fontWeight = FontWeight.Normal,)
}