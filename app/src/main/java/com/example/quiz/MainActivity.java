package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // VARIAVEIS
    EditText txtNome;
    Button btnIniciar, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //=====Inicializando as variaveis aos campos do layout======
        txtNome = (EditText) findViewById(R.id.txtNome);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        btnSair = (Button) findViewById(R.id.btnSair);

        //======METODO PARA A AÇÃO DO CAMPO TEXTNOME=====
        btnIniciar.setEnabled(false);//Iniciando o btn desativado
        txtNome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String nome = txtNome.getText().toString();
                if (nome.length() > 0) {
                    btnIniciar.setEnabled(true);
                } else if (nome.length() < 1) {
                    btnIniciar.setEnabled(false);
                    Toast.makeText(getBaseContext(), "Preencha o campo", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) { }
        });
        //=======BTN SAIR==========
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });


    }
    //CHAMANDO A SEGUNDA ACTIVITY
    public void startSegundaActivity(View view) {

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent segundaActivity = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(segundaActivity);
            }
        });

    }

}



