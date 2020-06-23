package com.example.almacenamientodedatosmediantelaclasesharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //guardas los datos una vez que se cerro la app

    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //comunicar el objeto con el edittext

        et1 = (EditText)findViewById(R.id.mail);

        //todo lo que este en el edit text se guarde

        //obtener lo que se guardo
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        //cuando se arranca la app por rpimera vez no hay nada para evitar errores se pone unparametro vacio
        et1.setText(preferences.getString("mail", ""));

    }

    //dar la funcion al boton

    public void guardar(View view){

        SharedPreferences preferencesGuardar = getSharedPreferences("datos", Context.MODE_PRIVATE);
        //guardar archivo
        //se crea un objeto editor con ayuda de sharepreerences
        // editar el archivo anterior
        SharedPreferences.Editor editor = preferencesGuardar.edit();

        //guarda lo que el usuario escrbio o guardo
        editor.putString("mail", et1.getText().toString());

        //confirmar para  guardar con commit

        editor.commit();

        // que la app se cierre

        finish();
    }


}