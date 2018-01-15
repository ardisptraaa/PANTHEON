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


public class Linux extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView linux;
    Intent intent;
    String[] sistem = {"Linux Kali","Linux Mint","Linux Ubuntu"};
    Integer[] imgid = {R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linux);
        setTitle("Linux");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        customListAdapter adapter = new customListAdapter(this, sistem, imgid);
        linux = findViewById(R.id.linux);
        linux.setAdapter(adapter);
        linux.setOnItemClickListener(this);
    }

        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0:
                    intent = new Intent(Linux.this, YoutubeActivity.class);
                    intent.putExtra("urlnya","DxWEQNYbGvg");
                    intent.putExtra("judul", "<b>Linux Kali</b>");
                    intent.putExtra("html","<i>Linux Kali</i> adalah distribusi berlandasan distribusi Debian GNU/Linux untuk tujuan forensik digital dan di gunakan untuk pengujian penetrasi, yang dipelihara dan didanai oleh Offensive Security. Kali juga dikembangkan oleh  Offensive Security sebagai penerus BackTrack Linux.<br /> <br /> Kali menyediakan pengguna dengan mudah akses terhadap koleksi yang besar dan komprehensif untuk alat yang berhubungan dengan keamanan, termasuk port scanner untuk password cracker." +
                            "<br />" +
                            "<br /> Dukungan untuk Live CD dan fungsi Live USB memungkinkan pengguna untuk booting langsung dari portable media tanpa memerlukan instalasi, meskipun instalasi permanen ke hard disk juga merupakan pilihan yang baik. Kali merupakan platform yang mendukung Metasploit Framework dari Proyek Metasploit, berupa alat untuk mengembangkan dan melaksanakan kode eksploitasi terhadap mesin target jarak jauh.");
                    startActivity(intent);
                    break;

                case 1:
                    intent = new Intent(Linux.this, YoutubeActivity.class);
                    intent.putExtra("urlnya","yMb1bp4pkYs");
                    intent.putExtra("judul","<b>Linux Mint</b>");
                    intent.putExtra("html","<i>Linux Mint</i> adalah sistem operasi Linux yang merupakan suatu distribusi Linux dengan basis Debian dan Ubuntu, dengan Linux Mint Debian Edition (LMDE) sebagai suatu alternatif yang sepenuhnya berbasis Debian.<br /> <br />Aplikasi yang dapat berjalan di Ubuntu, juga bisa berjalan pada LinuxMint. Walaupun inti dari Linux Mint adalah Ubuntu, Linux Mint hadir dengan tampilan yang berbeda dengan Ubuntu." +
                            "<br />" +
                            "<br />Distribusi ini dibuat oleh Clement Lefebvre, dan dikembangkan secara aktif oleh tim dari Linux Mint maupun komunitas yang ada di dalamnya.");
                    startActivity(intent);
                    break;

                case 2:
                    intent = new Intent(Linux.this, YoutubeActivity.class);
                    intent.putExtra("urlnya","lhj8n-krvIU");
                    intent.putExtra("judul","<b>Linux Ubuntu</b>");
                    intent.putExtra("html","<i>Linux Ubuntu </i> merupakan salah satu distribusi Linux yang berbasiskan Debian dan didistribusikan sebagai perangkat lunak bebas. Nama Ubuntu berasal dari filosofi dari Afrika Selatan yang berarti 'kemanusiaan kepada sesama'.<br /> <br /> Ubuntu dirancang untuk kepentingan penggunaan pribadi, namun versi server Ubuntu juga tersedia, dan telah dipakai secara luas.\n" +
                            "\n" +
                            "Proyek Ubuntu resmi disponsori oleh Canonical Ltd. yang merupakan sebuah perusahaan yang dimiliki oleh pengusaha Afrika Selatan Mark Shuttleworth. Tujuan dari distribusi Linux Ubuntu adalah membawa semangat yang terkandung di dalam filosofi Ubuntu ke dalam dunia perangkat lunak.<br /> <br /> Ubuntu adalah sistem operasi lengkap berbasis Linux, tersedia secara bebas, dan mempunyai dukungan baik yang berasal dari komunitas maupun tenaga ahli profesional.");
                    startActivity(intent);
                    break;

                default:
                    break;
            }
        }
    }
