package dev.seriy0904.blogv2.view

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import dev.seriy0904.blogv2.R

class MainActivity : AppCompatActivity(){
    private val shpf :SharedPreferences by lazy { getSharedPreferences("USER_DATA", Context.MODE_PRIVATE) }
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        val navGraph = navController.navInflater.inflate(R.navigation.nav_graph)
//        when {
//            UserData.isAuthorized -> {
//                navGraph.setStartDestination(R.id.mainFlowFragment)
//            }
//            !UserData.isAuthorized -> {
//                navGraph.setStartDestination(R.id.signFlowFragment)
//            }
//        }
        navController.graph = navGraph
    }
}