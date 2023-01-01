package com.example.binaryconverter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.binaryconverter.components.Title
import com.example.binaryconverter.extensions.toBinary
import com.example.binaryconverter.ui.theme.BinaryConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BinaryConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainUi()
                }
            }
        }
    }
}

@Composable
fun MainUi() {
    var result by remember {
        mutableStateOf("")
    }

    var input by remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Title(heading = "Binary Converter", subtitle = "Enter a Decimal Number and see the Binary result" )

        BasicTextField(
            value = input,
            onValueChange = { newText ->
                input = newText
            },
            modifier = Modifier.border(BorderStroke(1.dp, Color.Black))
        )
        Button(onClick = { result = input.toBinary() }) {
            Text(text = "Convert")
        }

        if (result.contains("Error")) {
            Text(text = result, style = TextStyle(MaterialTheme.colorScheme.error))
        }
        else {
            Text(text = "Result: $result")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BinaryConverterTheme {
        MainUi()
    }
}