package com.example.nim_nama;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nim_nama.R;


public class MainActivity extends Activity {

    String var_nama,var_nim;
    EditText nama, nim;
    private Object v;
    private Object View;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama_editText);
        nim = (EditText) findViewById(R.id.nim_editText);


        Button submit = (Button) findViewById(R.id.kirim_btn);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                var_nama = nama.getText().toString();
                var_nim = nim.getText().toString();
                Intent i = null;
                i = new Intent(MainActivity.this, TampilVariabel.class);
                Bundle b = new Bundle();
                b.putString("parse_nama", var_nama);
                b.putString("parse_nim", var_nim);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}
