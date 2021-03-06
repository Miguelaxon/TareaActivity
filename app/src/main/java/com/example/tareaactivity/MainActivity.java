package com.example.tareaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String etiqueta = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(etiqueta,"onCreate");

        Button boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Botón Presionado",
                        Toast.LENGTH_SHORT).show();
                onIntents();
            }
        });
    }

    public void onIntents(){
        Intent cambio = new Intent(this, Activity2.class);
        startActivity(cambio);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(etiqueta,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(etiqueta,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "APP Detenido", Toast.LENGTH_SHORT).show();
        Log.d(etiqueta,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "APP Reiniciado", Toast.LENGTH_SHORT).show();
        Log.d(etiqueta,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "APP Cerrado", Toast.LENGTH_SHORT).show();
        Log.d(etiqueta,"onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(etiqueta,"onResume");
    }
}