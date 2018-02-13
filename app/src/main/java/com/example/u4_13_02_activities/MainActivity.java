package com.example.u4_13_02_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static final String EXTRA_NOMBRE = "NOMBRE";

    EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNombre = (EditText)findViewById(R.id.etnombre);




    }//FIN ONCREATE

    public void irSegundaActivity (View view){

    //Navergar  a la siguiente Activity
        String nombre = etNombre.getText().toString();

        Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
        i.putExtra(EXTRA_NOMBRE,nombre);
        startActivity(i);

    }

    public void ejercicio1 (View view){
        Intent i=new Intent(getApplicationContext(),ejercicio1.class);
        startActivity(i);
    }





}//FIN MAIN
