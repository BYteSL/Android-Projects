/**
 * ---------------------------------
 * Author: Yuri Serediuk Lemos
 * Date: 20-07-2020
 * App: Fingerprint Test
 * App Language: English
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

package com.yurilemos.fingerprintteste;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


/** PT-PT
 * Programa "Fingerprint Teste"
 * Este programa foi feito exclusivamente para treino da biblioteca Biometric, para o uso de impressão digital
 * O objetivo foi desenvolver um programa que no seu início apresenta uma tela de autenticação por biometria.
 * */

/** EN-EN
 * Program "Fingerprint Teste"
 * This program was created exclusively to train the Biometric library.
 * The goal was to develop a program that in the beginning shows a authentication screen by biometric.
 * */
public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Executor executor = ContextCompat.getMainExecutor(this);

        // Check if your device firmware have fingerprint service
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {

            // Build the BiometricPrompt and Configure it
            final BiometricPrompt biometricPrompt = new BiometricPrompt.Builder(this).setTitle("Sensor").setDescription("Description").setSubtitle("Subtitle")
                    .setNegativeButton("Cancel", executor, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    }).build();

            final MainActivity activity = this;
            biometricPrompt.authenticate(new CancellationSignal(), executor, new BiometricPrompt.AuthenticationCallback() {
                @Override
                public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {

                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            MessageToasty("Success");
                        }
                    });
                }
            });
        }
    }

    public void MessageToasty(String Message){
        Toast.makeText(MainActivity.this, Message, Toast.LENGTH_LONG).show();
    }
}