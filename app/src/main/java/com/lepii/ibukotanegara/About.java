package com.lepii.ibukotanegara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {
    private TextView namaK, namaA1, namaA2, namaA3, namaA4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        namaK = findViewById(R.id.tv_nama_kelompok);
        namaA1 = findViewById(R.id.tv_nama_anggota_1);
        namaA2 = findViewById(R.id.tv_nama_anggota_2);
        namaA3 = findViewById(R.id.tv_nama_anggota_3);
        namaA4 = findViewById(R.id.tv_nama_anggota_4);

    }
}