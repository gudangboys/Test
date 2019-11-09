package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFactorsOfNumber extends AppCompatActivity {
    private EditText editTextEnterNumberFindFactors;
    private Button btnFindFactors, btnResetFindFactors;
    private TextView textViewResultFindFactors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_factors_of_number);

        initViews();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnFindFactors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberFindFactors.getText().toString().isEmpty()) {
                    Toast.makeText(FindFactorsOfNumber.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    findFactors();
                }
            }
        });

        btnResetFindFactors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberFindFactors.getText().clear();
                textViewResultFindFactors.setText("");
            }
        });


    }

    private void initViews(){
        editTextEnterNumberFindFactors = findViewById(R.id.editTextEnterNumber_findFactors);
        btnFindFactors = findViewById(R.id.btnFindFactors);
        btnResetFindFactors = findViewById(R.id.btnResetFindFactors);
        textViewResultFindFactors = findViewById(R.id.textView_result_findFactors);
    }

    private void findFactors(){
        List<Integer> factors = new ArrayList<>();
        int userNumberFindFactor = Integer.valueOf(editTextEnterNumberFindFactors.getText().toString());

        for (int i = 1; i <= userNumberFindFactor; i++) {

            if (userNumberFindFactor%i == 0) {
                factors.add(i);

            }


        }

        textViewResultFindFactors.append("\n" + factors);


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
