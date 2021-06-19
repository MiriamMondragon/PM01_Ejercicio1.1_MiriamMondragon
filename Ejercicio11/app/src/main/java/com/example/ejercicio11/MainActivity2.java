package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText txtResultado = (EditText) findViewById(R.id.txtN1);

        Intent intent = getIntent();
        String resultado = intent.getStringExtra("resultado");
        txtResultado.setText(resultado);
    }
}