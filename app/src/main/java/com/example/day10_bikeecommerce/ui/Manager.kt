package com.example.day10_bikeecommerce.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

class Manager {

    var currentSelectedCat = mutableStateOf("Best sale")

    fun changeSelectedCat(cat: String){
        currentSelectedCat.value = cat
    }




}