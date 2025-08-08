package com.example.vpnapp;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.changeIpButton);
        btn.setOnClickListener(v -> {
            // Здесь должна быть логика смены IP через VPN API
            btn.setText("IP обновлён!");
        });
    }
}