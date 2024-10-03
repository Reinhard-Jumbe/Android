package com.example.testproject

import android.R
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.TestProjectTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


            About()





            }
        }
    }



@Preview
@Composable

fun About () {
    Column(

        //column styling
        modifier = Modifier
            .background(Color.Red)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center


    ) {



        Text("about",

            fontSize = 30.sp,
            color = Color.Blue,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.ExtraLight,
            fontStyle = FontStyle.Italic,


            )

        val images2 = LocalContext.current
        Button(onClick = {
            images2.startActivity(Intent(images2, ImageActivity::class.java))
        }) {

            Text(text = "Images")
        }

        val About2 = LocalContext.current
        Button(onClick = {
            About2.startActivity(Intent(About2, AboutActivity::class.java))

        }) {
            Text(text = "About")
        }

        val Home2 = LocalContext.current
        Button(onClick = {
            Home2.startActivity(Intent(Home2, MainActivity::class.java))
        }) {
            Text(text = "Home")
        }












    }
}


