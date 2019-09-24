package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SextaActivity extends QuintaActivity {

    RadioGroup rgCoreia;
    RadioButton rdbCoreia, rdbChina, rdbGuatemala, rdbHungria;
    Button btnResponderCinco, btnAvancarCinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sexta);

        rgCoreia = (RadioGroup) findViewById(R.id.rgCoreia);
        rdbChina = (RadioButton) findViewById(R.id.rdbChina);
        rdbCoreia = (RadioButton) findViewById(R.id.rdbCoreia);
        rdbGuatemala = (RadioButton) findViewById(R.id.rdbGuatemala);
        rdbHungria= (RadioButton) findViewById(R.id.rdbHungria);
        btnResponderCinco = (Button) findViewById(R.id.btnResponderCinco);
        btnAvancarCinco = (Button) findViewById(R.id.btnAvancarCinco);

        btnAvancarCinco.setEnabled(false);
        btnResponderCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgchina = rgCoreia.getCheckedRadioButtonId();

                if(rdbCoreia.isChecked()){
                    btnAvancarCinco.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbChina.isChecked()){
                    btnAvancarCinco.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbGuatemala.isChecked()){
                    btnAvancarCinco.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbHungria.isChecked()){
                    btnAvancarCinco.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    //===========CHAMANDO A SETIMA TELA============
    public void startSetimaActivity(View view) {

        btnAvancarCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setimaActivity = new Intent(SextaActivity.this, SetimaActivity.class);
                startActivity(setimaActivity);
            }
        });

    }

}
