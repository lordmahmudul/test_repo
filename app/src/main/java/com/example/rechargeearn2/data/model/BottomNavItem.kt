package com.example.rechargeearn2.data.model

data class BottomNavItem(
    val label: String,
    val route: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val badgeCount: Int = 0,
    val hasNews: Boolean = false
)