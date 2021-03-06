package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;



public class MenuOSActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    Intent intent;
    String[] osname = {"Windows","Linux","Macintosh"};
    Integer[] imgid = {R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round, R.mipmap.ic_launcher_round };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_os);
        setTitle("Install OS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        customListAdapter adapter = new customListAdapter(this, osname, imgid );
        list = findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(MenuOSActivity.this, Windows.class);
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(MenuOSActivity.this, Linux.class);
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(MenuOSActivity.this, Mac.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}
