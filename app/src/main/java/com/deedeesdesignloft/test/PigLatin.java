package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PigLatin extends AppCompatActivity {

    private EditText editTextEnterStringPigLatin;
    private Button btnCalculatePigLatin, btnResetPigLatin;
    private TextView textViewResultPigLatin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig_latin);

        initViews();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnCalculatePigLatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterStringPigLatin.getText().toString().isEmpty()) {
                    Toast.makeText(PigLatin.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    getPigLatin();
                }
            }
        });

        btnResetPigLatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterStringPigLatin.getText().clear();
                textViewResultPigLatin.setText("");
            }
        });
    }

    private void getPigLatin(){
        String word = "", word2 = "";
        char ch;
        String userPigLatin = editTextEnterStringPigLatin.getText().toString();
        userPigLatin.trim();

        for (int i = 0; i < userPigLatin.length(); i++) {

            ch = userPigLatin.charAt(i);

            if (userPigLatin.charAt(i) == 'a' || userPigLatin.charAt(i) == 'e' ||
            userPigLatin.charAt(i) == 'i' || userPigLatin.charAt(i) == 'o' ||
            userPigLatin.charAt(i) == 'u') {
                for (int j = 1; j < userPigLatin.length(); j++) {
                    word += userPigLatin.charAt(j);
                }

                break;
            }

            if (userPigLatin.charAt(i) != 'a' || userPigLatin.charAt(i) != 'e' ||
            userPigLatin.charAt(i) != 'i' || userPigLatin.charAt(i) != 'o' ||
            userPigLatin.charAt(i) != 'u') {
                word2 += ch;
            }


        }

        textViewResultPigLatin.setText(word + word2 + "ay");
    }


    private void initViews(){
        editTextEnterStringPigLatin = findViewById(R.id.editTextEnterString_PigLatin);
        btnCalculatePigLatin = findViewById(R.id.btn_caculatePigLatin);
        btnResetPigLatin = findViewById(R.id.btnResetPigLatin);
        textViewResultPigLatin = findViewById(R.id.textView_result_PigLatin);
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
