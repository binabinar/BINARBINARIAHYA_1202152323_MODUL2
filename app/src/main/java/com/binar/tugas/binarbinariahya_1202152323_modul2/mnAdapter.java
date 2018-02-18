package com.binar.tugas.binarbinariahya_1202152323_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;


public class mnAdapter extends RecyclerView.Adapter<mnAdapter.menuholder> {
    CardView cd;
    private Context context;            //mendeklarasikan seluruh variable yang dibutuhkan//
    private List<pilihMenu> listmenu;

    //command yang digunakan untuk menampung list menu yang ada di dalam aplikasi
    public mnAdapter(Context context, List<pilihMenu> listmenu) {
        this.context = context;
        this.listmenu = listmenu;
    }

    //command dibawah digunakan untuk menampilkan menu yang berisi data dari class listmenu//
    @Override
    public menuholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.menucv, parent, false);
        menuholder holder = new menuholder(view);
        return holder;
    }


    //command dibawah digunakan untuk mengisi data dari 1 menu ke 1 baris tampilan menu lainnya//
    @Override
    public void onBindViewHolder(menuholder holder, int position) {
        pilihMenu data = listmenu.get(position);
        holder.foto.setImageDrawable(context.getResources().getDrawable(data.getFoto()));
        holder.foto.setTag(data.getFoto());
        holder.nama.setText(data.getNama());
        holder.nama.setTag(data.getKomposisi());
        holder.harga.setText("Harga: Rp. " + NumberFormat.getInstance(Locale.US).format(data.getHarga()));

    }

    //mengembalikan berapa banyak menu yang akan ditampilkan di aplikasi
    @Override
    public int getItemCount() {
        return listmenu.size();
    }

    class menuholder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView nama, harga;

        public menuholder(View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.fotomenu);
            nama = itemView.findViewById(R.id.namaMakanan);
            harga = itemView.findViewById(R.id.hargamakanan);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent ganti = new Intent(context, DetailMakanan.class);
                    ganti.putExtra("nama", nama.getText());
                    ganti.putExtra("harga", harga.getText());
                    ganti.putExtra("komposisi", nama.getTag().toString());
                    ganti.putExtra("foto", foto.getTag().toString());
                    context.startActivity(ganti);
                }
            });
        }
    }
}

