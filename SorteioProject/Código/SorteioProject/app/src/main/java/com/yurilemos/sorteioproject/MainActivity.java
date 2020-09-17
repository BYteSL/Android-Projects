package com.yurilemos.sorteioproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
/**
 * Programa de sorteio de números
 * Este programa foi feito para treino de layout, parsing com XML, criação de métodos e manuseamento de alguns componentes do sistema android(Ex.keyboard)
 * */
public class MainActivity extends AppCompatActivity {

    /**
     * Método principal para arranque do programa
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //region Método Sortear
    /** Método Sortear
     *
     * É invocado quando o botão Sortear é pressionado
     * Este método gera um número aleatório, pega o número que o utilizador inseriu e verifica se são iguais.
     * Envia uma mensagem na tela caso os números sejam ou não iguais
     *
     * */
    public void Sortear(View view){
        ConstraintLayout myCLayout = (ConstraintLayout) findViewById(R.id.myLayout);
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);

        int num = new Random().nextInt(11);
        // Define range
        TextView txt = (TextView) findViewById(R.id.txtNumSorteado);
        EditText numberSelected = (EditText) findViewById(R.id.edTxtNumberField);
        int nSelected = Integer.parseInt(numberSelected.getText().toString());
        //Toast.makeText(this, ""+nSelected, Toast.LENGTH_LONG).show();
        if(nSelected >= 0 && nSelected < 11){
            imm.hideSoftInputFromWindow(myCLayout.getWindowToken(), 0);

            txt.setText(""+num);

            if(nSelected == num){
                Toast.makeText(this, "Parabéns!!! Você ganhou!!!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "Não foi desta vez....", Toast.LENGTH_LONG).show();
            }
        }else{
            imm.hideSoftInputFromWindow(myCLayout.getWindowToken(), 0);
            Toast.makeText(this, "Digite um número entre 0 a 10", Toast.LENGTH_LONG).show();
        }



    }

    //endregion
}