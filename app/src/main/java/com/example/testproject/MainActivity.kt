package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.testproject.ui.theme.TestProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            John()

        }
    }
}

@Preview
@Composable

fun John (){

    Column (
        modifier = Modifier
        .background(Color.Red)
        .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center
    )
    {

        Text("welcome to android")
        Text("Reinhard Smith")


        val images = LocalContext.current
        Button(onClick = {
            images.startActivity(Intent(images, ImageActivity::class.java))
        }) {

            Text(text = "Images")
        }

        val About = LocalContext.current
        Button(onClick = {
            About.startActivity(Intent(About, AboutActivity::class.java))

        }) {
            Text(text = "About")
        }

        val Home = LocalContext.current
        Button(onClick = {
            Home.startActivity(Intent(Home, MainActivity::class.java))
        }) {
            Text(text = "Home")
        }






























        }





















    }














