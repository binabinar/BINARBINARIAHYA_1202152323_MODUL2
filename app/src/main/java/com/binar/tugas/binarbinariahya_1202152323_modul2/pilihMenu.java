package com.binar.tugas.binarbinariahya_1202152323_modul2;

/**
 * Created by telkom on 17/02/2018.
 */
        //mendeklarasikan variabel yang dibutuhkan//

public class pilihMenu {
    int foto;
    String nama;
    int harga;
    String komposisi;

    //untuk mengambil nilai yang telah di deklarasikan sebelumnya//
    public pilihMenu(int foto, String nama, int harga, String komposisi) {
        this.foto = foto;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }
    //mendefinisikan identifier untuk masing-masing variabel//
    public int getFoto() {
        return foto;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKomposisi() {
        return komposisi;
    }
}
