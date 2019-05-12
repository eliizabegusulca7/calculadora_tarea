package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);

        Button btnSumar = (Button) findViewById(R.id.button);
        Button btnRestar = (Button) findViewById(R.id.button2);
        final TextView tvResultado = (TextView) findViewById(R.id.textView2);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int aux1 = Integer.parseInt(et1.getText().toString());
                int aux2 = Integer.parseInt(et2.getText().toString());
                int resultado = (aux1+aux2);
                tvResultado.setText("El resultado de la suma es " + resultado);


            }


        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int aux1,aux2;
                aux1=Integer.parseInt(et1.getText().toString());
                aux2=Integer.parseInt(et2.getText().toString());
                int resultado = (aux1-aux2);
                tvResultado.setText("El resultado de la resta es"+resultado);
            }
        });


    }}