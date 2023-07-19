package com.example.loginandsignup.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.loginandsignup.components.HeadingTextComponent
import com.example.loginandsignup.navigation.PostOfficeAppRouter
import com.example.loginandsignup.navigation.Screen
import com.example.loginandsignup.navigation.SystemBackButtonHandler
import org.w3c.dom.Text

@Composable
fun TermsAndConditionsScreen(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)
    ) {
        HeadingTextComponent(value = "Terms and condition screen")
    }
    SystemBackButtonHandler{
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}