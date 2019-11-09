package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FindFactorialOfNumber extends AppCompatActivity {
    private EditText editTextEnterNumberFindFactorial;
    private Button btnFindFactorial, btnResetFindFactorial;
    private TextView textViewResultFindFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_factorial_of_number);

        initViews();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnFindFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberFindFactorial.getText().toString().isEmpty()){
                    editTextEnterNumberFindFactorial.requestFocus();
                    Toast.makeText(FindFactorialOfNumber.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    findFactorial();
                }
            }
        });

        btnResetFindFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberFindFactorial.getText().clear();
                textViewResultFindFactorial.setText("");
            }
        });


    }



    private void initViews(){
        editTextEnterNumberFindFactorial = findViewById(R.id.editTextEnterNumber_findFactorial);
        btnFindFactorial = findViewById(R.id.btnFindFactorial);
        btnResetFindFactorial = findViewById(R.id.btnResetFindFactorial);
        textViewResultFindFactorial = findViewById(R.id.textView_result_findFactorial);
    }

    private void findFactorial(){
        int userNumberFindFactorial = Integer.valueOf(editTextEnterNumberFindFactorial.getText().toString());
        int factorial = 1;



        for (int i = 1; i <= userNumberFindFactorial; i++){
            factorial = factorial * i;
            textViewResultFindFactorial.append("\n" + factorial);

        }


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
