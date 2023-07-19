package com.example.loginandsignup.screens

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
import com.example.loginandsignup.app.PostOfficeApp
import com.example.loginandsignup.components.ButtonComponent
import com.example.loginandsignup.components.CheckBoxComponent
import com.example.loginandsignup.components.ClickableLoginTextComponent
import com.example.loginandsignup.components.DividerTextComponent
import com.example.loginandsignup.components.HeadingTextComponent
import com.example.loginandsignup.components.MyTextField
import com.example.loginandsignup.components.NormalTextComponent
import com.example.loginandsignup.components.PasswordField
import com.example.loginandsignup.navigation.PostOfficeAppRouter
import com.example.loginandsignup.navigation.Screen

@Composable
fun SignUpScreen(){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(labelValue = stringResource(id = R.string.first_name),
            painterResource = painterResource(id = R.drawable.profile))
            MyTextField(labelValue = stringResource(id = R.string.last_name),
            painterResource =painterResource(id = R.drawable.profile))
            MyTextField(labelValue = stringResource(id = R.string.email),
            painterResource = painterResource(id = R.drawable.email))
            PasswordField(labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password))
            CheckBoxComponent(value = stringResource(id = R.string.terms),
                onTextSelected = {
                     PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                } )
            Spacer(modifier = Modifier.height(40.dp))
            ButtonComponent(value = stringResource(id = R.string.register))
            DividerTextComponent()
            ClickableLoginTextComponent(true,onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
        }
    }

}
@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}