package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SetimaActivity extends SextaActivity {

    RadioGroup rgCuba;
    RadioButton rdbGrecia, rdbJamaica, rdbGuatemala, rdbCuba;
    Button btnResponderSeis, btnAvancarSeis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setima);

        rgCuba = (RadioGroup) findViewById(R.id.rgCuba);
        rdbGrecia = (RadioButton) findViewById(R.id.rdbGrecia);
        rdbJamaica = (RadioButton) findViewById(R.id.rdbJamaica);
        rdbGuatemala = (RadioButton) findViewById(R.id.rdbGuatemala);
        rdbCuba = (RadioButton) findViewById(R.id.rdbCuba);
        btnResponderSeis = (Button) findViewById(R.id.btnResponderSeis);
        btnAvancarSeis = (Button) findViewById(R.id.btnAvancarSeis);

        btnAvancarSeis.setEnabled(false);
        btnResponderSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgchina = rgCuba.getCheckedRadioButtonId();

                if(rdbCuba.isChecked()){
                    btnAvancarSeis.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbJamaica.isChecked()){
                    btnAvancarSeis.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbGuatemala.isChecked()){
                    btnAvancarSeis.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbGrecia.isChecked()){
                    btnAvancarSeis.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }
    //===========CHAMANDO A OITAVA TELA============
    public void startOitavaActivity(View view) {

        btnAvancarSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oitavaActivity = new Intent(SetimaActivity.this, OitavaActivity.class);
                startActivity(oitavaActivity);
            }
        });

    }

}
