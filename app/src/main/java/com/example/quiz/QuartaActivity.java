package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuartaActivity extends AppCompatActivity {

    RadioGroup rgCanada;
    RadioButton rdbCanada, rdbChina, rdbCoreia, rdbEua;
    Button btnResponderTres, btnAvancarTres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        rgCanada = (RadioGroup) findViewById(R.id.rgCanada);
        rdbCanada = (RadioButton) findViewById(R.id.rdbCanada);
        rdbChina = (RadioButton) findViewById(R.id.rdbChina);
        rdbCoreia = (RadioButton) findViewById(R.id.rdbCoreia);
        rdbEua = (RadioButton) findViewById(R.id.rdbEua);
        btnResponderTres = (Button) findViewById(R.id.btnResponderTres);
        btnAvancarTres = (Button) findViewById(R.id.btnAvancarTres);


        btnAvancarTres.setEnabled(false);
        btnResponderTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgbrasil = rgCanada.getCheckedRadioButtonId();

                if(rdbCanada.isChecked()){
                    btnAvancarTres.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbChina.isChecked()){
                    btnAvancarTres.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbEua.isChecked()){
                    btnAvancarTres.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbCoreia.isChecked()){
                    btnAvancarTres.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });



    }

    //================CHAMANDO A QUINTA TELA==================
    public void startQuintaActivity(View view) {

        btnAvancarTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quintaActivity = new Intent(QuartaActivity.this, QuintaActivity.class);
                startActivity(quintaActivity);
            }
        });

    }



}
