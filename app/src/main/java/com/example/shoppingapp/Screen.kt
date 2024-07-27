package com.example.shoppingapp

import androidx.navigation.NavArgs

open class Screen (val route: String) {

    object  MainScreen :Screen(route = "main_screen")
    object  second :Screen(route = "second_screen")


    object  third :Screen(route = "third_screen")

    object  bill :Screen(route = "bill_screen")

    fun withargs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach {
                append("/$args")
            }
        }
    }
}
