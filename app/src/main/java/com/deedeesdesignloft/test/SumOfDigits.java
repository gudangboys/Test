package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumOfDigits extends AppCompatActivity {

    private EditText editTextEnterNumberSumOfDigits;
    private Button btnCalculateSumOfDigits, btnResetSumOfDigits;
    private TextView textViewResultSumOfDigits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_of_digits);

        initViews();

        btnCalculateSumOfDigits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberSumOfDigits.getText().toString().isEmpty()) {
                    Toast.makeText(SumOfDigits.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    sumOfDigits();
                }
            }
        });

        btnResetSumOfDigits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberSumOfDigits.getText().clear();
                textViewResultSumOfDigits.setText("");
            }
        });
    }

    private void sumOfDigits(){
        int userNumberSumOfDigits = Integer.parseInt(editTextEnterNumberSumOfDigits.getText().toString());
        int result = 0;
        int totalSum = 0;


        while (userNumberSumOfDigits > 0) {
            result = userNumberSumOfDigits % 10;
            totalSum = totalSum + result;
            userNumberSumOfDigits = userNumberSumOfDigits/10;

        }

        textViewResultSumOfDigits.setText("Sum of the digits of your number is " + totalSum);
    }

    private void initViews(){
        editTextEnterNumberSumOfDigits = findViewById(R.id.editTextEnterNumber_SumOfDigits);
        btnCalculateSumOfDigits = findViewById(R.id.btn_caculateSumOfDigits);
        btnResetSumOfDigits = findViewById(R.id.btnResetSumOfDigits);
        textViewResultSumOfDigits = findViewById(R.id.textView_result_SumOfDigits);
    }
}
