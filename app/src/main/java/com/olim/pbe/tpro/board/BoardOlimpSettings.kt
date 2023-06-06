package com.olim.pbe.tpro.board

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.olim.pbe.tpro.databinding.ActivityBoardOlimpSettingsBinding
import com.olim.pbe.tpro.delegate.DelegateUtils

class BoardOlimpSettings : AppCompatActivity() {
    private lateinit var binding: ActivityBoardOlimpSettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoardOlimpSettingsBinding.inflate(layoutInflater)
        val delegate = DelegateUtils.settings
        setContentView(binding.root)
        binding.back.setOnClickListener(delegate)
    }
}