package com.example.art_space

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.art_space.ui.theme.Art_SpaceTheme
import androidx.compose.material3.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Art_SpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.art1)

    Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly ,horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = modifier) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(500.dp, 400.dp)
                    .padding(30.dp)
            )
        }
        Text(
            text = stringResource(R.string.description),
            modifier = modifier,
        )
        Row(modifier = modifier) {
            Button(onClick = { /*TODO*/ }) {
                Text(stringResource(R.string.previous))
            }
            Spacer(modifier = Modifier.width(130.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(stringResource(R.string.next))
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Art_SpaceTheme {
        Greeting()
    }
}