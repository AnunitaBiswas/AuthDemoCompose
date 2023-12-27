package com.example.authdemocompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.authdemocompose.navigation.PostOfficeAppRouter
import com.example.authdemocompose.navigation.Screen
import com.example.authdemocompose.screens.SignupScreens
import com.example.authdemocompose.screens.TermsAndConditionsScreen

@Composable
fun PostOfficeApp() {
   Surface(modifier = Modifier.fillMaxSize(),
            color = Color.White
   ) {
       //SignupScreens()
       Crossfade(targetState = PostOfficeAppRouter.currentScreen, label = "") { currentState ->
           when (currentState.value) {
               is Screen.SignUpScreen -> {
                   SignupScreens()
               }

               is Screen.TermsAndConditionsScreen -> {
                   TermsAndConditionsScreen()
               }

               is Screen.LoginScreen -> {
                  // Screen.LoginScreen()
               }

               is Screen.HomeScreen -> {
                   //HomeScreen()
               }
           }
       }

   }
}