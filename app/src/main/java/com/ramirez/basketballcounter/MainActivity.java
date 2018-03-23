package com.ramirez.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int puntosA;
    private int puntosB;
    private TextView textA;
    private TextView textB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puntosA = puntosB = 0;
        textA = findViewById(R.id.cont1);
        textB = findViewById(R.id.cont2);
    }
    public void masUno(View v){
        switch (v.getId()){
            case R.id.teamA1:
                puntosA++;
                textA.setText(puntosA+"");
                break;
            case R.id.teamB1:
                puntosB++;
                textB.setText(puntosB+"");
                break;
        }
    }
    public void masDos(View v){
        switch (v.getId()){
            case R.id.teamA2:
                puntosA=puntosA+2;
                textA.setText(puntosA+"");
                break;
            case R.id.teamB2:
                puntosB=puntosB+2;
                textB.setText(puntosB+"");
                break;
        }
    }
    public void masTres(View v){
        switch (v.getId()){
            case R.id.teamA3:
                puntosA=puntosA+3;
                textA.setText(puntosA+"");
                break;
            case R.id.teamB3:
                puntosB=puntosB+3;
                textB.setText(puntosB+"");
                break;
        }
    }
    public void reset(View v){
        switch (v.getId()){
            case R.id.reset:
                puntosA=puntosB=0;
                textA.setText(puntosA+"");
                textB.setText(puntosB+"");
                break;

        }
    }
}
