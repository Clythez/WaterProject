package com.example.waterproject;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.landingPage);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Button nextButton = findViewById(R.id.buttonNext);
        nextButton.setOnClickListener(
            view -> {
                Intent j = new Intent(LandingPage.this, ReportPage.class);
                startActivity(j);
            }
        );

        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(
                view -> {
                    Intent i = new Intent(LandingPage.this, LoginScreen.class);
                    startActivity(i);
                }
        );
    }
}