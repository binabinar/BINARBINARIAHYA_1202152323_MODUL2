package com.binar.tugas.binarbinariahya_1202152323_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
    //dibawah untuk mendeklarasikan variabel yang dibutuhkan//
public class ListMenu extends AppCompatActivity {
    RecyclerView rv;
    mnAdapter adapter;
    List<pilihMenu> listmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        setTitle("Menu"); //set title untuk screennya

        //untuk meng INIT kan recyclerview dan adapternya//
        listmenu = new ArrayList<>();
        rv = findViewById(R.id.listMenu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    //command dibawah ini digunakan untuk mengambil memasukkan gambar, nama, harga dan komposisi dari makanan yang akan dipesan//
    //yang dihubungkan oleh adapter//
    private void initdata() {
        listmenu.add(new pilihMenu(R.drawable.cheese, "Cheeseburger", 25000, "Roti, Daging, Acar, Keju"));
        listmenu.add(new pilihMenu(R.drawable.saladd, "Salad", 40000, "Sayur-sayuran ditambah saus yang anda suka"));
        listmenu.add(new pilihMenu(R.drawable.pizza, "Pepperoni Pizza", 60000, "Pepperoni, keju, sayuran, daging, dough"));
        listmenu.add(new pilihMenu(R.drawable.spaghetti, "Spaghetti Bolognese", 35000, "Spaghetti dan saus bolognese"));
        listmenu.add(new pilihMenu(R.drawable.wingss, "Spicy Wings", 50000, "Wings ayam dengan bumbu pedas yang enak"));
        adapter = new mnAdapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}
