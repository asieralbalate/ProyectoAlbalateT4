package com.example.proyectoalbalatet4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectoalbalatet4.ui.theme.ProyectoAlbalateT4Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoAlbalateT4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),

                    ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "FrontPage") {

                        composable("Project5") { Project5(navController = navController) }
                        composable("Project6") { Project6(navController = navController) }
                        composable("Project7") { Project7(navController = navController) }
                        composable("Project8") { Project8(navController = navController) }
                        composable("Project9") { Project9(navController = navController) }
                        composable("FrontPageU4") { FrontPageU4(navController = navController) }
                        composable("FrontPage") { FrontPage(navController = navController)
                        }
                    }

                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoAlbalateT4Theme {
    }
}