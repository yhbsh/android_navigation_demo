package com.example.navigation_demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        final Button backButton = findViewById(R.id.btnBack);
        backButton.setOnClickListener(v -> finish());
    }
}
