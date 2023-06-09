package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvR,tvC;
    Button btZero, btUm, btDois, btTres, btQuatro, btCinco, btSeis, btSete, btOito, btNove;
    Button btSoma, btSubtracao, btMulti, btDivisao, btLimpar, btPonto, btIgual;
    String acumulador=" ", acumulador2="", calculo="";
    double numero=0;

    boolean cheque=false;

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(MainActivity.this, R.raw.som);

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
        btPonto = (Button) findViewById(R.id.btPonto);
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
        btPonto.setOnClickListener(this);
        btIgual.setOnClickListener(this);
        btLimpar.setOnClickListener(this);
        btSoma.setOnClickListener(this);
        btSubtracao.setOnClickListener(this);
        btMulti.setOnClickListener(this);
        btDivisao.setOnClickListener(this);

    }

    void escreve(){
        tvC.setText(acumulador+acumulador2);
    }
    void adiciona(int num){
        if (cheque == true){
            acumulador2 += String.valueOf(num);
            tvC.setText(acumulador+calculo+num);
        }else if(acumulador == "0"){
            acumulador= String.valueOf(num);
        } else {
            acumulador+=num;
        }
    }

    void continuarCalculo(){
        if(acumulador2!=""){
            calcular();
            acumulador2=" ";
            escreve();
        }
    }


    void calcular() {
        switch (calculo) {
            case "+":
                acumulador = "" + (numero + Double.parseDouble(acumulador2));
                break;
            case "-":
                acumulador = "" + (numero - Double.parseDouble(acumulador2));
                break;
            case "X":
                acumulador = "" + (numero * Double.parseDouble(acumulador2));
                break;
            case "/":
                acumulador = "" + (numero / Double.parseDouble(acumulador2));
                break;
        }
    }

    @Override
    public void onClick(View view) {
        mp.start();
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
            case R.id.btPonto:
                if(numero!=0){
                    acumulador2+=".";
                }else {
                    acumulador += ".";
                }
                escreve();
                break;
            case R.id.btLimpar:
                acumulador="0";
                acumulador2="";
                numero=0;
                tvR.setText(" ");
                cheque = false;
                escreve();
                break;
            case R.id.btIgual:
                cheque=false;
                calcular();
                tvR.setText(acumulador);
                acumulador2="";
                break;

            case R.id.btSoma:
                continuarCalculo();

                numero = Double.parseDouble(acumulador);
                cheque=true;
                acumulador+=" + ";
                calculo="+";
                escreve();

                break;
            case R.id.btSubracao:
                continuarCalculo();

                numero = Double.parseDouble(acumulador);
                cheque=true;
                acumulador+=" - ";
                calculo="-";
                escreve();
                break;
            case R.id.btDivisao:
                continuarCalculo();

                numero = Double.parseDouble(acumulador);
                cheque=true;
                acumulador+=" / ";
                calculo="/";
                escreve();
                break;
            case R.id.btMulti:
                continuarCalculo();

                numero = Double.parseDouble(acumulador);
                cheque=true;
                acumulador+=" X ";
                calculo="X";
                escreve();
                break;
        }
    }
}