package com.example.ardi.pantheon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class InstallSoftwareActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView software;
    Intent intent;
    String[] sistem = {"CCleaner","Corel Draw","Photoshop","Driverpack","Microsoft Office 2016"};
    Integer[] imgid = {R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round,R.mipmap.ic_launcher_round };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_install_software);
        setTitle("Software");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        customListAdapter adapter = new customListAdapter(this, sistem, imgid);
        software = findViewById(R.id.Software);
        software.setAdapter(adapter);
        software.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(InstallSoftwareActivity.this, YoutubeActivity.class);
                intent.putExtra("urlnya","wOM9tiu5h-I");
                intent.putExtra("judul", "<b>CCleaner</b>");
                intent.putExtra("html","<i>CCleaner</i>"+" (sebelumnya Crap Cleaner) adalah fasilitas perangkat gratis yang digunakan untuk mengoptimalkan komputer dan membersihkan registry-nya.<br /> Salah satu fitur penting pada program ini adalah tersedianya perkakas untuk membersihkan cache yang ditinggalkan oleh program peramban saat berselancar di internet." +
                        "<br />" +
                        "<br /> Perkakas pelengkap (utility tools) pendamping sistem operasi ini memiliki ukuran yang sangat kecil, sehingga tidak membebani resource komputer saat beroperasi, namun hal ini dikompensasi dengan minimnya fitur yang tersedia jika dibandingkan dengan produk sejenis dengan lisensi berbayar."+"\n"+"Perangkat ini dikembangkan oleh perusahaan Piriform Ltd. dan didesain untuk beroperasi pada sistem Microsoft Windows dan Mac OS X 10.5. CCleaner disediakan gratis untuk para pengguna komputer, sehingga Piriform memerlukan donasi untuk mengembangkan program ini. <br><br> CCleaner tersedia dalam 47 bahasa nasional berbagai negara di dunia dan rencananya untuk versi-versi yang akan datang akan ditambah lagi.<br/>Perangkat lunak ini memiliki 4 menu utama, yaitu:\n" +
                        "<br/>" +
                        "Cleaner" +"<br/>" +
                        "Registry" +"<br/>" +
                        "Tools" +"<br/>" +
                        "Options");
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(InstallSoftwareActivity.this, YoutubeActivity.class);
                intent.putExtra("urlnya","9Ecj6ur1UZU");
                intent.putExtra("judul", "<b>Corel Draw</b>");
                intent.putExtra("html","<i>Corel Draw</i>"+" adalah editor grafik vektor yang dikembangkan oleh Corel, sebuah perusahaan perangkat lunak yang bermarkas di Ottawa, Kanada. \n" +
                        "Versi terbarunya, CorelDRAW X8 (setara dengan versi 18) dirilis pada tanggal 15 maret 2016. CorelDRAW pada awalnya dikembangkan untuk sistem operasi Windows 2000 dan seterusnya. " +
                        "Versi CorelDRAW untuk Mac OS pernah dikembangkan, namun dihentikan karena tingkat penjualannya rendah. Versi terakhir untuk Linux adalah Versi 9 (Rilisan tahun 2000, itu pun perlu di jalankan dengan Wine) dan Untuk OSX adalah versi 11 (Rilisan 2001)");
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(InstallSoftwareActivity.this, YoutubeActivity.class);
                intent.putExtra("urlnya","nxqHeu2iFpE");
                intent.putExtra("judul", "<b>Photoshop</b>");
                intent.putExtra("html","<i>Photoshop</i>"+" adalah perangkat lunak editor citra buatan Adobe Systems yang dikhususkan untuk pengeditan foto/gambar dan pembuatan efek. \n" +"<br/>" +
                        "Perangkat lunak ini banyak digunakan oleh fotografer digital dan perusahaan iklan sehingga dianggap sebagai pemimpin pasar (market leader) untuk perangkat lunak pengolah gambar/foto, dan, bersama Adobe Acrobat, dianggap sebagai produk terbaik yang pernah diproduksi oleh Adobe Systems. \n" +
                        "<br><br>Versi kedelapan aplikasi ini disebut dengan nama Photoshop CS (Creative Suite), versi sembilan disebut Adobe Photoshop CS2, versi sepuluh disebut Adobe Photoshop CS3 , versi kesebelas adalah Adobe Photoshop CS4 , versi keduabelas adalah Adobe Photoshop CS5 , dan versi terbaru adalah Adobe Photoshop CC.\n" +
                        "\n" +
                        "Photoshop tersedia untuk Microsoft Windows, Mac OS X, dan Mac OS; versi 9 ke atas juga dapat digunakan oleh sistem operasi lain seperti Linux dengan bantuan perangkat lunak tertentu seperti CrossOver.");
                startActivity(intent);
                break;


            case 3:
                intent = new Intent(InstallSoftwareActivity.this, YoutubeActivity.class);
                intent.putExtra("urlnya","KwWUdh9aRzg");
                intent.putExtra("judul", "<b>Driverpack</b>");
                intent.putExtra("html","<i>Driverpack</i>"+" disini tersedia dalam single link, atau offline installer. Sebuah software atau Aplikasi terbaru buatan Artur Kuzyakov yang digunakan untuk mendeteksi driver yang ada di laptop atau komputer kita. \n" +
                        "Cara menggunakannya adalah kamu hanya perlu menjalankannya lalu secara otomatis DriverPack akan mendeteksi driver apa yang belum dipasang atau yang harus diperbarui.\n" +
                        "\n" +
                        "Dengan menggunakan Driverpack Solution, maka pengguna akan dengan mudah mendapatkan update dari setiap driver dari hardware komponen komputernya.<br><br>Driverpack memiliki ukuran file yang cukup besar dikarenakan banyaknya driver yang dimiliki dalam satu Driverpack installer. \n" +
                        "Kamu bisa download Driverpack gratis yang berisi driver lengkap yang biasanya harus kamu cari sendiri di masing-masing website resmi dari hardware yang kamu pakai. Driverpack akan selalu update driver yang dimilikinya sehingga pengguna bisa mendapatkan update driver terbaru yang mereka butuhkan.");
                startActivity(intent);

                break;

            case 4:
                intent = new Intent(InstallSoftwareActivity.this, YoutubeActivity.class);
                intent.putExtra("urlnya","mtDDKseaYPM");
                intent.putExtra("judul", "<b>Microsoft Office 2016</b>");
                intent.putExtra("html","<i>Microsoft Office 2016</i>"+" (dengan nama sandi Office 16) adalah versi dari paket aplikasi perkantoran Microsoft Office, menggantikan kedua Office 2013 dan Office untuk Mac 2011. Ini dirilis untuk OS X pada tanggal 9 Juli 2015 untuk pelanggan Office 365.Tanggal rilis resmi untuk Microsoft Office 2016 adalah 22 September 2015. \n" +
                        "Sebuah rilis pratayang untuk versi Windows diumumkan pada konferensi Ignite di Chicago pada bulan Mei 2015 dan dalam versi beta tersedia untuk pengguna Office 365 untuk mencoba atau untuk mengunduh sebagai percobaan beta.");
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}

