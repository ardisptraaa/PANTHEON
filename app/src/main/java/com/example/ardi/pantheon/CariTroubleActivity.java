package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


public class CariTroubleActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    Intent intent;
    ArrayAdapter adapter;
    String[] daftar = {"1","2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_trouble);

        listView = findViewById(R.id.cariTrouble);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_activated_1, daftar);
        listView.setAdapter(adapter);
        intent = new Intent(CariTroubleActivity.this, MasalahActivity.class);
        listView.setOnItemClickListener(this);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cari, menu);
        final MenuItem item = menu.findItem(R.id.menuCari);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String list) {
                adapter.getFilter().filter(list);
                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0 :

                intent.putExtra("Tit", "Error Code");
                intent.putExtra("text1","Title 1");
                intent.putExtra("text2","Error 1ccccc");
                startActivity(intent);
                break;
            case 1 :

                intent.putExtra("Tit", "Error Code");
                intent.putExtra("text1","Title 2");
                intent.putExtra("text2","Error 2cccc");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
//Masih prototype om
