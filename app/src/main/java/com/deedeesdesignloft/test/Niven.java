package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Niven extends AppCompatActivity {

    private EditText editTextEnterNumberNiven;
    private Button btnCalculateNiven, btnResetNiven;
    private TextView textViewResultNiven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niven);

        initViews();

        btnCalculateNiven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberNiven.getText().toString().isEmpty()) {
                    Toast.makeText(Niven.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    getNiven();
                }
            }
        });

        btnResetNiven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberNiven.getText().clear();
                textViewResultNiven.setText("");
            }
        });


    }

    private void getNiven(){
        int userNiven = Integer.parseInt(editTextEnterNumberNiven.getText().toString());
        int ori = userNiven, sumOfDigits = 0;


        while (ori > 0) {
            int rem = ori % 10;
            sumOfDigits += rem;
            ori = ori / 10;
        }

        if (userNiven % sumOfDigits == 0){
            textViewResultNiven.setText(userNiven + " is a Niven number");
        } else {
            textViewResultNiven.setText(userNiven + " is a not Niven number");
        }

    }

    private void initViews(){
        editTextEnterNumberNiven = findViewById(R.id.editTextEnterNumber_Niven);
        btnCalculateNiven = findViewById(R.id.btn_caculateNiven);
        btnResetNiven = findViewById(R.id.btnResetNiven);
        textViewResultNiven = findViewById(R.id.textView_result_Niven);
    }
}
