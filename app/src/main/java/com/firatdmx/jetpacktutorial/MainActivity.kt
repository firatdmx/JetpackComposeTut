package com.firatdmx.jetpacktutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firatdmx.jetpacktutorial.ui.theme.JetpackTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JTut(modifier = Modifier)
                }
            }
        }
    }
}


@Composable
fun JTut(modifier: Modifier) {
    val imagePainter = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(painter = imagePainter, contentDescription = null )
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 23.sp,
            modifier = Modifier
                .padding(12.dp)
        )
        Text(
            text = stringResource(id = R.string.paragraph1),
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(12.dp)
        )
        Text(
            text = stringResource(id = R.string.paragraph2),
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(12.dp)
        )
    }
}


@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    JetpackTutorialTheme {
        JTut(modifier = Modifier)
    }
}