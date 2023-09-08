package com.example.day10_bikeecommerce.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.day10_bikeecommerce.ui.theme.textColor

@Composable
fun NavRailIcons(iconId: Int, modifier :Modifier = Modifier) {
    Icon(painter = painterResource(id = iconId), contentDescription = "",
        modifier = modifier.size(20.dp).padding(0.dp)
    )
}