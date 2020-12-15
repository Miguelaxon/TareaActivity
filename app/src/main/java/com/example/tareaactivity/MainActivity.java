package com.example.tareaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String etiqueta = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(etiqueta,"onCreate");
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