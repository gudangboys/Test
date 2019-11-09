package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VowelConsonantsSpaces extends AppCompatActivity {

    private EditText editTextEnterStringNumberVowelConsonants;
    private Button btnCalculateVowelConsonants, btnResetVowelConsonants;
    private TextView textViewResultVowelConsonants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel_consonants_spaces);

        initViews();

        btnCalculateVowelConsonants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterStringNumberVowelConsonants.getText().toString().isEmpty()) {
                    Toast.makeText(VowelConsonantsSpaces.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    getVowelConsonants();
                }
            }
        });

        btnResetVowelConsonants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterStringNumberVowelConsonants.getText().clear();
                textViewResultVowelConsonants.setText("");
            }
        });


    }

    private void getVowelConsonants(){
        String userVowelConsonant = editTextEnterStringNumberVowelConsonants.getText().toString();
        int vowels = 0, consonants = 0, numbers = 0, spaces = 0, specialChar = 0;

        for (int i = 0; i < userVowelConsonant.length(); i ++){

            if (userVowelConsonant.charAt(i) == 'a' || userVowelConsonant.charAt(i) == 'e' ||
            userVowelConsonant.charAt(i) == 'i' || userVowelConsonant.charAt(i) == 'o' ||
            userVowelConsonant.charAt(i) == 'u') {
                vowels++;
            } else if (userVowelConsonant.charAt(i) == ' ') {
                spaces++;
            } else if (userVowelConsonant.charAt(i) >= 'a' && userVowelConsonant.charAt(i) <= 'z'){
                consonants++;
            } else if(userVowelConsonant.charAt(i) >= '0' && userVowelConsonant.charAt(i) <= '9') {
                numbers++;
            } else {
                specialChar++;
            }
        }

        textViewResultVowelConsonants.setText("Your String has: " + "\n" + vowels + " vowels"
                + "\n" + consonants + " consonants" + "\n" + numbers + " numbers" + "\n" + spaces +
                " spaces" + "\n" + specialChar + " special characters.");
    }

    private void initViews(){
        editTextEnterStringNumberVowelConsonants = findViewById(R.id.editTextEnterString_VowelConsonant);
        btnCalculateVowelConsonants = findViewById(R.id.btn_caculateVowelConsonant);
        btnResetVowelConsonants = findViewById(R.id.btnResetVowelConsonant);
        textViewResultVowelConsonants = findViewById(R.id.textView_result_VowelConsonant);
    }
}
