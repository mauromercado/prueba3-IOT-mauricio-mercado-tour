package com.example.prueba3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trekking(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, trekking.class);
        startActivity(i);
    }

    public void cabalgata(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, cabalgata.class);
        startActivity(i);
    }

    public void canopy(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, canopy.class);
        startActivity(i);
    }

    public void rafting(View view) {
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, rafting.class);
        startActivity(i);
    }


}