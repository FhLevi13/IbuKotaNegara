package com.lepii.ibukotanegara;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

//    private void tampilAbout(){
//        rvIbukota.setLayoutManager(new LinearLayoutManager(this));
//        About aboutTentang = new About(data, MainActivity.this);
//        rvIbukota.setAdapter(aboutTentang);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_node, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.menu_about:
//                tampilAbout();
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}