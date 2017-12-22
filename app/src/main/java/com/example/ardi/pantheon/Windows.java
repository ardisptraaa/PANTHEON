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
                intent.putExtra("judul", "<b>Windows 7</b>");
                intent.putExtra("html","<i>Windows 7</i>"+" adalah versi windows terakhir yang menggunakan menu start yang menggantikan versi windows sebelumnya, Windows Vista.<br /> Windows 7 dirilis untuk pabrikan komputer pada 22 Juli 2009 dan dirilis untuk publik pada 22 Oktober 2009, kurang dari tiga tahun setelah rilis pendahulunya, Windows Vista." +
                        "<br />" +
                        "<br /> Tidak seperti pendahulunya yang memperkenalkan banyak fitur baru, Windows 7 lebih fokus pada pengembangan dasar Windows, dengan tujuan agar lebih kompatibel dengan aplikasi-aplikasi dan perangkat keras komputer yang kompatibel dengan Windows Vista.<br /> Presentasi Microsoft tentang Windows 7 pada tahun 2008 lebih fokus pada dukungan multi-touch pada layar, desain ulang taskbar yang sekarang dikenal dengan nama Superbar, sebuah sistem jaringan rumahan bernama HomeGroup, dan peningkatan performa. <br /> <br /> Beberapa aplikasi standar yang disertakan pada versi sebelumnya dari Microsoft Windows, seperti Windows Calendar, Windows Mail, Windows Movie Maker, dan WIndows Photo Gallery tidak disertakan lagi di Windows 7. Kebanyakan ditawarkan oleh Microsoft secara terpisah sebagai bagian dari paket Windows Live Essentials yang gratis.");
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(Windows.this, YoutubeActivity.class);
                intent.putExtra("urlnya","KJx9Jt_nX9w");
                intent.putExtra("judul", "<b>Windows 8</b>");
                intent.putExtra("html","<i>Windows 8</i>"+" adalah nama dari salah satu versi Microsoft Windows, serangkaian sistem operasi yang diproduksi oleh Microsoft untuk digunakan pada komputer pribadi, termasuk komputer rumah dan bisnis, laptop, netbook, tablet PC, server, dan PC pusat media."+"<br /> <br />"+"Sistem operasi ini menggunakan mikroprosesor ARM selain mikroprosesor x86 tradisional buatan Intel dan AMD. Antarmuka penggunanya diubah agar mampu digunakan pada peralatan layar sentuh selain mouse dan keyboard, sehingga Windows 8 di desain untuk perangkat tablet sentuh." +
                        "<br />" +
                        "<br /> Microsoft secara resmi merilis Windows 8 pada 26 Oktober 2012 bersamaan dengan peluncuran komputer perdana yang menggunakan Windows 8.Versi percobaan Windows 8 berupa Consumer Preview dan Release Preview. "+"<br /> <br />"+"Pada 26 Juni 2013, Microsoft merilis versi Uji Coba dari Windows 8.1 (sebelumnya dikenal sebagai Windows Blue), sebuah peningkatan untuk Windows 8, Windows 7, Windows Vista, dan Windows XP. Pada 18 Oktober 2013, Microsoft merilis Windows 8.1 sebagai pembaruan gratis untuk Windows 8.");
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(Windows.this, YoutubeActivity.class);
                intent.putExtra("urlnya","PjRDbxzAjic");
                intent.putExtra("judul", "<b>Windows 10</b>");
                intent.putExtra("html","<i>Windows 10</i>"+" merupakan sistem operasi komputer pribadi yang dikembangkan oleh Microsoft sebagai bagian dari keluarga sistem operasi Windows NT. Diperkenalkan pada tanggal 30 September 2014 dirilis pada 29 Juli 2015 dan pada November 2015, Threshold 2 dari Windows 10 (v10.0.10586) dirilis ke publik." +
                        "<br />" +
                        "<br /> Pertama diperkenalkan pada bulan April 2014 pada Konferensi Build, Windows 10 bertujuan untuk mengatasi kekurangan dalam antarmuka pengguna pertama kali diperkenalkan oleh Windows 8 dengan menambahkan mekanik tambahan yang dirancang untuk meningkatkan pengalaman pengguna untuk perangkat yang tidak ada layar sentuh (seperti komputer meja dan laptop), termasuk kebangkitan menu Mulai yang terlihat di Windows 7, sistem desktop maya, dan kemampuan untuk menjalankan aplikasi Bursa Windows dalam jendela pada desktop daripada modus layar penuh.");
                startActivity(intent);
                break;

            default:
                break;
        }
}
}


