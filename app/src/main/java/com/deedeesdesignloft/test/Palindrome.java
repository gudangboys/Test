package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Palindrome extends AppCompatActivity {

    private EditText editTextEnterNumberPalindrome;
    private Button btnCalculatePalindrome, btnResetPalindrome;
    private TextView textViewResultPalindrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        initViews();

        btnCalculatePalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberPalindrome.getText().toString().isEmpty()) {
                    Toast.makeText(Palindrome.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    getPalindrome();
                }
            }
        });

        btnResetPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberPalindrome.getText().clear();
                textViewResultPalindrome.setText("");
            }
        });
    }


    private void getPalindrome(){
        int rev = 0, r, ori;

        int userPalindrome = Integer.parseInt(editTextEnterNumberPalindrome.getText().toString());

        ori = userPalindrome;

        while (userPalindrome != 0) {
            r = userPalindrome % 10;
            rev = rev * 10 + r;
            userPalindrome = userPalindrome/10;
        }

        if (ori == rev){
            textViewResultPalindrome.setText(ori + " is a Plaindrome Number");
        } else {
            textViewResultPalindrome.setText(ori + " is not a Plaindrome Number");
        }

        
    }

    private void initViews(){
        editTextEnterNumberPalindrome = findViewById(R.id.editTextEnterNumber_Palindrome);
        btnCalculatePalindrome = findViewById(R.id.btn_caculatePalindrome);
        btnResetPalindrome = findViewById(R.id.btnResetPalindrome);
        textViewResultPalindrome = findViewById(R.id.textView_result_Palindrome);
    }
}
