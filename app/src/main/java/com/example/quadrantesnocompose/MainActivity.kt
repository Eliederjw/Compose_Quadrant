package com.example.quadrantesnocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.quadrantesnocompose.ui.theme.QuadrantesNoComposeTheme

val color1 = Color(0xFFEADDFF)
val color2 = Color(0xFFD0BCFF)
val color3 = Color(0xFFB69DF8)
val color4 = Color(0xFFF6EDFF)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantesNoComposeTheme {
                Surface (modifier = Modifier.fillMaxSize()) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen(){
    Row {
        Box(
            Modifier
                .weight(1f)
                .fillMaxSize()
        ){
            Column(
                Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    Modifier
                        .weight(1f)
                        .background(colorResource(R.color.color1))
                        .fillMaxSize(),
                    Alignment.Center
                ) {
                    Quadrant(
                        title = stringResource(R.string.title1),
                        msg = stringResource(R.string.message1),
                    )
                }
                Box(
                    Modifier
                        .weight(1f)
                        .background(colorResource(R.color.color2))
                        .fillMaxSize(),
                    Alignment.Center
                ) {
                    Quadrant(
                        title = stringResource(R.string.title2),
                        msg = stringResource(R.string.message2),
                    )
                }
            }
        }
        Box (
            Modifier
                .weight(1f)
                .fillMaxSize()
        ){
            Column(
                Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    Modifier
                        .weight(1f)
                        .background(colorResource(R.color.color3))
                        .fillMaxSize(),
                    Alignment.Center
                ) {
                    Quadrant(
                        title = stringResource(R.string.title3),
                        msg = stringResource(R.string.message3),
                    )
                }
                Box(
                    Modifier
                        .weight(1f)
                        .background(colorResource(R.color.color4))
                        .fillMaxSize(),
                    Alignment.Center
                ) {
                    Quadrant(
                        title = stringResource(R.string.title4),
                        msg = stringResource(R.string.message4),
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrant(title: String = "Title",
             msg: String = "Message",
             modifier: Modifier = Modifier) {

        Column (
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                modifier = modifier
                    .padding(bottom = 16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = msg,
                modifier = modifier,
                fontSize = TextUnit.Unspecified,
                textAlign = TextAlign.Justify

            )
        }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantesNoComposeTheme {
        Screen()
    }
}