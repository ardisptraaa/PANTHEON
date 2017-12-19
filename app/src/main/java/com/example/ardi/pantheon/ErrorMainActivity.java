package com.example.ardi.pantheon;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class ErrorMainActivity extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    public static ArrayList<ErrorObjectModel> data;
    DatabaseHelper db ;
    ArrayList<String> wordcombimelist;
    ArrayList<String> meancombimelist;
    LinkedHashMap<String,String> namelist;
    SearchView searchView;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);
        setTitle("Cari Kode Error");
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        db= new DatabaseHelper(this);
        searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setQueryHint("Cari Disini");
        searchView.setQueryRefinementEnabled(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        data = new ArrayList<ErrorObjectModel>();
        fetchData();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {return  false; }

            @Override
            public boolean onQueryTextChange(String newText) {


                newText = newText.toLowerCase();

                final ArrayList<ErrorObjectModel> filteredList = new ArrayList<ErrorObjectModel>();

                for (int i = 0; i < wordcombimelist.size(); i++) {

                    final String text = wordcombimelist.get(i).toLowerCase();
                    if (text.contains(newText)) {

                        filteredList.add(new ErrorObjectModel(wordcombimelist.get(i),meancombimelist.get(i)));
                    }
                }
                adapter = new CustomAdapter(filteredList);
                recyclerView.setAdapter(adapter);


                return true;
            }

        });


    }
    public void fetchData()
    {
        db =new DatabaseHelper(this);
        try {

            db.createDataBase();
            db.openDataBase();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


        namelist=new LinkedHashMap<>();
        int ii;
        SQLiteDatabase sd = db.getReadableDatabase();
        Cursor cursor = sd.query("Dictionary1" ,null, null, null, null, null, null);
        ii=cursor.getColumnIndex("word");
        wordcombimelist=new ArrayList<String>();
        meancombimelist= new ArrayList<String>();
        while (cursor.moveToNext()){
            namelist.put(cursor.getString(ii), cursor.getString(cursor.getColumnIndex("definition")));
        }
        Iterator entries = namelist.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry thisEntry = (Map.Entry) entries.next();
            wordcombimelist.add(String.valueOf(thisEntry.getKey()));
            meancombimelist.add("- "+String.valueOf(thisEntry.getValue()));
        }

        for (int i = 0; i < wordcombimelist.size(); i++) {
          data.add(new ErrorObjectModel(wordcombimelist.get(i), meancombimelist.get(i)));
          }
        adapter = new CustomAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
