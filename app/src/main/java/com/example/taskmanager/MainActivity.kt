package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                TaskManagerImage("All tasks completed", "Nice work!" )
                    TaskManagerText("All tasks completed", "Nice work!")

                }

            }
        }
    }
}

@Composable
fun TaskManagerText(text1 : String, text2 : String) {
    Column {
        Text(
            text = text1,
            textAlign = TextAlign.Center,
            //textStyle = TextStyle.bold,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(top = 500.dp, start = 50.dp)
                .requiredWidth(300.dp)
                .requiredHeight(100.dp)

        )

        Text(
            text = text2,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
        modifier = Modifier
                    .padding(start = 150.dp)
        )
    }
}

@Composable
fun TaskManagerImage(text1: String, text2: String){
    val image = painterResource(R.drawable.taskmanager)
            Image(
                painter = image,
            alignment = Alignment.TopCenter,
            contentDescription = null,
            modifier = Modifier
                //.fillMaxSize()
                .width(500.dp)
                .height(200.dp)
                .padding(top = 100.dp, bottom = 100.dp),
            contentScale = ContentScale.Fit
            )
}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManagerTheme {
        //TaskManagerText("All tasks completed", "Nice work!")
        /*TaskManagerImage(
            modifier = Modifier
                .width(80.dp)
                .height(80.dp)
        )
        */
        TaskManagerImage(
            "All tasks completed", "Nice work!"
        )
    }
}