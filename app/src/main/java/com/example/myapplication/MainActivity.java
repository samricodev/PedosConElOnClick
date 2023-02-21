package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText reg, nom, ap, dir;
    private TextView res;
    private Alumno alumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        alumno = new Alumno();

        reg = (EditText) findViewById(R.id.txtRegistro);
        nom = (EditText) findViewById(R.id.txtNombre);
        ap = (EditText) findViewById(R.id.txtApellidos);
        dir = (EditText) findViewById(R.id.txtDireccion);
        res = (TextView) findViewById(R.id.txtResultados);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegistrar = findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    int r = Integer.parseInt(reg.getText().toString());
                    alumno.setRegistro(r);
                    String n = nom.getText().toString();
                    alumno.setNombre(n);
                    String a = ap.getText().toString();
                    alumno.setApellidos(a);
                    String d = dir.getText().toString();
                    alumno.setDireccion(d);
            }
        });

        Button btnConsultar = findViewById(R.id.btnConsultar);
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r = String.valueOf(alumno.getRegistro());
                r += "\n";
                r += alumno.getNombre() + "\n";
                r += alumno.getApellidos() + "\n";
                r += alumno.getDireccion() + "\n";

                res.setText(r);
            }
        });
    }
}