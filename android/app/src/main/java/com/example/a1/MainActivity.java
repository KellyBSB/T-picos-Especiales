package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView textView1;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText)findViewById(R.id.editTextTextPersonName);
        editText2 = (EditText)findViewById(R.id.editTextTextPersonName2);
        textView1= (TextView)findViewById(R.id.textView);
        button1 = (Button)findViewById(R.id.btn2);


    }

    public void sumar(View view) {
        String valor1=editText1.getText().toString();
        String valor2=editText2.getText().toString();

        int m1=Integer.parseInt(valor1);
        int m2=Integer.parseInt(valor2);

        int resultado= m1+m2;
        String res=String.valueOf(resultado);
        textView1.setText(res);

    }
}