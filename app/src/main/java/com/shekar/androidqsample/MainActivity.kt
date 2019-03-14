package com.shekar.androidqsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_connectivity.setOnClickListener {
            openSettingsPanel(Settings.Panel.ACTION_INTERNET_CONNECTIVITY)
        }

        button_nfc.setOnClickListener {
            openSettingsPanel(Settings.Panel.ACTION_NFC)
        }

        button_volume.setOnClickListener {
            openSettingsPanel(Settings.Panel.ACTION_VOLUME)
        }
    }

    private fun openSettingsPanel(panel: String) {
        val panelIntent = Intent(panel)
        startActivity(panelIntent)
    }
}
