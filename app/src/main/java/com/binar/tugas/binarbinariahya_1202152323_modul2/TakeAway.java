package com.binar.tugas.binarbinariahya_1202152323_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }
    //command dibawah digunakan untuk meneruskan ke activity selanjutnya//
    public void liatmenuu(View view) {
        startActivity(new Intent(TakeAway.this, ListMenu.class));
        finish();
    }
}
