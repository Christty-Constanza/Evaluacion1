package com.example.evaluacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText Peso, Estatura, IMC;
    Button btnCalcular;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Peso = findViewById(R.id.txtPeso);
        Estatura = findViewById(R.id.txtEstatura);
        IMC = findViewById(R.id.txtImc);
        btnCalcular = findViewById(R.id.btnCalcular);
        spinner = findViewById(R.id.spinner);
    }
}