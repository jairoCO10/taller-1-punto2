package com.jco.taller2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    
    private Button btn_aumentarTexto;
    private Button btn_cambiarColor;
    private Button btn_esconderTexto;
    private int valorTexto = 0;
    private int mostrar = 0;
    private int contador;
    public ArrayList<Integer> colores;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador =0;
        colores = new ArrayList<>();
        colores.add(Color.GRAY);
        colores.add(Color.GREEN);
        colores.add(Color.RED);
        colores.add(Color.BLUE);

        TextView tv_text = (TextView) findViewById(R.id.tv_edit);
        btn_aumentarTexto = findViewById(R.id.btn_aumentar);
        btn_aumentarTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valorTexto == 0){
                    valorTexto = 20;
                }
                if(valorTexto<40){
                    valorTexto= valorTexto +1;
                    tv_text.setTextSize(valorTexto);

                }
            }
        });

        btn_cambiarColor = findViewById(R.id.btn_cambiarcolor);
        btn_cambiarColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_text.setTextColor(colores.get(0));
                contador = contador +1;
                if (contador==colores.size()){
                    contador = 0;
                    tv_text.setTextColor(colores.get(contador));
                }else{
                    tv_text.setTextColor(colores.get(contador));
                }
            }
        });

        btn_esconderTexto = findViewById(R.id.btn_ocultar);
        btn_esconderTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tv_text.getVisibility()==View.GONE ){
                    tv_text.setVisibility(View.VISIBLE);
                }
                else {
                    tv_text.setVisibility(View.GONE);
                }

            }
        });


    }

}