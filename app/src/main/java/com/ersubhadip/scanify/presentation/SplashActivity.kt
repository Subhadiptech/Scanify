package com.ersubhadip.scanify.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bumptech.glide.Glide
import com.ersubhadip.scanify.R
import com.ersubhadip.scanify.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).load(R.drawable.ic_splash).into(binding.splashImage)

        GlobalScope.launch(Dispatchers.Main) {
            delay(2500)
            startActivity(Intent(this@SplashActivity, RegistrationActivity::class.java))
            finish()
        }
    }
}