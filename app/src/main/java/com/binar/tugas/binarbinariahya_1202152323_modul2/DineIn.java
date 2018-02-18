package com.binar.tugas.binarbinariahya_1202152323_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Spinner nome;//mendeklarasikan spinner yang ada pada xml//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        setTitle("Dine In");//digunakan untuk memberikan nama tittle pada laman yang terbuka//
        nome = findViewById(R.id.nomeja);//memanggil spinner dengan pengibaratan nome//
    }
    //command dibawah ini digunakan untuk menampilkan pop up toast dan juga untuk melanjutkan pada activity selanjutnya//
    public void liatmenu(View view) {
        Toast.makeText(DineIn.this, nome.getSelectedItem().toString() + " dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DineIn.this, ListMenu.class));
        finish();
    }
}
