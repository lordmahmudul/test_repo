package com.example.rechargeearn2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rechargeearn2.data.model.BottomNavItem
import com.example.rechargeearn2.navigation.BottomNav
import com.example.rechargeearn2.navigation.Routes
import com.example.rechargeearn2.ui.theme.RechargeEarn2Theme

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RechargeEarnApp(viewModel)
        }
    }
}

@Composable
fun RechargeEarnApp(viewModel: MainViewModel) {
    val items = remember {
        listOf(
            BottomNavItem(
                label = "Home",
                route = Routes.Home.route,
                selectedIcon = R.drawable.ic_filled_home,
                unselectedIcon = R.drawable.ic_outlined_home
            ),
            BottomNavItem(
                label = "Wallet",
                route = Routes.Wallet.route,
                selectedIcon = R.drawable.ic_outlined_wallet,
                unselectedIcon = R.drawable.ic_outlined_wallet
            ),
            BottomNavItem(
                label = "History",
                route = Routes.History.route,
                selectedIcon = R.drawable.ic_outlined_history,
                unselectedIcon = R.drawable.ic_outlined_history
            ),
            BottomNavItem(
                label = "Margins",
                route = Routes.Margins.route,
                selectedIcon = R.drawable.ic_filled_margins,
                unselectedIcon = R.drawable.ic_outlined_margins
            ),
            BottomNavItem(
                label = "Settings",
                route = Routes.Settings.route,
                selectedIcon = R.drawable.ic_filled_settings,
                unselectedIcon = R.drawable.ic_outlined_settings
            )
        )
    }

    val navController = rememberNavController()

    NavHost(navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) { /* Home Screen */ }
        composable(Routes.Wallet.route) { /* Wallet Screen */ }
        composable(Routes.History.route) { /* History Screen */ }
        composable(Routes.Margins.route) { /* Margins Screen */ }
        composable(Routes.Settings.route) { /* Settings Screen */ }
    }

    BottomNav(items = items) { item ->
        navController.navigate(item.route)
    }
}