package com.example.imccalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edAltura;
    private EditText edPeso;
    private Button btHomem;
    private Button btMulher;
    private TextView txResultado;
    private Button btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edAltura = findViewById(R.id.edAltura);
        edPeso = findViewById(R.id.edPeso);
        btHomem = findViewById(R.id.btHomem);
        btMulher = findViewById(R.id.btMulher);
        txResultado = findViewById(R.id.txResultado);
        btLimpar = findViewById(R.id.btLimpar);






        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpar();
            }
        });

    }
    private void Limpar(){
        String limpar = " ".getText().toString();
        txResultado.setText(limpar);
    }
}