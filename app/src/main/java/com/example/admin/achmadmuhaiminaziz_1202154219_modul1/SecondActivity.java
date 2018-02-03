package com.example.admin.achmadmuhaiminaziz_1202154219_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView  jmlPorsi, namaTmpt, namaMknan, jmlHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        String namaTempat = intent.getStringExtra("namaTmpt");
        String namaMenu = intent.getStringExtra("namaMakanan");
        String totalPorsi = intent.getStringExtra("porsi");
        String Harga = intent.getStringExtra("Hrg");
        int jumlahHrg = Integer.valueOf(Harga)*Integer.valueOf(totalPorsi);

        namaTmpt = (TextView)findViewById(R.id.namaTempat);
        namaTmpt.setText(namaTempat);
        namaMknan = (TextView)findViewById(R.id.menuMakanan);
        namaMknan.setText(namaMenu);
        jmlPorsi = (TextView)findViewById(R.id.jumlahPorsi);
        jmlPorsi.setText(totalPorsi);
        jmlHarga = (TextView)findViewById(R.id.jumlahHarga);
        jmlHarga.setText(String.valueOf(jumlahHrg));

        if (jumlahHrg > 65000){
            Toast message = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG);
            message.show();
        } else {
            Toast message = Toast.makeText(this, "Disini aja makan malamnya",Toast.LENGTH_LONG);
            message.show();
        }
    }
}
