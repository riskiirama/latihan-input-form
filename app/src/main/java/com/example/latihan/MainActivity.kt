package com.example.latihan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.latihan.ui.theme.LatihanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LatihanTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Header()
                            Spacer(modifier = Modifier.height(16.dp))
                            FormInput()
                            Spacer(modifier = Modifier.weight(1f))
                            Footer()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Header() {
    Text(
        text = "IRAMA",
        style = MaterialTheme.typography.headlineLarge,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun FormInput() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Welcome",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Username") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            textStyle = MaterialTheme.typography.bodySmall,
            shape = MaterialTheme.shapes.small
        )

        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            textStyle = MaterialTheme.typography.bodySmall,
            shape = MaterialTheme.shapes.small
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {  },
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Submit",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun Footer() {
    Text(
        text = "@riskii_rama",
        style = MaterialTheme.typography.headlineSmall,

    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LatihanTheme {
        MainActivityContent()
    }
}

@Composable
fun MainActivityContent() {
    Scaffold {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Header()
                Spacer(modifier = Modifier.height(16.dp))
                FormInput()
                Spacer(modifier = Modifier.weight(1f))
                Footer()
            }
        }
    }
}
