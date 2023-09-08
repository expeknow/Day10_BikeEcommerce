package com.example.day10_bikeecommerce.ui.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.day10_bikeecommerce.ui.theme.babes_neue
import com.example.day10_bikeecommerce.ui.theme.textColor

@Composable
fun HeadingText(text: String, modifier: Modifier = Modifier, size: Int, color: Color = textColor) {
    Text(text = text.uppercase(),
    fontSize = size.sp,
    fontFamily = babes_neue,
    modifier = modifier,
    color = color)
}