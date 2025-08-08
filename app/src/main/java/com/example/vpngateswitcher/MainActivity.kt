package com.example.vpngateswitcher

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSwitch = findViewById<Button>(R.id.btnSwitch)
        btnSwitch.setOnClickListener {
            // Здесь будет логика смены VPN-сервера через VPNGate
            // Пока просто тестовый вывод
            btnSwitch.text = "Новый IP активирован"
        }
    }
}
