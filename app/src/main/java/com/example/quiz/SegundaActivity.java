package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.InterruptedIOException;

public class SegundaActivity extends MainActivity {
    RadioGroup rgBrasil;
    RadioButton rdbBrasil, rdbEua, rdbCuba, rdbCanada;
    Button btnResponderUm, btnAvancarUm;

    String nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        rgBrasil = (RadioGroup) findViewById(R.id.rgBrasil);
        rdbBrasil = (RadioButton) findViewById(R.id.rdbBrasil);
        rdbEua = (RadioButton) findViewById(R.id.rdbEua);
        rdbCuba = (RadioButton) findViewById(R.id.rdbCuba);
        rdbCanada = (RadioButton) findViewById(R.id.rdbCanada);
        btnResponderUm = (Button) findViewById(R.id.btnResponderUm);
        btnAvancarUm = (Button) findViewById(R.id.btnAvancarUm);

        btnAvancarUm.setEnabled(false);
        btnResponderUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgbrasil = rgBrasil.getCheckedRadioButtonId();

                if(rdbBrasil.isChecked()){
                    btnAvancarUm.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbEua.isChecked()){
                    btnAvancarUm.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbCuba.isChecked()){
                    btnAvancarUm.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbCanada.isChecked()){
                    btnAvancarUm.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });



    }

    //==========CHAMANDO A 3 TELA PELO BTN RESPONDER==============
    public void startTerceiraActivity(View view) {
        btnAvancarUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent terceiraActivity = new Intent(SegundaActivity.this, TerceiraActivity.class);
                startActivity(terceiraActivity);
            }
        });

    }
    //============================================================

}