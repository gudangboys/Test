package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EachWordNewLine extends AppCompatActivity {

    private EditText editTextEnterStringEachWordNewLine;
    private Button btnCalculateEachWordNewLine, btnResetEachWordNewLine;
    private TextView textViewResultEachWordNewLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_each_word_new_line);

        initViews();

        btnCalculateEachWordNewLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterStringEachWordNewLine.getText().toString().isEmpty()) {
                    Toast.makeText(EachWordNewLine.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    getEachWordNewLine();
                }
            }
        });

        btnResetEachWordNewLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterStringEachWordNewLine.getText().clear();
                textViewResultEachWordNewLine.setText("");
            }
        });


    }

    private void getEachWordNewLine(){
        String userEachWordNewLine = editTextEnterStringEachWordNewLine.getText().toString();

        String sentence = userEachWordNewLine.replace(" ", System.lineSeparator());

        textViewResultEachWordNewLine.setText(sentence);

        //OR

        //String sentence2 = userEachWordNewLine;
        //for(String word : userEachWordNewLine.split(" ")){
        //    textViewResultEachWordNewLine(word);
        //}


    }

    private void initViews(){
        editTextEnterStringEachWordNewLine = findViewById(R.id.editTextEnterString_EachWordNewLine);
        btnCalculateEachWordNewLine = findViewById(R.id.btn_caculateEachWordNewLine);
        btnResetEachWordNewLine = findViewById(R.id.btnResetEachWordNewLine);
        textViewResultEachWordNewLine = findViewById(R.id.textView_result_EachWordNewLine);
    }
}
