package com.example.freitassantiagojuanexamen3tAdultos.ui.screens.Ejercicio31Screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.freitassantiagojuanexamen3tAdultos.R


@Composable
fun Ejercicio31Screen() {

    val myButtonBackgroundColor = remember {
        mutableStateOf(Color.Black)
    }
    val myButtonText = remember {
        mutableStateOf("No pulses aquí")
    }
    val myButtonTextColor = remember {
        mutableStateOf(Color.White)
    }
    val myText = remember {
        mutableStateOf("Bienvenido")
    }
    val myTextColor = remember {
        mutableStateOf(Color.Black)
    }
    val buttonStatus = remember {
        mutableStateOf(true)
    }
    val valueOnTextField = remember {
        mutableStateOf("")
    }
    val userInput = remember {
        mutableStateOf("Resultado:")
    }
    val myImage = remember {
        mutableStateOf(R.drawable.gato)
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = myImage.value),
            contentDescription = "",
            modifier = Modifier.size(300.dp),
            contentScale = ContentScale.Fit,
            alignment = Alignment.Center)

        Spacer(modifier = Modifier.size(30.dp))

        if (buttonStatus.value) {
            Text(
                text = myText.value,
                color = myTextColor.value,
                fontSize = 24.sp,
                modifier = Modifier
                    .background(Color.Red)
                    .padding(10.dp)
            )
        }


        Spacer(modifier = Modifier.size(30.dp))

        Button(
            onClick = {

                if (buttonStatus.value) {

                    myText.value = "Hola amigo"
                    myTextColor.value = Color.White

                    myButtonBackgroundColor.value = Color.Black
                    myButtonText.value = "Eres un gato"
                    myButtonTextColor.value = Color.Red

                    myImage.value = R.drawable.perro

                    buttonStatus.value = false

                } else {
                    myText.value = "Hola amigo"
                    myTextColor.value = Color.Black

                    myButtonBackgroundColor.value = Color.Red
                    myButtonText.value = "Eres un gato"
                    myButtonTextColor.value = Color.White

                    myImage.value = R.drawable.gato

                    buttonStatus.value = true
                }

                userInput.value = valueOnTextField.value
                valueOnTextField.value = ""


            },
            modifier = Modifier.size(250.dp, 60.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = myButtonBackgroundColor.value),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(3.dp, Color.Black)
        ) {

            Text(
                text = myButtonText.value,
                color = myButtonTextColor.value,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )

        }

        Spacer(modifier = Modifier.size(30.dp))

        TextField(
            value = valueOnTextField.value,
            onValueChange = {
                valueOnTextField.value = it
            },
            label = { Text(text = "Enter your name")},
            modifier = Modifier.width(300.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.White,
                backgroundColor = Color.Blue,
                focusedLabelColor = Color.Yellow,
                unfocusedLabelColor = Color.White,
                unfocusedIndicatorColor = Color.Red,
                focusedIndicatorColor = Color.Green
            ),
            textStyle = TextStyle.Default.copy(fontSize = 20.sp),
            maxLines = 4,
            //keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            //visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.size(30.dp))

        Text(
            text = userInput.value,
            color = myTextColor.value,
            fontSize = 24.sp,
            modifier = Modifier
                .background(Color.Red)
                .padding(10.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
        Ejercicio31Screen()
    }