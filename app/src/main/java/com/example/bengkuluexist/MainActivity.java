package com.example.bengkuluexist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

import adapter.ItemAdapter;
import model_data.Item;
import model_data.ItemData;

public class MainActivity extends AppCompatActivity {
    private RecyclerView list_item;
    private ArrayList<Item> list = new ArrayList<>();
    private String title = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle("Beranda");

        list_item = findViewById(R.id.list_item);
        list_item.setHasFixedSize(true);

        list.addAll(ItemData.getListData());
        showRecyclerList();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.tentang:
                about();
                break;
        }
    }


    private void about() {
        Intent pindahAbout = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(pindahAbout);
    }

    private void showRecyclerList(){
        list_item.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter itemAdapter = new ItemAdapter(list);
        list_item.setAdapter(itemAdapter);

        itemAdapter.setOnItemClickCallback(new ItemAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Item data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(Item item) {
        Intent pindahDetail = new Intent(MainActivity.this, DetailActivity.class);
        pindahDetail.putExtra(DetailActivity.nama, item.getNama());
        pindahDetail.putExtra(DetailActivity.deskripsi, item.getKeterangan());
        pindahDetail.putExtra(DetailActivity.foto, item.getPhoto());
        pindahDetail.putExtra(DetailActivity.kategori, item.getKategori());
        startActivity(pindahDetail);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
