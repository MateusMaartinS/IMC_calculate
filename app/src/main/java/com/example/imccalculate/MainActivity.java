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

        btHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculoIMC();
                opHomem();
            }
        });

    }
    public double CalculoIMC(){
        Double altura = 2 * Double.parseDouble(edAltura.getText().toString());
        Double peso = Double.parseDouble(edPeso.getText().toString());
        Double resultado = altura/peso;

        return resultado;

    }

    private void opHomem(){
        double imc = CalculoIMC();
        String resul;
        if(imc > 31.1) {
            resul = txResultado.getText().toString();
            txResultado.setText("Você está abaixo do peso");
        } else if (imc > 27.8 && imc < 31.1) {
            txResultado.setText("Você está no peso normal");
        } else if (imc > 26.4 && imc < 27.8 ){
            txResultado.setText("Você está um pouco acima do peso");
        } else if (imc > 20.7 && imc < 26.4){
            txResultado.setText("Você está acima do peso");
        } if (imc > 20.7){
            txResultado.setText("Você está obeso");
        }

    }

    private void opMulher(){

    }

    private void Limpar(){
        String limpar = txResultado.getText().toString();
        txResultado.setText(" ");
    }


}