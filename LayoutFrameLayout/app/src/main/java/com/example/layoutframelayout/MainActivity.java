package com.example.layoutframelayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

// evita relacionar los tamaños de las unas vistas con lo de los demas,
    //coloca una vista encima de otras
    // se puede mostrar un solo elemento como un a imagen

    private ImageView v1;
    private Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relaciones entre parte logica y grafica

        v1 = (ImageView)findViewById(R.id.imageView);
        btn1 = (Button)findViewById(R.id.button);
    }

    // funcion al boton

    public void ocultar (View view){

        //invisible o invisible los elemntos

        //boton se desaresca al precionar
        btn1.setVisibility(View.INVISIBLE);

        //imagen aparesca al precionar
        v1.setVisibility(View.VISIBLE);



    }

}