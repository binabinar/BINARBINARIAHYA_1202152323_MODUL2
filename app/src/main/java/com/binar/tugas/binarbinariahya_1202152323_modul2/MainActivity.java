package com.binar.tugas.binarbinariahya_1202152323_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int splashInterval = 2000;//ini digunakan untuk mengatur waktu selama 2 detik//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//command ini digunakan untuk membuat layar aplikasi menjadi full screen//
        setContentView(R.layout.activity_main);

        //command dibawah ini digunakan untuk menjadwalkan pesan yang akan di tampilkan pada splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MenuUtama.class);//intent digunakan untuk perpindahan class//
                startActivity(intent);

                Toast.makeText(MainActivity.this, "BinarBinariAhya_1202152323", Toast.LENGTH_LONG).show();
                this.finish();//untuk menampilkan pop up tulisan yang kita inginkan//
            }

            private void finish() {

            }
        }, splashInterval);
    }
}
