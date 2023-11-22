package com.atenea.viewmodeltwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.database.Observable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.atenea.viewmodeltwo.Persistencia.MyViewModel;

public class SumaPersistente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_persistente);

        ViewConfiguration();

    }
    private void ViewConfiguration()
    {
        MyViewModel viewModel = new ViewModelProvider(this).get(MyViewModel.class);
        TextView contadorTextView;
        Button sumaButton;
        contadorTextView = findViewById(R.id.ContadorTextViewPersistente);
        sumaButton = findViewById(R.id.SumaButtonPersistente);

        sumaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.aumentar(Integer.parseInt(contadorTextView.getText().toString()));
            }
        });

        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                contadorTextView.setText(integer.toString());
            }
        };

        viewModel.getResultado().observe(this,observer);

    }
}