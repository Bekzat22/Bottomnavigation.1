package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.fragments.AnimalsFragment
import com.example.myapplication.fragments.FilmFragment
import com.example.myapplication.fragments.TextFragment


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpNav()
    }

    private fun setUpNav() {
        val navHostFragment=
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container1) as NavHostFragment
        val navController = navHostFragment.navController
        binding.navBottom.setupWithNavController(navController)
        binding.navBottom.setOnItemSelectedListener {
            when(it.itemId){
                R.id.filmFragment -> replaceFragment(FilmFragment())
                R.id.catFragment -> replaceFragment(AnimalsFragment())
                R.id.textFragment -> replaceFragment(TextFragment())
            }
            true
        }
        }
    private fun replaceFragment(fragment:Fragment){
        val fragmentmanager = supportFragmentManager
        val fragmenttransaction = fragmentmanager.beginTransaction()
        fragmenttransaction.replace(R.id.nav_host_fragment_container1,fragment)
        fragmenttransaction.commit()
    }
}