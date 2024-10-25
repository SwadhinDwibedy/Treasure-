package com.example.treasure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.treasure.ui.theme.TreasureTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TreasureTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    CaptainGAme()
                }
            }
        }
    }
    @Preview
    @Composable
    fun CaptainGAme(){
//        val tresureFound = remember { mutableStateOf(0) }
        var tresureFound by remember{ androidx.compose.runtime.mutableIntStateOf(0)}
        val direction = remember { mutableStateOf("North") }
        val StormOrTreasure = remember { mutableStateOf("") }

        Column {
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "Treasures Found: ${tresureFound}")
            Text(text = "Current Direction: ${direction.value}")
            Text(text = "${StormOrTreasure.value}")

            Button(onClick = {
                direction.value = "East"
                if (Random.nextBoolean()) {
                    tresureFound += 1
                    StormOrTreasure.value = "We found the tresure"
                }else{
                    StormOrTreasure.value = "Storm Ahead !!!!"
                }
            }) {
                Text("Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if (Random.nextBoolean()) {
                    tresureFound += 1
                    StormOrTreasure.value = "We found the tresure"
                }else{
                    StormOrTreasure.value = "Storm Ahead !!!!"
                }
            }) {
                Text("Sail West")
            }
            Button(onClick = {
                direction.value = "North"
                if (Random.nextBoolean()) {
                    tresureFound += 1
                    StormOrTreasure.value = "We found the tresure"
                }else{
                    StormOrTreasure.value = "Storm Ahead !!!!"
                }
            }) {
                Text("Sail North")
            }
            Button(onClick = {
                direction.value = "South"
                if (Random.nextBoolean()) {
                    tresureFound += 1
                    StormOrTreasure.value = "We found the tresure"
                }else{
                    StormOrTreasure.value = "Storm Ahead !!!!"
                }
            }) {
                Text("Sail South")
            }
        }
    }






}
