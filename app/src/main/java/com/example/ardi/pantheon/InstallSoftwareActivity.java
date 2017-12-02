package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class InstallSoftwareActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent (getApplicationContext(),MenuActivity.class);
        startActivityForResult(intent,0);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_install_software);
        setTitle("Install Software");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
