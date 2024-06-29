package com.example.friendapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText a1, a2, a3, a4;
    AppCompatButton b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        a1 = (EditText) findViewById(R.id.name);
        a2 = (EditText) findViewById(R.id.fname);
        a3 = (EditText) findViewById(R.id.fnick);
        a4 = (EditText) findViewById(R.id.disc);
        b1 = (AppCompatButton) findViewById(R.id.log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = a1.getText().toString();
                String s2 = a2.getText().toString();
                String s3 = a3.getText().toString();
                String s4 = a4.getText().toString();
                Toast.makeText(getApplicationContext(), s1 + s2 + s3 + s4, Toast.LENGTH_SHORT).show();

            }

        });

    }
}