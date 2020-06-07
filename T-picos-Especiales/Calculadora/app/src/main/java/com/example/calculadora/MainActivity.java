package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,menos,mas,multi,divi,sen,cos,tan,igual,borrar_caracter,borrar_todo;
    TextView resultado;
    String mostrar,antesdeloperador,operacion,despuessdeloperador;
    String vacio="";
    double res,radians;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        tres = findViewById(R.id.tres);
        cuatro = findViewById(R.id.cuatro);
        cinco = findViewById(R.id.cinco);
        seis = findViewById(R.id.seis);
        siete = findViewById(R.id.siete);
        ocho = findViewById(R.id.ocho);
        nueve = findViewById(R.id.nueve);
        cero = findViewById(R.id.cero);
        mas=findViewById(R.id.mas);
        menos= findViewById(R.id.menos);
        multi=findViewById(R.id.multi);
        divi=findViewById(R.id.divi);
        sen=findViewById(R.id.sen);
        cos=findViewById(R.id.cos);
        tan=findViewById(R.id.tan);
       igual= findViewById(R.id.igual);
        borrar_caracter=findViewById(R.id.Borrar_caracter);
        borrar_todo=findViewById(R.id.Borrar_todo);
        resultado = findViewById(R.id.resultadoPantalla);


        //mostar
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "1";
                resultado.setText(mostrar);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "2";
                resultado.setText(mostrar);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "3";
                resultado.setText(mostrar);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "4";
                resultado.setText(mostrar);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "5";
                resultado.setText(mostrar);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "6";
                resultado.setText(mostrar);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "7";
                resultado.setText(mostrar);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "8";
                resultado.setText(mostrar);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "9";
                resultado.setText(mostrar);
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar= mostrar + "0";
                resultado.setText(mostrar);
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                antesdeloperador=resultado.getText().toString();
                operacion="+";
                resultado.setText("");
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                antesdeloperador=resultado.getText().toString();
                operacion="-";
                resultado.setText("");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                antesdeloperador=resultado.getText().toString();
                operacion="*";
                resultado.setText("");
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                antesdeloperador=resultado.getText().toString();
                operacion="/";
                resultado.setText("");
            }
        });
        sen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                antesdeloperador=resultado.getText().toString();
                operacion="sen";
                resultado.setText("");
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                antesdeloperador=resultado.getText().toString();
                operacion="cos";
                resultado.setText("");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                antesdeloperador=resultado.getText().toString();
                operacion="tan";
                resultado.setText("");
            }
        });
        borrar_todo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
            }
        });
        borrar_caracter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrar = resultado.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                resultado.setText(mostrar);
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacion.equals("+")){
                    res= Double.parseDouble(antesdeloperador) + Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(res));
                }
                if(operacion.equals("-")){
                    res= Double.parseDouble(antesdeloperador) - Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(res));
                }
                if(operacion.equals("*")){
                    res= Double.parseDouble(antesdeloperador) * Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(res));
                }
                if(operacion.equals("/")){
                    res= Double.parseDouble(antesdeloperador) / Double.parseDouble(resultado.getText().toString());
                    resultado.setText(String.valueOf(res));
                }
                if(operacion.equals("sen")){
                    radians = Math.toRadians(Double.parseDouble(antesdeloperador));
                    res= Math.sin(radians);
                    resultado.setText(String.valueOf(res));
                }
                if(operacion.equals("cos")){
                    radians = Math.toRadians(Double.parseDouble(antesdeloperador));
                    res= Math.cos(radians);
                    resultado.setText(String.valueOf(res));
                }
                if(operacion.equals("tan")){
                    radians = Math.toRadians(Double.parseDouble(antesdeloperador));
                    res= Math.tan(radians);
                    resultado.setText(String.valueOf(res));
                }
            }
        });


    }



}