package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NonaActivity extends OitavaActivity {

    RadioGroup rgHungria;
    RadioButton rdbMexico, rdbGuatemala, rdbHungria, rdbItalia;
    Button btnResponderOito, btnAvancarOito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nona);

        rgHungria = (RadioGroup) findViewById(R.id.rgHungria);
        rdbMexico = (RadioButton) findViewById(R.id.rdbMexico);
        rdbGuatemala = (RadioButton) findViewById(R.id.rdbGuatemala);
        rdbHungria = (RadioButton) findViewById(R.id.rdbHungria);
        rdbItalia = (RadioButton) findViewById(R.id.rdbItalia);
        btnAvancarOito = (Button) findViewById(R.id.btnAvancarOito);
        btnResponderOito =  (Button) findViewById(R.id.btnResponderOito);

        btnAvancarOito.setEnabled(false);
        btnResponderOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rghungria = rgHungria.getCheckedRadioButtonId();

                if(rdbHungria.isChecked()){
                    btnAvancarOito.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbGrecia.isChecked()){
                    btnAvancarOito.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbGuatemala.isChecked()){
                    btnAvancarOito.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbItalia.isChecked()){
                    btnAvancarOito.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    //==========Chamando A DECIMA TELA=============
    public void startDecimaActivity(View view) {

        btnAvancarOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent decimaActivity = new Intent(NonaActivity.this, DecimaActivity.class);
                startActivity(decimaActivity);
            }
        });

    }



}
