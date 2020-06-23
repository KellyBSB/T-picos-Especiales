package com.example.componenteactionbarocultarloymostrarlo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodo para mostar y ocultar el menu
    // se  pone ese nombre de manera forsoza

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.opcionesmenu, menu);

        // que se oculte o muetre al presionae
        return true;
    }

    // metodo para ir a las opciones
    //nombre obligatorio
    public boolean onOptionsItemSelected(MenuItem item){
        //crear variable ra obtener el item que se seleciono
        int id = item.getItemId();
        //condicional para asber que item se selecciono
        if(id == R.id.item1){
            Toast.makeText(this, "Opcion1", Toast.LENGTH_LONG).show();
        }else if(id == R.id.item2){
            Toast.makeText(this, "Opcion2", Toast.LENGTH_LONG).show();
        }else if(id == R.id.item3){
            Toast.makeText(this, "Opcion3", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);

    }
    //ocultar action bar
    public void ocultar (View view){
        getSupportActionBar().hide();
    }
    //mostrar action bar
    public void mostrar (View view){
        getSupportActionBar().show();
    }

}