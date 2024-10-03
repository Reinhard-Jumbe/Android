package com.example.testproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable



import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

class shopActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Smith()






            }
        }
    }



@Preview
@Composable
fun Smith(){
    Column() {
        Text("Creative tools for endless imagination")











    }












    Row {







        Button(onClick = {

        }

        ) {
            Text(text = "All")
        }



        Button(onClick = {

        }

        ) {
            Text(text = "All")
        }



        Button(onClick = {

        }

        ) {
            Text(text = "All")
        }


        Button(onClick = {

        }

        ) {
            Text(text = "All")
        }












    }

   Row {

       Column {
//           Image(
//               painter = painterResource(id = R.drawable.logo),
//               contentDescription = "logo",
//               modifier = Modifier
//                   .clip(RoundedCornerShape(percent = 10))
//                   .padding(10.dp)//used as margin
//                   .border(3.dp, Color.Red)
//                   .padding(0.dp)
//           )


       }


   }
   }


























