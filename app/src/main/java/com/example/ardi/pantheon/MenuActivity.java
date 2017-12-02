package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MenuActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }
    public void men1(View view) {
        intent = new Intent(MenuActivity.this, ErrorMainActivity.class);
        startActivity(intent);
            }

    public void men2(View view) {
        intent = new Intent(MenuActivity.this, MenuOSActivity.class);
        startActivity(intent);
    }

    public void men3(View view) {
        intent = new Intent(MenuActivity.this, InstallSoftwareActivity.class);
        startActivity(intent);

    }

    public void men4(View view) {
        intent = new Intent(MenuActivity.this, AboutActivity.class);
        startActivity(intent);
    }


}
