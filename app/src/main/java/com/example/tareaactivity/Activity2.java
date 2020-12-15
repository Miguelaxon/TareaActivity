package com.example.tareaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private String etiqueta = Activity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button boton2 = findViewById(R.id.button2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity2.this, "Botón Presionado 2",
                        Toast.LENGTH_SHORT).show();
                onIntents2();
            }
        });
    }

    public void onIntents2(){
        Intent cambio = new Intent(this, MainActivity.class);
        startActivity(cambio);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "APP Iniciado 2", Toast.LENGTH_SHORT).show();
        Log.d(etiqueta,"onStart2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(etiqueta,"onPause2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "APP Detenido 2", Toast.LENGTH_SHORT).show();
        Log.d(etiqueta,"onStop2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "APP Reiniciado 2", Toast.LENGTH_SHORT).show();
        Log.d(etiqueta,"onRestart2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "APP Cerrado 2", Toast.LENGTH_SHORT).show();
        Log.d(etiqueta,"onDestroy2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(etiqueta,"onResume2");
    }
}