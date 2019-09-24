package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DecimaActivity extends NonaActivity {

    RadioGroup rgItalia;
    RadioButton rdbMexico, rdbHungria, rdbItalia, rdbBrasil;
    Button btnResponderNove, btnAvancarNove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decima);

        rgItalia = (RadioGroup) findViewById(R.id.rgItalia);
        rdbMexico = (RadioButton) findViewById(R.id.rdbMexico);
        rdbHungria = (RadioButton) findViewById(R.id.rdbHungria);
        rdbItalia = (RadioButton) findViewById(R.id.rdbItalia);
        rdbBrasil = (RadioButton) findViewById(R.id.rdbBrasil);
        btnResponderNove = (Button) findViewById(R.id.btnResponderNove);
        btnAvancarNove = (Button) findViewById(R.id.btnAvancarNove);

        btnAvancarNove.setEnabled(false);
        btnResponderNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgitalia = rgItalia.getCheckedRadioButtonId();

                if(rdbItalia.isChecked()){
                    btnAvancarNove.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbMexico.isChecked()){
                    btnAvancarNove.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbHungria.isChecked()){
                    btnAvancarNove.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbBrasil.isChecked()){
                    btnAvancarNove.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    //===============CHAMANDO A DECIMA PRIMEIRA TELA============
    public void startDecimaPriActivity(View view) {

        btnAvancarNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent decimaPriActivity = new Intent(DecimaActivity.this, DecimaPriActivity.class);
                startActivity(decimaPriActivity);
            }
        });

    }

}
