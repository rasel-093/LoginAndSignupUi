package com.example.loginandsignup.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.loginandsignup.R
import com.example.loginandsignup.components.ButtonComponent
import com.example.loginandsignup.components.ClickableLoginTextComponent
import com.example.loginandsignup.components.DividerTextComponent
import com.example.loginandsignup.components.HeadingTextComponent
import com.example.loginandsignup.components.MyTextField
import com.example.loginandsignup.components.NormalTextComponent
import com.example.loginandsignup.components.PasswordField
import com.example.loginandsignup.components.UnderlinedTextComponent
import com.example.loginandsignup.navigation.PostOfficeAppRouter
import com.example.loginandsignup.navigation.Screen
import com.example.loginandsignup.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ){
        Column(modifier = Modifier
            .fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(labelValue = stringResource(id = R.string.email), 
                painterResource = painterResource(id = R.drawable.email) )
            PasswordField(labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password) )
            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(value = stringResource(id = R.string.login))
            Spacer(modifier = Modifier.height(10.dp))
            UnderlinedTextComponent(value = stringResource(id = R.string.forgot_password))
            Spacer(modifier = Modifier.height(40.dp))

            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()
            ClickableLoginTextComponent(tryingToLogin = false,onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
            })
        }
    }
    SystemBackButtonHandler{
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}
@Preview
@Composable
fun LoginScreenView(){
    LoginScreen()
}