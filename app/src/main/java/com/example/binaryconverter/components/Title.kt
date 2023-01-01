package com.example.binaryconverter.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Title(heading: String, subtitle: String) {
    Text(
        text = heading,
        style = MaterialTheme.typography.titleMedium
    )
    Text(
        text = subtitle,
        style = MaterialTheme.typography.titleSmall
    )
}

@Composable
@Preview
fun TitlePreview() {
    Title("Binary Converter", "Preview Binary Converter")
}