package com.example.rechargeearn2.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController
import com.example.rechargeearn2.data.model.BottomNavItem

@Composable
fun BottomNav(
    items: List<BottomNavItem>,
    onItemClick: (BottomNavItem) -> Unit
) {
    val navController = rememberNavController()
    val currentRoute = navController.currentBackStackEntry?.arguments?.getString("route")

    Column {
        BottomNavigation(
            backgroundColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface
        ) {
            items.forEach { item ->
                val selected = currentRoute == item.route
                BottomNavigationItem(
                    icon = { Icon(painterResource(if (selected) item.selectedIcon else item.unselectedIcon), contentDescription = null) },
                    label = { Text(item.label) },
                    selected = selected,
                    onClick = { onItemClick(item) }
                )
            }
        }
    }
}