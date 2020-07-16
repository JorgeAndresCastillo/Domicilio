package com.nojoda.domicilio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.GoalRow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_entrar_inicio;
    Button btn_registro_inicio;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_registro_inicio = findViewById(R.id.btn_registro_inicio);
        btn_entrar_inicio = findViewById(R.id.btn_entrar_inicio);


        btn_registro_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToRegistro();
            }
        });
        btn_entrar_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToEntrada();
            }
        });

    }

    //metodo para cambiar de pantalla por medio del boton entrar en la activity a PROCESAR DATOS
    private void goToEntrada() {
        Intent intent = new Intent(MainActivity.this, Registro_Activity.class);
        startActivity(intent);
    }


    //metodo para cambiar de pantalla por medio del boton registar en la activity a Registro_Activity
    private void goToRegistro() {
        Intent intent = new Intent(MainActivity.this, Registro_Activity.class);
        startActivity(intent);
    }
}