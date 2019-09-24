package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DecimaPriActivity extends DecimaActivity {

    RadioGroup rgEua;
    RadioButton rdbEua, rdbCuba, rdbRussia, rdbCoreia;
    Button btnResponderDez, btnAvancarDez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decima_pri);

        rgEua = (RadioGroup) findViewById(R.id.rgEua);
        rdbEua = (RadioButton) findViewById(R.id.rdbEua);
        rdbCuba = (RadioButton) findViewById(R.id.rdbCuba);
        rdbRussia = (RadioButton) findViewById(R.id.rdbRussia);
        rdbCoreia = (RadioButton) findViewById(R.id.rdbCoreia);
        btnResponderDez = (Button) findViewById(R.id.btnResponderDez);
        btnAvancarDez = (Button) findViewById(R.id.btnAvancarDez);

        btnAvancarDez.setEnabled(false);
        btnResponderDez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgeua = rgEua.getCheckedRadioButtonId();

                if(rdbEua.isChecked()){
                    btnAvancarDez.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbCuba.isChecked()){
                    btnAvancarDez.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbRussia.isChecked()){
                    btnAvancarDez.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbCoreia.isChecked()){
                    btnAvancarDez.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    //===============CHAMANDO A TELA DE RANKING================
    public void startRankingActivity(View view) {

        btnAvancarDez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rankingActivity = new Intent(DecimaPriActivity.this, RankingActivity.class);
                startActivity(rankingActivity);
            }
        });


    }

}
