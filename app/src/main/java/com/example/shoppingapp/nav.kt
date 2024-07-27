package com.example.shoppingapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shoppingapp.Screen.third
import com.example.shoppingapp.Screen.bill



var total=0
var tomato =0
var potato=0
var onion=0
var pumpkin=0

var chilly =0

var orange=0
var apple=0
var grapes=0
var berry=0
var papaya=0








@Composable
fun nav(){

    val navcontroller = rememberNavController()
    NavHost(navController = (navcontroller), startDestination = Screen.MainScreen.route ){
        composable(route=Screen.MainScreen.route){
        MainScreen(navController = navcontroller)


        }

        composable(route = Screen.second.route){

            Second(navcontroller)
        }

        composable(route= Screen.third.route){
            third(navcontroller)


        }
        composable(route= Screen.bill.route){
            bill(navcontroller)


        }

    }
}
@Composable
fun MainScreen(navController: NavHostController){
    Column( modifier = Modifier.fillMaxSize(),  horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier=Modifier.height(120.dp))
        Button(onClick = {
                         navController.navigate(Screen.second.route)



        } , colors = ButtonDefaults.buttonColors(Color.Yellow)) {
            Text(text = "Start Shopping ", fontSize = 40.sp , color = Color.Green)

        }
        Spacer(modifier=Modifier.height(120.dp))

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier=Modifier.fillMaxSize()

        )
        Spacer(modifier=Modifier.height(40.dp))


    }
}
@Composable
fun Second(navcontroller: NavHostController) {


    Column ( modifier = Modifier.fillMaxSize()) {

        Row(verticalAlignment = Alignment.CenterVertically) {


            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = null,

                modifier = Modifier.fillMaxSize(.4f)

            )

            TextButton(onClick = { /*TODO*/ }, enabled = true) {
                Text(text = "Select    the     vegetables", fontSize = 30.sp)

            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {


            Column(
                modifier = Modifier.fillMaxWidth(.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Item", fontSize = 28.sp)
                Spacer(modifier = Modifier.height(22.dp))

                Text(text = "Tomatoes", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "Potatoes", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "Onion", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "chilly ", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "pumpkin", fontSize = 20.sp)

            }
            Spacer(modifier = Modifier.fillMaxWidth(.1f))

            Column(
                modifier = Modifier.fillMaxWidth(.3f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "price ", fontSize = 28.sp)
                Spacer(modifier = Modifier.height(22.dp))

                Text(text = "$6", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "$2", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "$4", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "$1", fontSize = 20.sp)
                Spacer(modifier = Modifier.height(22.dp))
                Text(text = "$8", fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.fillMaxWidth(.2f))


            Column(modifier = Modifier.fillMaxWidth(.4f)) {
                Text(text = "Add", fontSize = 28.sp)
                Spacer(modifier = Modifier.height(15.dp))
                var checkedState = remember { mutableStateOf(false) }
                var checkedState1 = remember { mutableStateOf(false) }
                var checkedState2 = remember { mutableStateOf(false) }
                var checkedState3 = remember { mutableStateOf(false) }
                var checkedState4 = remember { mutableStateOf(false) }


                Checkbox(
                    checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it })
                Checkbox(
                    checked = checkedState1.value,
                    onCheckedChange = { checkedState1.value = it })
                Checkbox(
                    checked = checkedState2.value,
                    onCheckedChange = { checkedState2.value = it })
                Checkbox(
                    checked = checkedState3.value,
                    onCheckedChange = { checkedState3.value = it })
                Checkbox(
                    checked = checkedState4.value,
                    onCheckedChange = { checkedState4.value = it })


                if (checkedState3.value == true) {
                    chilly=1


                }
                if (checkedState.value == true) {
                    tomato=6


                }
                if (checkedState1.value == true) {
                    potato= 2
                }
                if (checkedState2.value == true) {
                    onion= 4
                }
                if (checkedState4.value == true) {
                    pumpkin= 8
                }
                if (checkedState3.value == false) {
                    chilly=0


                }
                if (checkedState.value == false ){
                    tomato=0


                }
                if (checkedState1.value == false) {
                    potato= 0
                }
                if (checkedState2.value == false) {
                    onion= 0
                }
                if (checkedState4.value == false) {
                    pumpkin= 0
                }


            }


        }



        Spacer(modifier = Modifier.height(10.dp))
        Row {

            OutlinedButton(onClick = {
                navcontroller.navigate(Screen.MainScreen.route)

            }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
                Text(text = "cancel ", fontSize = 20.sp, color = Color.Green)

            }
            Spacer(modifier = Modifier.fillMaxWidth(.4f))


            Button(onClick = {
                navcontroller.navigate(Screen.third.route)
            }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
                Text(text = "Next ", fontSize = 20.sp, color = Color.Green)

            }
        }


    }

}

@Composable
fun third(navcontroller: NavHostController)
{


    Column ( modifier = Modifier.fillMaxSize()){

        Row (verticalAlignment = Alignment.CenterVertically){


            Image(
                painter = painterResource(id = R.drawable.img_2),
                contentDescription = null,

                modifier = Modifier.fillMaxSize(.4f)

            )

            TextButton(onClick = { /*TODO*/ }, enabled = true) {
                Text(text = "Select the Fruits", fontSize = 30.sp)

            }
        }
        Row (modifier = Modifier.fillMaxWidth()){



            Column(modifier = Modifier.fillMaxWidth(.25f),horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Item", fontSize = 28.sp)
                Spacer(modifier=Modifier.height(22.dp))

                Text(text = "Apples", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "Grapes", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "Oranges", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "papaya ", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "berry", fontSize = 20.sp)

            }
            Spacer(modifier = Modifier.fillMaxWidth(.1f))

            Column(modifier = Modifier.fillMaxWidth(.3f),horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "price ", fontSize = 28.sp)
                Spacer(modifier=Modifier.height(22.dp))

                Text(text = "$10", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "$12", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "$13", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "$4", fontSize = 20.sp)
                Spacer(modifier=Modifier.height(22.dp))
                Text(text = "$17", fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.fillMaxWidth(.2f))


            Column(modifier = Modifier.fillMaxWidth(.4f)) {
                Text(text = "Add", fontSize = 28.sp)
                Spacer(modifier=Modifier.height(15.dp))
                val checkedState = remember { mutableStateOf(false) }
                val checkedState1 = remember { mutableStateOf(false) }
                val checkedState2 = remember { mutableStateOf(false) }
                val checkedState3 = remember { mutableStateOf(false) }
                val checkedState4 = remember { mutableStateOf(false) }


                Checkbox(checked = checkedState.value, onCheckedChange ={checkedState.value=it} )
                Checkbox(checked = checkedState1.value, onCheckedChange ={checkedState1.value=it} )
                Checkbox(checked = checkedState2.value, onCheckedChange ={checkedState2.value=it} )
                Checkbox(checked = checkedState3.value, onCheckedChange ={checkedState3.value=it} )
                Checkbox(checked = checkedState4.value, onCheckedChange ={checkedState4.value=it} )
                if (checkedState3.value == true) {
                    papaya=4


                }
                if (checkedState.value == true) {
                    apple=10


                }
                if (checkedState1.value == true) {
                    grapes=12
                }
                if (checkedState2.value == true) {
                    orange= 13
                }
                if (checkedState4.value == true) {
                    berry= 17
                }
                if (checkedState3.value == false) {
                    papaya=0


                }
                if (checkedState.value == false ){
                    apple=0


                }
                if (checkedState1.value == false) {
                    grapes= 0
                }
                if (checkedState2.value == false) {
                    orange= 0
                }
                if (checkedState4.value == false) {
                    berry= 0
                }


            }


        }
        Spacer(modifier = Modifier.height(30.dp))
        Row {

            OutlinedButton(onClick = {
                navcontroller.navigate(Screen.MainScreen.route)

            }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
                Text(text = "Cancel", fontSize = 20.sp, color = Color.Green)

            }
            Spacer(modifier = Modifier.fillMaxWidth(.4f))


            Button(onClick = {
                navcontroller.navigate(Screen.bill.route)
            }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
                Text(text = "Next ", fontSize = 20.sp, color = Color.Green)

            }
        }






    }




}
@Composable
fun bill(navcontroller: NavHostController){


    Column( modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){


Spacer(modifier = Modifier.height(20.dp))

        total = chilly+ tomato+ onion+ potato+ pumpkin+ apple+ grapes+ orange+ papaya+ berry



        Text(text = "Summary", fontSize = 40.sp)
        if(chilly!=0){
            Text(text = "Chilly         $1", fontSize = 20.sp)
        }
        if(tomato!=0){
            Text(text = "Tomato       $6", fontSize = 20.sp)
        }
        if(onion!=0){
        Text(text = "Onion         $4", fontSize = 20.sp)
    }
        if(potato!=0){
        Text(text = "Potato        $2", fontSize = 20.sp)
    }
        if(pumpkin!=0){
            Text(text = "Pumpkin        $8", fontSize = 20.sp)
        }
        if(apple!=0){
            Text(text = "Apple          $10", fontSize = 20.sp)
        }
        if(grapes!=0){
            Text(text = "Grapes         $12", fontSize = 20.sp)
        }
        if(berry!=0){
            Text(text = "Berry          $17", fontSize = 20.sp)
        }
        if(orange!=0){
        Text(text = "Orange         $13", fontSize = 20.sp)
    }
        if(papaya!=0){
            Text(text = "Papaya         $4", fontSize = 20.sp)
        }
            Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Your bill is : $$total" , fontSize = 30.sp)
        Text(text = "Thank you for Shopping in Alcheringa", fontSize = 20.sp)




    }






}