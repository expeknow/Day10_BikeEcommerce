package com.example.day10_bikeecommerce.ui.widgets

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.day10_bikeecommerce.R
import com.example.day10_bikeecommerce.ui.theme.secondaryGreenSurface
import com.example.day10_bikeecommerce.ui.theme.textColor

@Composable
fun SparePartIcon(iconId: Int, size: Int) {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(containerColor = secondaryGreenSurface),
        modifier = Modifier.size(60.dp),
        contentPadding = PaddingValues(5.dp)
    ) {
        Icon(painter = painterResource(id = iconId), contentDescription = "",
        tint = textColor, modifier = Modifier.size(size.dp))
    }
}