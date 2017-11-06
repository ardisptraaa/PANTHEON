package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MasalahActivity extends AppCompatActivity {
    ImageView imgView;
    TextView txtView1,txtView2;
    // int linkGambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masalah);


        //   imgView = (ImageView) findViewById(R.id.gambar);

        txtView1 = (TextView) findViewById(R.id.tv1);
        txtView2 = (TextView) findViewById(R.id.tv2);

        Intent intent = getIntent();
        String Tit = intent.getStringExtra("Tit");

        setTitle(Tit);
        // linkGambar = intent.getIntExtra("gambar", linkGambar);
        // imgView.setImageResource(linkGambar);
        txtView1.setText(intent.getStringExtra("text1"));
        txtView2.setText(intent.getStringExtra("text2"));
    }
}
