package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TerceiraActivity extends SegundaActivity {

    RadioGroup rgBulgaria;
    RadioButton rdbBrasil, rdbMexico, rdbItalia, rdbBulgaria;
    Button btnResponderDois, btnAvancarDois;

    int ranking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        rgBulgaria = (RadioGroup) findViewById(R.id.rgBulgaria);
        rdbBrasil = (RadioButton) findViewById(R.id.rdbBrasil);
        rdbItalia = (RadioButton) findViewById(R.id.rdbItalia);
        rdbMexico = (RadioButton) findViewById(R.id.rdbMexico);
        rdbBulgaria = (RadioButton) findViewById(R.id.rdbBulgaria);
        btnResponderDois = (Button) findViewById(R.id.btnResponderDois);
        btnAvancarDois = (Button) findViewById(R.id.btnAvancarDois);

        //=====================================

        btnAvancarDois.setEnabled(false);
        btnResponderDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgbrasil = rgBrasil.getCheckedRadioButtonId();

                if(rdbBulgaria.isChecked()){
                    btnAvancarDois.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbBrasil.isChecked()){
                    btnAvancarDois.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbItalia.isChecked()){
                    btnAvancarDois.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbMexico.isChecked()){
                    btnAvancarDois.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    //=================CHAMANDO A QUARTA TELA==================
    public void startQuartaActivity(View view) {

        btnAvancarDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quartaActivity = new Intent(TerceiraActivity.this, QuartaActivity.class);
                startActivity(quartaActivity);
            }
        });

    }
    //=========================================================

}
