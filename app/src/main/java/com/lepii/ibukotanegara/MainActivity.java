package com.lepii.ibukotanegara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvIbukota;
    private ArrayList<ModelIbukota> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvIbukota = findViewById(R.id.rv_ibukota);
        rvIbukota.setHasFixedSize(true);

        data.addAll(DataIbukota.ambilDataIbukota());
        tampilDataCard();
    }

    private void tampilDataCard(){
        rvIbukota.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard adapterCard = new AdapterCard(data, MainActivity.this);
        rvIbukota.setAdapter(adapterCard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menu_about) {
            Intent pindah = new Intent(MainActivity.this, About.class);
            startActivity(pindah);
        }
        return super.onOptionsItemSelected(item);
    }
}