package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvR,tvC;
    Button btZero, btUm, btDois, btTres, btQuatro, btCinco, btSeis, btSete, btOito, btNove;
    Button btSoma, btSubtracao, btMulti, btDivisao, btLimpar, btVirgula, btIgual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btUm:
                tvR.setText("Botão1");
                break;
            case R.id.btDois:
                tvR.setText("Botão2");
                break;
            case R.id.btTres:
                tvR.setText("botao9");
                break;
            case R.id.btQuatro:
                tvR.setText("Botão1");
                break;
            case R.id.btCinco:
                tvR.setText("Botão2");
                break;
            case R.id.btSeis:
                tvR.setText("botao9");
                break;
            case R.id.btSete:
                tvR.setText("Botão1");
                break;
            case R.id.btOito:
                tvR.setText("Botão2");
                break;
            case R.id.btNove:
                tvR.setText("botao9");
                break;
        }
    }
}