package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OitavaActivity extends SetimaActivity {

    RadioGroup rgGuatemala;
    RadioButton rdbGrecia, rdbHungria, rdbGuatemala, rdbEua;
    Button btnResponderSete, btnAvancarSete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oitava);

        rgGuatemala = (RadioGroup) findViewById(R.id.rgGuatemala);
        rdbGrecia = (RadioButton) findViewById(R.id.rdbGrecia);
        rdbHungria = (RadioButton) findViewById(R.id.rdbHungria);
        rdbGuatemala = (RadioButton) findViewById(R.id.rdbGuatemala);
        rdbEua = (RadioButton) findViewById(R.id.rdbEua);
        btnResponderSete = (Button) findViewById(R.id.btnResponderSete);
        btnAvancarSete = (Button) findViewById(R.id.btnAvancarSete);

        btnAvancarSete.setEnabled(false);
        btnResponderSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgguatemala = rgGuatemala.getCheckedRadioButtonId();

                if(rdbGuatemala.isChecked()){
                    btnAvancarSete.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbGrecia.isChecked()){
                    btnAvancarSete.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbHungria.isChecked()){
                    btnAvancarSete.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbEua.isChecked()){
                    btnAvancarSete.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });

    }

    //===CHAMANDO A NONA TELA====
    public void startNonaActivity(View view) {

        btnAvancarSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nonaActivity = new Intent(OitavaActivity.this, NonaActivity.class);
                startActivity(nonaActivity);
            }
        });

    }


}
