package com.example.firststep.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firststep.R
import com.example.firststep.ui.theme.FirstStepTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun register(){
    Column(
        modifier = Modifier
            .padding(40.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.onboarding_one),
            contentDescription = "logo"
        )
        Text(
            text = "Register",
            modifier = Modifier
                .padding(
                    top = 50.dp,
                    bottom = 50.dp
                ),
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold
            )
        )

        var firstName by remember { mutableStateOf(TextFieldValue("")) }
        var lastName by remember { mutableStateOf(TextFieldValue("")) }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmPassword by remember { mutableStateOf("") }

        BasicTextField(
            value = firstName,
            onValueChange = { firstName = it },
            modifier = Modifier
                .padding(bottom = 10.dp)
                .border(
                    2.dp,
                    MaterialTheme.colorScheme.primary,
                    RoundedCornerShape(size = 10.dp)
                ),
            decorationBox = { innerTextField ->
                Row(
                    Modifier
                        .background(Color.Transparent)
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    if (firstName.text.isEmpty()) {
                        Text("Nama Depan")
                    }
                    innerTextField()
                }
            },
        )
        BasicTextField(
            value = lastName,
            onValueChange = { lastName = it },
            modifier = Modifier
                .padding(bottom = 10.dp)
                .border(
                    2.dp,
                    MaterialTheme.colorScheme.primary,
                    RoundedCornerShape(size = 10.dp)
                ),
            decorationBox = { innerTextField ->
                Row(
                    Modifier
                        .background(Color.Transparent)
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    if (lastName.text.isEmpty()) {
                        Text("Nama Belakang")
                    }
                    innerTextField()
                }
            },
        )
        BasicTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .padding(bottom = 10.dp)
                .border(
                    2.dp,
                    MaterialTheme.colorScheme.primary,
                    RoundedCornerShape(size = 10.dp)
                ),
            decorationBox = { innerTextField ->
                Row(
                    Modifier
                        .background(Color.Transparent)
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    if (email.isEmpty()) {
                        Text("Email")
                    }
                    innerTextField()
                }
            },
        )
        BasicTextField(
            value = password,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .padding(bottom = 10.dp)
                .border(
                    2.dp,
                    MaterialTheme.colorScheme.primary,
                    RoundedCornerShape(size = 10.dp)
                ),
            decorationBox = { innerTextField ->
                Row(
                    Modifier
                        .background(Color.Transparent)
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    if (password.isEmpty()) {
                        Text("Password")
                    }
                    innerTextField()
                }
            },
        )
        BasicTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .padding(bottom = 10.dp)
                .border(
                    2.dp,
                    MaterialTheme.colorScheme.primary,
                    RoundedCornerShape(size = 10.dp)
                ),
            decorationBox = { innerTextField ->
                Row(
                    Modifier
                        .background(Color.Transparent)
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    if (confirmPassword.isEmpty()) {
                        Text("Konfirmasi Password")
                    }
                    innerTextField()
                }
            },
        )
        Button(
            onClick = { /*TODO*/ },
            elevation =  ButtonDefaults.buttonElevation(
                defaultElevation = 5.dp,
                pressedElevation = 0.dp,
                disabledElevation = 0.dp
            )
        ) {
            Text("Daftar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun registerPreview(){
    FirstStepTheme {
        register()
    }
}