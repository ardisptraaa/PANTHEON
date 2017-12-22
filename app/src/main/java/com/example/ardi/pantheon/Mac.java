package com.example.ardi.pantheon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Mac extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView mac;
    Intent intent;
    String[] sistem = {"Mac OS  Sierra"};
    Integer[] imgid = {R.mipmap.ic_launcher_round};

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mac);
        setTitle("Macintosh");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        customListAdapter adapter = new customListAdapter(this, sistem, imgid);
        mac = findViewById(R.id.mac);
        mac.setAdapter(adapter);
        mac.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(Mac.this, YoutubeActivity.class);
                intent.putExtra("urlnya", "ztuxdqQIiUw");
                intent.putExtra("judul","<b>Mac OS Sierra</b>");
                intent.putExtra("html", "<i>Mac OS Sierra</i> adalah versi  ketiga belas dari macOS (sebelumnya OS X), sistem operasi desktop dan server Apple Inc. untuk komputer Macintosh. Penerus OS X El Capitan, itu adalah versi pertama dari sistem operasi yang dikeluarkan pada juni 2016 sebagai macOS. <br />Sierra dinamai menurut pegunungan California Sierra Nevada. Fitur utamanya yang utama menyangkut Continuity, iCloud, dan windowing, serta dukungan untuk Apple Pay dan Siri." +
                        "<br />" +
                        "<br />Versi beta pertama dari Mac OS Sierra dirilis ke pengembang setelah keynote PDDC 2016 pada tanggal 13 Juni 2016. Peluncuran beta pertama diikuti pada tanggal 7 Juli 2016 dan dipasarkan ke pengguna akhir pada tanggal 20 September 2016, sebagai sebuah upgrade melalui Mac App Store.");
                startActivity(intent);
                break;
        }
    }
}
