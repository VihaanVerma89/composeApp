package com.example.composeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.ComposeAppTheme

class KeyboardTestActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {
                KeyboardTest()
            }
        }
    }
}

@Composable
fun KeyboardTest(
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        TextField(value = "empty", onValueChange = {
            Toast.makeText(context,
                "Value change func",
                Toast.LENGTH_LONG).show()
        })
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {
            Toast.makeText(context,
                "Button Clicked",
                Toast.LENGTH_LONG).show()
        }, modifier = Modifier.padding(top = 8.dp, bottom=8.dp)) {
            Text(text = "Click me")
        }
    }
}

@Preview
@Composable
fun KeyboardPreview(

) {
    ComposeAppTheme {
        KeyboardTest()
    }
}