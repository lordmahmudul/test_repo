package com.example.rechargeearn2.navigation

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Wallet : Routes("wallet")
    object History : Routes("history")
    object Margins : Routes("margins")
    object Settings : Routes("settings")
}