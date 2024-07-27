package com.example.shoppingapp

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingapp.ui.theme.ShoppingAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class secondact : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoppingAppTheme {
                Surface ( modifier= Modifier.fillMaxSize() ,color = Color.LightGray){

                }
                var tomato =0
                var onion=0
                var potat0=0

                Column ( modifier = Modifier.fillMaxSize()){
                    
                    Row (verticalAlignment = Alignment.CenterVertically){


                        Image(
                            painter = painterResource(id = R.drawable.img_1),
                            contentDescription = null,

                            modifier = Modifier.fillMaxSize(.4f)

                        )
                        
                       TextButton(onClick = { /*TODO*/ }, enabled = true) {
                           Text(text = "Select the vegetables", fontSize = 35.sp)
                           
                       }
                    }
                    Row (modifier = Modifier.fillMaxWidth()){



                        Column(modifier = Modifier.fillMaxWidth(.25f),horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "Item", fontSize = 28.sp)
                        }
                        Spacer(modifier = Modifier.fillMaxWidth(.1f))

                        Column(modifier = Modifier.fillMaxWidth(.35f),horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(text = "price ", fontSize = 28.sp)
                        }
                        Spacer(modifier = Modifier.fillMaxWidth(.2f))


                        Column(modifier = Modifier.fillMaxWidth(.40f), horizontalAlignment = Alignment.CenterHorizontally ) {
                            Text(text = "Qty", fontSize = 28.sp)
                        }


                    }

                        




                }



















            }

        }
    }
}
