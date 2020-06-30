package com.example.prueba1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class crud extends AppCompatActivity {

    private List<DatosUsuraio> listarpersona = new ArrayList<>();
    ArrayAdapter<DatosUsuraio> arrayAdapterDatosUsuario;


    EditText videojuego,edad,plataforma,edadcomienzo;

    ListView lista;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    DatosUsuraio gamer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);

        videojuego = (EditText) findViewById(R.id.juego);
        edad = (EditText)findViewById(R.id.edad);
        plataforma = (EditText)findViewById(R.id.plataforma);
        edadcomienzo = (EditText)findViewById(R.id.edadinicio);

        lista = (ListView)findViewById(R.id.lista);

        inicializarFirebase();

        listardatos();

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                gamer = (DatosUsuraio) adapterView.getItemAtPosition(position);
                videojuego.setText(gamer.getVideojuego());
                edad.setText(gamer.getEdad());
                plataforma.setText(gamer.getPlataforma());
                edadcomienzo.setText(gamer.getEdadinicio());
            }
        });



    }

    private void listardatos() {

        reference.child("gamer").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                listarpersona.clear();
                for (DataSnapshot objSnaptshot : snapshot.getChildren()){
                    DatosUsuraio p = objSnaptshot.getValue(DatosUsuraio.class);
                    listarpersona.add(p);

                    arrayAdapterDatosUsuario = new ArrayAdapter<DatosUsuraio>(crud.this, android.R.layout.simple_list_item_1, listarpersona);
                    lista.setAdapter(arrayAdapterDatosUsuario);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    private void inicializarFirebase() {

        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        reference = firebaseDatabase.getReference();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucrud ,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        String game = videojuego.getText().toString();
        String age = edad.getText().toString();
        String plat = plataforma.getText().toString();
        String agestart = edadcomienzo.getText().toString();


        switch (item.getItemId()){
            case R.id.icon_add:{
                if(game.equals("") || age.equals("") || plat.equals("") || agestart.equals("")){
                    validacion();
                }else{


                    DatosUsuraio p = new DatosUsuraio();
                    p.setId(UUID.randomUUID().toString());
                    p.setVideojuego(game);
                    p.setEdad(age);
                    p.setPlataforma(plat);
                    p.setEdadinicio(agestart);
                    reference.child("gamer").child(p.getId()).setValue(p);

                    Toast.makeText(this,"DATOS agregados", Toast.LENGTH_LONG).show();
                    limpiarCAJA();

                }

                break;
            }
            case R.id.icon_save:{

                DatosUsuraio p = new DatosUsuraio();
                p.setId(UUID.randomUUID().toString());
                p.setVideojuego(game);
                p.setEdad(age);
                p.setPlataforma(plat);
                p.setEdadinicio(agestart);
                reference.child("gamer").child(p.getId()).setValue(p);

                Toast.makeText(this,"Guardar", Toast.LENGTH_LONG).show();
                Toast.makeText(this,"Actualizado", Toast.LENGTH_LONG).show();
                limpiarCAJA();
                break;
            }
            case R.id.icon_delete:{

                DatosUsuraio p = new DatosUsuraio();
                p.setId(gamer.getId());
                reference.child("Persona").child(p.getId()).removeValue();

                Toast.makeText(this,"Eliminar", Toast.LENGTH_LONG).show();
                Toast.makeText(this,"Eliminado", Toast.LENGTH_LONG).show();
                break;
            }
            default:break;
        }
        return true;
    }


    private void limpiarCAJA() {

        videojuego.setText("");
        edad.setText("");
        plataforma.setText("");
        edadcomienzo.setText("");


    }

    public void validacion(){

        String game = videojuego.getText().toString();
        String age = edad.getText().toString();
        String plat = plataforma.getText().toString();
        String agestart = edadcomienzo.getText().toString();

        if(game.equals("")){
            videojuego.setError("Required");
        }
        if(age.equals("")){
            edad.setError("Required");
        }
        if(plat.equals("")){
            plataforma.setError("Required");
        }
        if(agestart.equals("")){
            edadcomienzo.setError("Required");
        }

    }

}