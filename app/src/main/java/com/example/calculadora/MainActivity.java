package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvR,tvC;
    Button btZero, btUm, btDois, btTres, btQuatro, btCinco, btSeis, btSete, btOito, btNove;
    Button btSoma, btSubtracao, btMulti, btDivisao, btLimpar, btVirgula, btIgual;
    String acumulador=" ", acumulador2=" ";
    double numero=0;

    boolean cheque=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC = findViewById(R.id.tvC);
        tvR = findViewById(R.id.tvR);

        btZero = (Button) findViewById(R.id.btZero);
        btUm = (Button) findViewById(R.id.btUm);
        btDois = (Button) findViewById(R.id.btDois);
        btTres = (Button) findViewById(R.id.btTres);
        btQuatro = (Button) findViewById(R.id.btQuatro);
        btCinco = (Button) findViewById(R.id.btCinco);
        btSeis = (Button) findViewById(R.id.btSeis);
        btSete = (Button) findViewById(R.id.btSete);
        btOito = (Button) findViewById(R.id.btOito);
        btNove = (Button) findViewById(R.id.btNove);
        btSoma = (Button) findViewById(R.id.btSoma);
        btSubtracao = (Button) findViewById(R.id.btSubracao);
        btMulti = (Button) findViewById(R.id.btMulti);
        btDivisao = (Button) findViewById(R.id.btDivisao);
        btLimpar = (Button) findViewById(R.id.btLimpar);
        btVirgula = (Button) findViewById(R.id.btVirgula);
        btIgual = (Button) findViewById(R.id.btIgual);

        btZero.setOnClickListener(this);
        btUm.setOnClickListener(this);
        btDois.setOnClickListener(this);
        btTres.setOnClickListener(this);
        btQuatro.setOnClickListener(this);
        btCinco.setOnClickListener(this);
        btSeis.setOnClickListener(this);
        btSete.setOnClickListener(this);
        btOito.setOnClickListener(this);
        btNove.setOnClickListener(this);
        btVirgula.setOnClickListener(this);
        btIgual.setOnClickListener(this);
        btLimpar.setOnClickListener(this);
        btSoma.setOnClickListener(this);
        btSubtracao.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivisao.setOnClickListener(this);

    }

    void escreve(){
        tvC.setText(acumulador);
    }
    void adiciona(int num){
        if (cheque == true){
            acumulador2 = String.valueOf(num);
        }else if(acumulador == "0"){
            acumulador= String.valueOf(num);

        } else {
            acumulador+=num;
        }
    }

    Boolean verifica(){
        if (acumulador.contains("+") || acumulador.contains("-") || acumulador.contains("X") || acumulador.contains("/")){
            cheque=true;
        }
        return cheque;
    }

    @Override
    public void onClick(View view) {
        String txt="";
        switch (view.getId()){
            case R.id.btZero:
                adiciona(0);
                escreve();
                break;
            case R.id.btUm:
                adiciona(1);
                escreve();
                break;
            case R.id.btDois:
                adiciona(2);
                escreve();
                break;
            case R.id.btTres:
                adiciona(3);
                escreve();
                break;
            case R.id.btQuatro:
                adiciona(4);
                escreve();
                break;
            case R.id.btCinco:
                adiciona(5);
                escreve();
                break;
            case R.id.btSeis:
                adiciona(6);
                escreve();
                break;
            case R.id.btSete:
                adiciona(7);
                escreve();
                break;
            case R.id.btOito:
                adiciona(8);
                escreve();
                break;
            case R.id.btNove:
                adiciona(9);
                escreve();
                break;
            case R.id.btVirgula:
                acumulador+=",";
                escreve();
                break;
            case R.id.btLimpar:
                acumulador="0";
                acumulador2="0";
                numero=0;
                tvR.setText(" ");
                cheque = false;
                escreve();
                break;
            case R.id.btIgual:
                    numero = numero + Double.parseDouble(acumulador2);
                    tvR.setText(String.valueOf(numero));
                break;
            case R.id.btSoma:
                if (verifica() == false){
                    numero = Double.parseDouble(acumulador);
                    acumulador+=" + ";
                    escreve();
                }
                break;
            case R.id.btSubracao:
                if (verifica() == false){
                    numero = Double.parseDouble(acumulador);
                    acumulador+=" - ";
                    escreve();
                }
                break;
            case R.id.btDivisao:
                if (verifica() == false){
                    numero = Double.parseDouble(acumulador);
                    acumulador+=" / ";
                    escreve();
                }
                break;
            case R.id.btMulti:
                if (verifica() == false){
                    numero = Double.parseDouble(acumulador);
                    acumulador+=" * ";
                    escreve();
                }
                break;
        }
    }
}