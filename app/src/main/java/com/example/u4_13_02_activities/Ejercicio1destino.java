package com.example.u4_13_02_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio1destino extends AppCompatActivity {

    TextView tvNombre, tvApellido,tvEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1destino);

        tvNombre = (TextView)findViewById(R.id.tvnombre);
        tvApellido = (TextView)findViewById(R.id.tvapellido);
        tvEdad = (TextView)findViewById(R.id.tvedad);

        Bundle b = getIntent().getExtras();
        if(b!=null){

            String nombre = b.getString(ejercicio1.EXTRA_NOMBRE);
            String apellido = b.getString(ejercicio1.EXTRA_APELLIDO);
            int edad = b.getInt(ejercicio1.EXTRA_EDAD);

            tvNombre.setText(nombre);
            tvApellido.setText(apellido);
            tvEdad.setText(edad+"");





        }

    }
}
