package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnFindFactorialOfNumber, btnFindfactorsOfNumber, btnTables,
    btnPrimeOrComposite, btnPerfectNumber, btnSumOfDigits, btnPalindrome, btnAutomorphic,
    btnNiven, btnVowelConsonants, btnEachWordNewLine, btnPigLatin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnFindFactorialOfNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FindFactorialOfNumber.class);
                startActivity(intent);
            }


        });

        btnFindfactorsOfNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FindFactorsOfNumber.class);
                startActivity(intent);
            }
        });

        btnTables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tables.class);
                startActivity(intent);
            }
        });

        btnPrimeOrComposite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PrimeOrComposite.class);
                startActivity(intent);
            }
        });

        btnPerfectNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PerfectNumber.class);
                startActivity(intent);
            }
        });

        btnSumOfDigits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SumOfDigits.class);
                startActivity(intent);
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Palindrome.class);
                startActivity(intent);
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Automorphic.class);
                startActivity(intent);
            }
        });

        btnNiven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Niven.class);
                startActivity(intent);
            }
        });

        btnVowelConsonants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VowelConsonantsSpaces.class);
                startActivity(intent);
            }
        });

        btnEachWordNewLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EachWordNewLine.class);
                startActivity(intent);
            }
        });

        btnPigLatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PigLatin.class);
                startActivity(intent);
            }
        });














    }

    private void initViews(){
        btnFindFactorialOfNumber = findViewById(R.id.btn_Factorial);
        btnFindfactorsOfNumber = findViewById(R.id.btn_Factors);
        btnTables = findViewById(R.id.btn_Tables);
        btnPrimeOrComposite = findViewById(R.id.btn_PrimeOrComposite);
        btnPerfectNumber = findViewById(R.id.btn_PerfectNumber);
        btnSumOfDigits = findViewById(R.id.btn_SumOfDigits);
        btnPalindrome = findViewById(R.id.btn_Palindrome);
        btnAutomorphic = findViewById(R.id.btn_Automorphic);
        btnNiven = findViewById(R.id.btn_Niven);
        btnVowelConsonants = findViewById(R.id.btn_VowelConsonant);
        btnEachWordNewLine = findViewById(R.id.btn_EachWordNewLine);
        btnPigLatin = findViewById(R.id.btn_PigLatin);
    }
}
