package com.ersubhadip.scanify.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ersubhadip.scanify.R
import com.ersubhadip.scanify.databinding.ActivityMainBinding
import com.ersubhadip.scanify.databinding.ActivityRegistrationBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)


        GlobalScope.launch(Dispatchers.Main) {
            delay(1000)
            val bottomSheetDialog = BottomSheetDialog(this@RegistrationActivity)
            val view = LayoutInflater.from(this@RegistrationActivity)
                .inflate(R.layout.registration_name_sheet, null, false)
            bottomSheetDialog.apply {
                setContentView(view)
                setCancelable(true)
                bottomSheetDialog.show()
            }
        }
    }
}