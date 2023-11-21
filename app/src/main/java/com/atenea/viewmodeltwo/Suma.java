package com.atenea.viewmodeltwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Suma extends AppCompatActivity {
    private TextView contadorTextView;
    private Button sumaButton;
    private int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        contadorTextView = findViewById(R.id.ContadorTextView);
        sumaButton = findViewById(R.id.SumaButton);


        contadorTextView.setText(String.valueOf(contador));
        sumaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador += 1;
                contadorTextView.setText(String.valueOf(contador));
            }
        });

    }
}