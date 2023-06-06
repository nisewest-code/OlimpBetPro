package com.olim.pbe.tpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.olim.pbe.tpro.databinding.ActivityMainBinding
import com.olim.pbe.tpro.delegate.BoardDelegate
import com.olim.pbe.tpro.delegate.DelegateUtils

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val delegate = DelegateUtils.root

        binding.start.setOnClickListener(delegate)
        binding.settings.setOnClickListener(delegate)
        binding.exit.setOnClickListener(delegate)
    }
}