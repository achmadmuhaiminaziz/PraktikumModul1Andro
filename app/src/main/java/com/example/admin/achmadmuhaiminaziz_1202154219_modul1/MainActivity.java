package com.example.admin.achmadmuhaiminaziz_1202154219_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText menu, jmlPorsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        menu = (EditText)findViewById(R.id.menuMakanan);
        jmlPorsi =(EditText)findViewById(R.id.porsi);

        String namaMenu = menu.getText().toString();
        String jumlahPorsi = jmlPorsi.getText().toString();

        intent.putExtra("namaTmpt","EatBus");
        intent.putExtra("namaMakanan", namaMenu);
        intent.putExtra("porsi", jumlahPorsi);
        intent.putExtra("Hrg", "50000");
        startActivity(intent);

    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        menu = (EditText)findViewById(R.id.menuMakanan);
        jmlPorsi =(EditText)findViewById(R.id.porsi);

        String namaMenu = menu.getText().toString();
        String jumlahPorsi = jmlPorsi.getText().toString();

        intent.putExtra("namaTmpt","Abnormal");
        intent.putExtra("namaMakanan", namaMenu);
        intent.putExtra("porsi", jumlahPorsi);
        intent.putExtra("Hrg", "30000");
        startActivity(intent);
    }
}
