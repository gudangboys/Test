package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeOrComposite extends AppCompatActivity {

    private EditText editTextEnterNumberPrimeOrComposite;
    private Button btnCalculatePrimeOrComposite, btnResetPrimeOrComposite;
    private TextView textViewResultPrimeOrComposite;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_or_composite);

        initViews();

        btnCalculatePrimeOrComposite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberPrimeOrComposite.getText().toString().isEmpty()) {
                    Toast.makeText(PrimeOrComposite.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    primeOrComposite();
                }
            }
        });

        btnResetPrimeOrComposite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberPrimeOrComposite.getText().clear();
                textViewResultPrimeOrComposite.setText("");
            }
        });

    }

    private void primeOrComposite(){
        int count = 0;
        int userInputPrimeOrcomposite = Integer.parseInt(editTextEnterNumberPrimeOrComposite.getText().toString());

        for (int i = 1; i <= userInputPrimeOrcomposite; i++) {
            if (userInputPrimeOrcomposite%i==2) {
                count++;
            }
        }

        if (count == 2) {
            textViewResultPrimeOrComposite.setText(userInputPrimeOrcomposite + " is a Prime Number");
        } else {
            textViewResultPrimeOrComposite.setText(userInputPrimeOrcomposite + " is a Composite Number");
        }

    }

    private void initViews(){
        editTextEnterNumberPrimeOrComposite = findViewById(R.id.editTextEnterNumber_primeOrComposite);
        btnCalculatePrimeOrComposite = findViewById(R.id.btn_caculatePrimeOrComposite);
        btnResetPrimeOrComposite = findViewById(R.id.btnResetPrimeOrComposite);
        textViewResultPrimeOrComposite = findViewById(R.id.textView_result_primeOrComposite);
    }
}
