package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText n1 = (EditText) findViewById(R.id.txtN1);
        EditText n2 = (EditText) findViewById(R.id.txtN2);

        Button btnSumar = (Button) findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nuevoLayout(n1, 1, n2, v);
            }
        });

        Button btnRestar = (Button) findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nuevoLayout(n1, 2, n2, v);
            }
        });

        Button btnDividir = (Button) findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nuevoLayout(n1, 3, n2, v);
            }
        });

        Button btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nuevoLayout(n1, 4, n2, v);
            }
        });
    }

    public void nuevoLayout(EditText n1, int signo, EditText n2, View v) {
        double numero1 = Double.parseDouble(n1.getText().toString());
        double numero2 = Double.parseDouble(n2.getText().toString());
        Operacion op = new Operacion(numero1, signo, numero2);

        Intent intent = new Intent(v.getContext(), MainActivity2.class);
        intent.putExtra("resultado", String.valueOf(op.getResultado()));
        v.getContext().startActivity(intent);
    }
}