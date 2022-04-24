package com.example.adrenaline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Category extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
    }
    public void launchToInterest(View view) {
        Intent intent = new Intent(this,Interest.class);
        startActivity(intent);
    }
}
