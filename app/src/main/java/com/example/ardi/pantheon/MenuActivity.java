package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }
    public void men1(View view) {
        Intent pindahActivity1 = new Intent(MenuActivity.this, CariTroubleActivity.class);
        startActivity(pindahActivity1);
            }

    public void men2(View view) {
        Intent pindahActivity1 = new Intent(MenuActivity.this, MenuOSActivity.class);
        startActivity(pindahActivity1);
    }

    public void men3(View view) {
        Intent pindahActivity1 = new Intent(MenuActivity.this, InstallSoftwareActivity.class);
        startActivity(pindahActivity1);
    }

    public void men4(View view) {
        Intent pindahActivity1 = new Intent(MenuActivity.this, AboutActivity.class);
        startActivity(pindahActivity1);
    }


}
