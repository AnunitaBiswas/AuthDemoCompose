package com.example.authdemocompose.screens

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
import com.example.authdemocompose.R
import com.example.authdemocompose.components.CheckboxComponent
import com.example.authdemocompose.components.HeadingTextComponents
import com.example.authdemocompose.components.MyTextFieldComponent
import com.example.authdemocompose.components.NormalTextComponents
import com.example.authdemocompose.components.PasswordFieldComponent
import com.example.authdemocompose.navigation.PostOfficeAppRouter
import com.example.authdemocompose.navigation.Screen

@Composable
fun SignupScreens() {
    Surface(
        modifier = Modifier
            .padding(25.dp)
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponents(value = stringResource(id = R.string.hello))
            HeadingTextComponents(value = stringResource(id = R.string.welcome))

            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile), onTextChanged = {})

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.lastname),
                painterResource(id = R.drawable.profile), onTextChanged = {})

            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.message), onTextChanged = {})

            PasswordFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.ic_lock), onTextChanged = {})

            CheckboxComponent(value = stringResource(id = R.string.checkbox_text),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                },
                onCheckedChange = {
                   // signupViewModel.onEvent(SignupUIEvent.PrivacyPolicyCheckBoxClicked(it))
                }
            )

            Spacer(modifier = Modifier.height(40.dp))

        }


    }
}

@Preview
@Composable
fun DefaultPreviewOfSignupScreens() {
    SignupScreens()
}