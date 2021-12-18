package com.example.nim_nama;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nim_nama.R;

public class TampilVariabel extends Activity {

    TextView nama,nim;
    String get_nama,get_nim;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil);

        nama = (TextView) findViewById(R.id.nama_textView);
        nim = (TextView) findViewById(R.id.nim_textView);

        Bundle b = getIntent().getExtras();

        get_nama = b.getString("parse_nama");
        get_nim = b.getString("parse_nim");

        nama.setText("Nama : "+get_nama);
        nim.setText("Nim : "+get_nim);

    }
}