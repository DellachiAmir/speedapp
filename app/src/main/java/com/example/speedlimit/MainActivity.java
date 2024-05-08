package com.example.speedlimit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etVitesse, etPhone, etPeriod;
    Button btnSave;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        etVitesse = findViewById(R.id.vitesse);
        etPhone = findViewById(R.id.editTextPhone);
        etPeriod = findViewById(R.id.time);
        btnSave = findViewById(R.id.button);

        // Get shared preferences
        sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE);
        editor = sharedPref.edit();

        // Save button click listener
        btnSave.setOnClickListener(view -> {
            // Get values from EditText fields and convert to int
            int vitesse = Integer.parseInt(etVitesse.getText().toString());
            int phone = Integer.parseInt(etPhone.getText().toString());
            int period = Integer.parseInt(etPeriod.getText().toString());

            // Store values in shared preferences
            editor.putInt("vitesse", vitesse);
            editor.putInt("phone", phone);
            editor.putInt("period", period);

            // Commit changes
            editor.apply();
        });

    }
}
