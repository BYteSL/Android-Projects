/**
 * ---------------------------------
 * Author: Yuri Serediuk Lemos
 * Date: 12-10-2019
 * App: Frases do dia
 * App Language: Portuguese
 * ---------------------------------
 * */


/**
 * --------------------------------------------------------------------------------
 * Obs: This code is a open source;
 * You'll use this code by your responsibility, not mine;
 * if the code is showing some error, check the package name and see if it's right
 * And now, finally, Enjoy!!!
 * --------------------------------------------------------------------------------
 * */

package com.yurilemos.frasedodiaprojeto;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/** PT-PT
 * Programa "Frases do dia"
 * Este programa foi feito para treino de layout, gerenciamneto de imagens, eventos, parsing do XML, métodos e fluxo de código
 * O objetivo foi desenvolver um programa que dê ao utilizador uma frase aleatória (Neste caso são imagens com frases) sempre que aperta o botão "Nova Frase".
 * */

/** EN-EN
 * Program "Frases do dia"
 * This program was created to train the layout, management of pictures, events, parsing with XML, methods and code flow.
 * The goal was to develop a program that gives to the user one random motivational phrase (In this case with images) aways when the button "Nova Frase" is clicked.
 * */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button clickme; // Variável do tipo Button para ser atribuída a view Button do ficheiro XML

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickme = (Button) findViewById(R.id.button2);
        clickme.setText("Nova Frase");
        clickme.setOnClickListener(MainActivity.this);
        GerarNovaFrase();

    }
    /**
     * Método GerarNovaFrase
     * Este método é invocado quando o botão é clicado. Ele irá gerar um número entre 0 e o número de fotos que há guardadas.
     * Depois passará dentro de um switch e dependendo do número gerado irá para uns dos cases atribuindo então a foto.
     * Para teste foram adicionadas 23 imagens.
     * */
    public void GerarNovaFrase(){

        ImageView image = findViewById(R.id.imgDia);
        int min=0;

        int numAleatorio = (int)(Math.random() * ((22 - min) + 1)) + min;
        switch (numAleatorio){
            case 0:
                image.setImageResource(R.drawable.a1);
                break;
            case 1:
                image.setImageResource(R.drawable.a2);
                break;
            case 2:
                image.setImageResource(R.drawable.a3);
                break;
            case 3:
                image.setImageResource(R.drawable.a4);
                break;
            case 4:
                image.setImageResource(R.drawable.a5);
                break;
            case 5:
                image.setImageResource(R.drawable.a6);
                break;
            case 6:
                image.setImageResource(R.drawable.a7);
                break;
            case 7:
                image.setImageResource(R.drawable.a8);
                break;
            case 8:
                image.setImageResource(R.drawable.a9);
                break;
            case 9:
                image.setImageResource(R.drawable.a10);
                break;
            case 10:
                image.setImageResource(R.drawable.a11);
                break;
            case 11:
                image.setImageResource(R.drawable.a12);
                break;
            case 12:
                image.setImageResource(R.drawable.a13);
                break;
            case 13:
                image.setImageResource(R.drawable.a14);
                break;
            case 14:
                image.setImageResource(R.drawable.a15);
                break;
            case 15:
                image.setImageResource(R.drawable.a16);
                break;
            case 16:
                image.setImageResource(R.drawable.a17);
                break;
            case 17:
                image.setImageResource(R.drawable.a18);
                break;
            case 18:
                image.setImageResource(R.drawable.a19);
                break;
            case 19:
                image.setImageResource(R.drawable.a20);
                break;
            case 20:
                image.setImageResource(R.drawable.a21);
                break;
            case 21:
                image.setImageResource(R.drawable.a22);
                break;
            case 22:
                image.setImageResource(R.drawable.a23);
                break;
        }

        //region TESTS
        /**
         * Test with Strings
         * */
        /*String[] frases = { "Levanta, sacode a poeira e dá a volta por cima",
                            "Nem todos os dias são bons, mas há algo bom em cada dia",
                            "Suba o primeiro degrau com fé. Não é necessário que você veja toda a escada. Apenas dê o primeiro passo.",
                            "Toda manhã você tem duas escolhas: Continuar dormindo com seus sonhos, ou acordar e persegui-los",
                            "A cada novo dia, a cada novo momento, temos a nossa disposição a maravilhosa possibilidade do encontro, que traz em si infinitas oportunidades. Precisamos apenas estar atentos.",
                            "O otimismo é a fé em ação. Nada se pode levar a efeito sem otimismo.",
                            "A sua irritação não solucionará problema algum. O seu mau humor não modifica a vida. Não estrague o seu dia.",
                            "Ontem já passou, é hora de planejar o futuro.",
                            "Vamos inventar o amanhã no lugar de se preocupar com o que aconteceu ontem.",
                            "As pessoas mais felizes não têm as melhores coisas. Elas sabem fazer o melhor das oportunidades que aparecem em seus caminhos.",
                            "Ninguém, além de você, está no controle de sua felicidade. Portanto, ajuste as velas e corrija e rumo.",
                            "Você é capaz de escrever a sua nova história todos os dias.",
                            "Imagine uma nova história para sua vida e acredite nela.",
                            "Você tem que acordar cada manhã com determinação se você pretende ir para a cama com satisfação.",
                            "Hoje acordei pra viver, levantar e seguir em frente. Porque a vida sempre pede um pouco mais da gente.",
                            "Cada segundo é tempo para mudar tudo para sempre.",
                            "Não importa a cor do céu, quem faz o dia lindo é você.",
                            "A beleza começa quando você decide ser você mesma.",
                            "Se quer viver uma vida feliz, amarre-se a um objetivo, não às pessoas ou aos objetos.",
                            "Se tiver que amar, ame hoje. Se tiver que sorrir, sorria hoje. Se tiver que chorar, chore hoje. Pois o importante é viver hoje. O ontem já foi e o amanhã talvez não venha.",
                            "Comece fazendo o que é necessário, depois o que é possível, e de repente você estará fazendo o impossível.",
                            "Sorria! Deus acaba de te dar uma nova chance de fazer coisas extraordinárias acontecerem.",
                            "Nossas cabeças são redondas para que o pensamento possa mudar de direção.",
                            "A vida é muito importante para ser levada a sério.",
                            "Eu sei que não se pode viver só de esperança, mas sem esperança não vale a pena viver."};*/
        //endregion
    }


    @Override
    public void onClick(View view) {
        GerarNovaFrase();
    }
}