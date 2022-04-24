package com.example.adrenaline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void launch(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
    public void launchToProfile(View view) {
        Intent intent = new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }
    public void launchToCategory(View view) {
        Intent intent = new Intent(this,Category.class);
        startActivity(intent);
    }
    public void launchToInterest(View view) {
        Intent intent = new Intent(this,Interest.class);
        startActivity(intent);
    }
}