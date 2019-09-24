package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuintaActivity extends QuartaActivity {

    RadioGroup rgChina;
    RadioButton rdbChina, rdbCoreia, rdbCuba, rdbItalia;
    Button btnResponderQuatro, btnAvancarQuatro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinta);

        rgChina = (RadioGroup) findViewById(R.id.rgChina);
        rdbChina = (RadioButton) findViewById(R.id.rdbChina);
        rdbCoreia = (RadioButton) findViewById(R.id.rdbCoreia);
        rdbCuba = (RadioButton) findViewById(R.id.rdbCuba);
        rdbItalia = (RadioButton) findViewById(R.id.rdbItalia);
        btnResponderQuatro = (Button) findViewById(R.id.btnResponderQuatro);
        btnAvancarQuatro = (Button) findViewById(R.id.btnAvancarQuatro);


        btnAvancarQuatro.setEnabled(false);
        btnResponderQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rgchina = rgChina.getCheckedRadioButtonId();

                if(rdbChina.isChecked()){
                    btnAvancarQuatro.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Acertou!!!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbCoreia.isChecked()){
                    btnAvancarQuatro.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbCuba.isChecked()){
                    btnAvancarQuatro.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }
                else if(rdbItalia.isChecked()){
                    btnAvancarQuatro.setEnabled(true);
                    Toast.makeText(getApplicationContext(), "Errou!", Toast.LENGTH_SHORT).show();
                }

            }

        });


    }

    //==========CHAMANDO A SEXTA TELA==============
    public void startSextaActivity(View view) {

        btnAvancarQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sextaActivity = new Intent(QuintaActivity.this, SextaActivity.class);
                startActivity(sextaActivity);



            }
        });

    }


}
