/**
 * ---------------------------------
 * Author: Yuri Serediuk Lemos
 * Date: 12-10-2019
 * App: Meu Netflix
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

package com.yurilemos.meunetflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/** PT-PT
 * Programa Meu Netflix
 * Este programa foi feito exclusivamente para treino de layout(Ex. guidelines, screen orientation, imagesViews, seek bar, buttons)
 * O objetivo foi desenvolver um ambiente quase igual ao da plataforma Netflix, para treino de desenvolvimento em front-End.
 * */

/** EN-EN
 * Program Meu Netflix
 * This program was created exclusively to train the layout functionality(Ex. guidelines, screen orientation, imagesViews, seek bar, buttons)
 * The goal was to develop a environment similar to the Netflix platform to train the front-End development.
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
}