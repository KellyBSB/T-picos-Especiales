package com.example.mdibujarovalos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //crear nuetra prpa vista
        Vista vista = new Vista(this);
        setContentView(vista);

    }


    // se usa la clase  canvas el cual es como un lienzo
    //paint es el lapiz



    class Vista extends View {
        public Vista (Context context){
            super(context);
        }

        public void onDraw (Canvas canvas){
            super.onDraw(canvas);

            int ancho = getMeasuredWidth();
            int alto = getMeasuredHeight();

            canvas.drawColor(Color.BLACK);

            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            paint.setColor(Color.BLUE);

            //coordenadas

            //lado izquierdo
            //top arriba
            //lado derecho
            //botom abajo
            //estilo

            canvas.drawOval(50,alto,ancho,50,paint);
        }

    }







}