package com.e.sesion03_ejemplo_checkbox_radiobutton;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText cajaPrimerNumero, cajaSegundoNumero, cajaResultado;
    RadioButton radioSumar, radioRestar, radioMultiplicar, radioDividir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaPrimerNumero = findViewById(R.id.caja_primer_numero);
        //...
        radioSumar = findViewById(R.id.radio_sumar);
        //...
    }


    public void procesar(View v){

        if (radioSumar.isChecked()) {
            Toast.makeText(getApplicationContext(), "Has elegido SUMAR",
                    Toast.LENGTH_LONG).show();

            Log.e("MSJ-->", "SUMAR");
        }
    }



    //metodo enlazado a los tres checkboxes
    public void eventoCheckBoxes(View v){

        boolean checked = ((CheckBox)v).isChecked();

        switch (v.getId()){
            case R.id.chk_redondear: Log.w("MSJ-->", "Redondear");
                                     break;
            case R.id.chk_negrita: Log.w("MSJ-->", "Negrita");
                                    if(checked)
                                        cajaPrimerNumero.setTypeface(null, Typeface.BOLD);
                                    else
                                        cajaPrimerNumero.setTypeface(null, Typeface.NORMAL);

                break;
            case R.id.chk_cursiva: Log.w("MSJ-->", "Cursiva");
                                    break;
        }

    }



}//class









