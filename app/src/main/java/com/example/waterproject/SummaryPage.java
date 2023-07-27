package com.example.waterproject;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SummaryPage extends AppCompatActivity {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.summaryPage);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        Button nextButton = findViewById(R.id.buttonNext);
        nextButton.setOnClickListener(
                view -> {
                    Intent j = new Intent(SummaryPage.this, ConfirmationPage.class);
                    startActivity(j);
                }
        );

        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(
                view -> {
                    Intent i = new Intent(SummaryPage.this, ReportPage.class);
                    startActivity(i);
                }
        );
    }
}