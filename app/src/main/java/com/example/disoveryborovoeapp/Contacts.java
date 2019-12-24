package com.example.disoveryborovoeapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Contacts extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        toolbar = findViewById(R.id.toolContacts);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        actionBar.setTitle("Articles");
    }
}
