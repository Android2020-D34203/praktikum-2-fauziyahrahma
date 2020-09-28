package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.IntArrayEvaluator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnKurang, btnKali, btnTambah;
    EditText edtAngkaPertama, edtAngkaKedua;
    TextView txtHasil;
    double angkaPertama, angkaKedua, hasil;
    String sAngkaPertama, sAngkaKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKurang = (Button)findViewById(R.id.btn_kurang);
        btnKali = (Button)findViewById(R.id.btn_kali);
        btnTambah = (Button)findViewById(R.id.btn_tambah);
        edtAngkaPertama = (EditText)findViewById(R.id.pertama);
        edtAngkaKedua = (EditText)findViewById(R.id.kedua);
        txtHasil = (TextView)findViewById(R.id.hasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama+angkaKedua;
                txtHasil.setText("Hasil operasi adalah :"+angkaPertama+" + "+angkaKedua+" = "+hasil);
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama-angkaKedua;
                txtHasil.setText("Hasil operasi adalah :"+angkaPertama+" - "+angkaKedua+" = "+hasil);
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = edtAngkaPertama.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(edtAngkaKedua.getText().toString());
                hasil = angkaPertama*angkaKedua;
                txtHasil.setText("Hasil operasi adalah :"+angkaPertama+" x "+angkaKedua+" = "+hasil);
            }
        });
    }
}