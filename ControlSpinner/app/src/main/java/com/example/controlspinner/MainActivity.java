package com.example.controlspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText et1,et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.valor1);
        et2 = (EditText) findViewById(R.id.valor2);
        tv1 = (TextView) findViewById(R.id.resultado);
        spinner1 = (Spinner) findViewById(R.id.spinner);

        //llenar el spinner
        //es necesario usar vectores o arreglos

        String[] opciones ={"Sumar","Restar","Multiplicar","Dividir"};

        //comunicacion con el spiner en la parte grafica y logica
        //texto se muestre dentro del spinner
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, opciones);
        spinner1.setAdapter(adapter);

    }

    //metodo para el boton

    public void calcular(View view){

        // se optiene los valores
        String v1 = et1.getText().toString();
        String v2 = et2.getText().toString();

        // se transforman a enteros

        int vl1 = Integer.parseInt(v1);
        int vl2 = Integer.parseInt(v2);

        //selecionar una opcion

        String select = spinner1.getSelectedItem().toString();

        if(select.equals("Sumar")){
            int sum = vl1 + vl2;
            String resul = String.valueOf(sum);
            tv1.setText(resul);
        }
        else if(select.equals("Restar")){
            int res = vl1 - vl2;
            String resul = String.valueOf(res);
            tv1.setText(resul);
        }
        else if(select.equals("Multiplicar")){
            int mul = vl1 * vl2;
            String resul = String.valueOf(mul);
            tv1.setText(resul);
        }
        else if(select.equals("Dividir")){
            if(vl2!=0) {
                int div = vl1 / vl2;
                String resul = String.valueOf(div);
                tv1.setText(resul);
            }else{
                Toast.makeText(this, "No se puede dividir para cero", Toast.LENGTH_LONG).show();
            }

        }else{
            tv1.setText("no ingreso valores");
        }


    }


}