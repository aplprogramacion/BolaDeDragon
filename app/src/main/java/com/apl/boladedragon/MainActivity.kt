package com.apl.boladedragon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.apl.boladedragon.ui.theme.BolaDeDragonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BolaDeDragonTheme {
                GokuApp()
            }
        }
    }
}


@Composable
fun GokuTextAndImage(
    modifier: Modifier = Modifier, // Modifier es una clase que te permite modificar la apariencia de un componible
    onImageClick: () -> Unit, // () -> Unit es una función que no recibe parámetros y no devuelve nada
    contentDescriptionResourceId: Int, // contentDescriptionResourceId es un entero que representa el id de un recurso de texto
    textLabelResourceId: Int, // textLabelResourceId es un entero que representa el id de un recurso de texto
    drawableResourceId: Int, // drawableResourceId es un entero que representa el id de un recurso de imagen
    textHistoryId: Int
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, // horizontalAlignment es un parámetro de Column que te permite alinear el contenido de forma horizontal
        verticalArrangement = Arrangement.Center, // verticalArrangement es un parámetro de Column que te permite alinear el contenido de forma vertical
        modifier = modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(
            text = stringResource(textLabelResourceId), // text es un parámetro de Text que te permite establecer el texto que se mostrará en pantalla
            fontSize = 18.sp, // fontSize es un parámetro de Text que te permite establecer el tamaño de la fuente
            fontWeight = FontWeight.Bold, // fontWeight es un parámetro de Text que te permite establecer el grosor de la fuente
            color = Color.Yellow
        )
        Spacer(modifier = Modifier.height(6.dp)) // Spacer es un composable que te permite agregar un espacio entre otros componibles

        Image(
            painter = painterResource(drawableResourceId), // painter es un parámetro de Image que te permite establecer el recurso de imagen que se mostrará en pantalla
            contentDescription = stringResource(contentDescriptionResourceId), // contentDescription es un parámetro de Image que te permite establecer el texto que se mostrará en pantalla cuando el usuario no pueda ver la imagen
            contentScale = ContentScale.Crop, // contentScale es un parámetro de Image que te permite establecer la forma en la que se mostrará la imagen
            modifier = Modifier
                .size(400.dp)
                .clip(RoundedCornerShape(16.dp)) // clip es un parámetro de Modifier que te permite establecer la forma de un composable
                .clickable(
                    onClick = onImageClick
                ) // clickable es un parámetro de Modifier que te permite hacer que el composable sea clickeable
                .border(
                    BorderStroke(
                        8.dp,
                        Color.Red
                    ), // border es un parámetro de Modifier que te permite agregar un borde al composable
                    RoundedCornerShape(4.dp) // RoundedCornerShape es una clase que te permite establecer la forma de un composable
                )
                .padding(6.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(textHistoryId),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

    }

}

@Preview(showBackground = true)
@Composable
fun GokuApp() {
    var currentGoku by remember { mutableStateOf(1) } // currentGoku es una variable que se puede modificar y que se inicializa en 1
    var changeImage by remember { mutableStateOf(0) } // changeImage es una variable que se puede modificar y que se inicializa en false

    Surface(
        Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) { // Surface es un composable que te permite establecer el fondo de la pantalla
        when (currentGoku) { // when es una estructura de control que te permite ejecutar un bloque de código dependiendo del valor de una variable
            1 -> {
                GokuTextAndImage( // GokuTextAndImage es un composable que te permite mostrar un texto y una imagen
                    textLabelResourceId = R.string.goku, // R.string.goku es un recurso de texto que se encuentra en el archivo strings.xml
                    textHistoryId = R.string.gokuhistory,
                    drawableResourceId = R.drawable.goku, // R.drawable.goku es un recurso de imagen que se encuentra en el archivo drawable.xml
                    contentDescriptionResourceId = R.string.goku, // R.string.goku es un recurso de texto que se encuentra en el archivo strings.xml
                    onImageClick = { // onImageClick es un parámetro de GokuTextAndImage que te permite establecer la acción que se ejecutará cuando se haga clic en la imagen
                        currentGoku = 2
                        changeImage = (2..9).random()
                    }
                )
            }
            2 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokukaioken,
                    textHistoryId = R.string.gokukaiokenhistory,
                    drawableResourceId = R.drawable.gokukaioken,
                    contentDescriptionResourceId = R.string.gokukaioken,
                    onImageClick = {
                        currentGoku = 3
                    }
                )
            }
            3 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokufase1,
                    textHistoryId = R.string.gokufase1history,
                    drawableResourceId = R.drawable.gokufase1,
                    contentDescriptionResourceId = R.string.gokufase1,
                    onImageClick = {
                        currentGoku = 4
                    }
                )
            }
            4 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokufase2,
                    textHistoryId = R.string.gokufase2history,
                    drawableResourceId = R.drawable.gokufase2,
                    contentDescriptionResourceId = R.string.gokufase2,
                    onImageClick = {
                        currentGoku = 5
                    }
                )
            }
            5 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokufase3,
                    textHistoryId = R.string.gokufase3history,
                    drawableResourceId = R.drawable.gokufase3,
                    contentDescriptionResourceId = R.string.gokufase3,
                    onImageClick = {
                        currentGoku = 6
                    }
                )
            }
            6 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokufase4,
                    textHistoryId = R.string.gokufase4history,
                    drawableResourceId = R.drawable.gokufase4,
                    contentDescriptionResourceId = R.string.gokufase4,
                    onImageClick = {
                        currentGoku = 7
                    }
                )
            }
            7 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokufasedios,
                    textHistoryId = R.string.gokufasedioshistory,
                    drawableResourceId = R.drawable.gokudios,
                    contentDescriptionResourceId = R.string.gokufasedios,
                    onImageClick = {
                        currentGoku = 8
                    }
                )
            }
            8 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokublue,
                    textHistoryId = R.string.gokubluehistory,
                    drawableResourceId = R.drawable.gokublue,
                    contentDescriptionResourceId = R.string.gokublue,
                    onImageClick = {
                        currentGoku = 9
                    }
                )
            }
            9 -> {
                GokuTextAndImage(
                    textLabelResourceId = R.string.gokuultrainstinto,
                    textHistoryId = R.string.gokuultrainstintohistory,
                    drawableResourceId = R.drawable.gokuultrainstinto,
                    contentDescriptionResourceId = R.string.gokuultrainstinto,
                    onImageClick = {
                        currentGoku = 1
                    }
                )
            }
        }

    }
}