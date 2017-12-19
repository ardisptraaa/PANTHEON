package com.example.ardi.pantheon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



public class Windows extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView windows;
    Intent intent;
    String[] sistem = {"Windows 7","Windows 8","Windows 10"};
    Integer[] imgid = {R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.windows);
        setTitle("Windows");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        customListAdapter adapter = new customListAdapter(this, sistem, imgid);
        windows = findViewById(R.id.windows);
        windows.setAdapter(adapter);
        windows.setOnItemClickListener(this);

    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(Windows.this, YoutubeActivity.class);
                intent.putExtra("urlnya","TPHhOxwI-i0");
                intent.putExtra("text1","Windows 7 \nWindows 7 adalah versi windows terakhir yang menggunakan menu start yang menggantikan versi windows sebelumnya, Windows Vista.\nWindows 7 dirilis untuk pabrikan komputer pada 22 Juli 2009 dan dirilis untuk publik pada 22 Oktober 2009, kurang dari tiga tahun setelah rilis pendahulunya, Windows Vista.\n" +
                        "\n" +
                        "Tidak seperti pendahulunya yang memperkenalkan banyak fitur baru, Windows 7 lebih fokus pada pengembangan dasar Windows, dengan tujuan agar lebih kompatibel dengan aplikasi-aplikasi dan perangkat keras komputer yang kompatibel dengan Windows Vista. Presentasi Microsoft tentang Windows 7 pada tahun 2008 lebih fokus pada dukungan multi-touch pada layar, desain ulang taskbar yang sekarang dikenal dengan nama Superbar, sebuah sistem jaringan rumahan bernama HomeGroup, dan peningkatan performa. Beberapa aplikasi standar yang disertakan pada versi sebelumnya dari Microsoft Windows, seperti Windows Calendar, Windows Mail, Windows Movie Maker, dan WIndows Photo Gallery tidak disertakan lagi di Windows 7; kebanyakan ditawarkan oleh Microsoft secara terpisah sebagai bagian dari paket Windows Live Essentials yang gratis.");
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(Windows.this, YoutubeActivity.class);
                intent.putExtra("urlnya","KJx9Jt_nX9w");
                intent.putExtra("text1","windows8");
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(Windows.this, YoutubeActivity.class);
                intent.putExtra("urlnya","PjRDbxzAjic");
                intent.putExtra("text1","windows10");
                startActivity(intent);
                break;

            default:
                break;
        }
}}

