package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PerfectNumber extends AppCompatActivity {

    private EditText editTextEnterNumberPerfectNumber;
    private Button btnCalculatePerfectNumber, btnResetPerfectNumber;
    private TextView textViewResultPerfectNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfect_number);

        initViews();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnCalculatePerfectNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberPerfectNumber.getText().toString().isEmpty()) {
                    Toast.makeText(PerfectNumber.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    perfectNumber();
                }
            }
        });

        btnResetPerfectNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberPerfectNumber.getText().clear();
                textViewResultPerfectNumber.setText("");
            }
        });

    }

    private void perfectNumber(){
        int perfectNumberSum = 0;
        int userPerfectNumber = Integer.parseInt(editTextEnterNumberPerfectNumber.getText().toString());

        for (int i = 1; i <= userPerfectNumber; i++){
            if (userPerfectNumber % i == 0){
                perfectNumberSum = perfectNumberSum + i;
            }
        }

        if (perfectNumberSum == userPerfectNumber){
            textViewResultPerfectNumber.setText(userPerfectNumber + " is a Perfect Number");
        } else {
            textViewResultPerfectNumber.setText(userPerfectNumber + " is not a Perfect Number");
        }
    }

    private void initViews(){
        editTextEnterNumberPerfectNumber = findViewById(R.id.editTextEnterNumber_perfectNumber);
        btnCalculatePerfectNumber = findViewById(R.id.btn_caculatePerfectNumber);
        btnResetPerfectNumber = findViewById(R.id.btnResetPerfectNumber);
        textViewResultPerfectNumber = findViewById(R.id.textView_result_perfectNumber);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
