package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RankingActivity extends DecimaPriActivity {

    TextView txtRankingNome, txtPontos;
    Button btnRespNova, btnTelaPrincipal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        txtRankingNome = (EditText) findViewById(R.id.txtRankingNome);
        txtPontos = (EditText) findViewById(R.id.txtPontos);
        btnRespNova = (Button) findViewById(R.id.btnRespNova);
        btnTelaPrincipal = (Button) findViewById(R.id.btnTelaPrincipal);


    }


    //=============CHAMANDO A TELA PRINCIPAL============
    public void startMainActivity(View view) {

        btnTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(RankingActivity.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }

    //========CHAMANDO A SEGUNDA TELA PARA COMEÇAR NOVAMENTE=========
    public void startSegundaActivity(View view) {

        btnRespNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent segundaActivity = new Intent(RankingActivity.this, SegundaActivity.class);
                startActivity(segundaActivity);
            }
        });
    }




}
