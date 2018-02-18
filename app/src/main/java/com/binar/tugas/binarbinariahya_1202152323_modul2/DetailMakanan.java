package com.binar.tugas.binarbinariahya_1202152323_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
    //mendeklarasikan variabel//
public class DetailMakanan extends AppCompatActivity {
    ImageView foto;
    TextView nama, harga, komposisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        setTitle("Detail Menu");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //untuk menambahkan action bar yang ada di pojok kiri atas screen//

        //untuk mengambil data dari xml yang diibaratkan oleh id//
        foto = findViewById(R.id.gambarr);
        nama = findViewById(R.id.detailnama);
        komposisi = findViewById(R.id.detailkomposisi);
        harga = findViewById(R.id.detailharga);

        //untuk mengambil activity lain dan mengambil nilai yang telah didefinisikan//
        harga.setText(getIntent().getStringExtra("harga"));
        komposisi.setText(getIntent().getStringExtra("komposisi"));
        nama.setText(getIntent().getStringExtra("nama"));
        foto.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("foto"))));
    }
}
