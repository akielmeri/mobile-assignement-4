package com.example.week4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week4.ui.theme.Week4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }


            }
        }
    }
}

@Composable
fun MyApp() {
    val appModifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)

    val titleModifier = Modifier
        .fillMaxWidth()
        .padding(top = 32.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Week 4 Exercise",
            style = MaterialTheme.typography.headlineSmall,
            modifier = titleModifier
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            modifier = appModifier,
        )

        Button(
            onClick = {},
            modifier = appModifier
        ) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    Week4Theme {
        MyApp()
    }
}