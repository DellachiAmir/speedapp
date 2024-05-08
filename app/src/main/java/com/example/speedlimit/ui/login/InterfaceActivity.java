package com.example.speedlimit.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.speedlimit.MainActivity;
import com.example.speedlimit.R;

public class InterfaceActivity extends AppCompatActivity {
    Button Btnstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preinterface);

        // Navigate to MainActivity when the button is clicked

        Btnstart = findViewById(R.id.button2);
       Btnstart.setOnClickListener(v -> {
            Intent intent = new Intent(InterfaceActivity.this, MainActivity.class);
           startActivity(intent);
       });
    }
}
