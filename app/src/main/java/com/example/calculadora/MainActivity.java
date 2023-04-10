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

        Button btZero = (Button) findViewById(R.id.btZero);
        Button btUm = (Button) findViewById(R.id.btUm);
        Button btDois = (Button) findViewById(R.id.btDois);
        Button btTres = (Button) findViewById(R.id.btTres);
        Button btQuatro = (Button) findViewById(R.id.btQuatro);
        Button btCinco = (Button) findViewById(R.id.btCinco);
        Button btSeis = (Button) findViewById(R.id.btSeis);
        Button btSete = (Button) findViewById(R.id.btSete);
        Button btOito = (Button) findViewById(R.id.btOito);
        Button btNove = (Button) findViewById(R.id.btNove);
        Button btSoma = (Button) findViewById(R.id.btSoma);
        Button btSubtracao = (Button) findViewById(R.id.btSubracao);
        Button btMulti = (Button) findViewById(R.id.btMulti);
        Button btDivisao = (Button) findViewById(R.id.btDivisao);
        Button btLimpar = (Button) findViewById(R.id.btLimpar);
        Button btVirgula = (Button) findViewById(R.id.btVirgula);
        Button btIgual = (Button) findViewById(R.id.btIgual);
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