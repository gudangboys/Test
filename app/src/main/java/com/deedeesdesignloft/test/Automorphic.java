package com.deedeesdesignloft.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Automorphic extends AppCompatActivity {

    private EditText editTextEnterNumberAutomorphic;
    private Button btnCalculateAutomorphic, btnResetAutomorphic;
    private TextView textViewResultAutomorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automorphic);

        initViews();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnCalculateAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextEnterNumberAutomorphic.getText().toString().isEmpty()) {
                    Toast.makeText(Automorphic.this, "Enter Number First", Toast.LENGTH_SHORT).show();
                } else {
                    getAutomorphic();
                }
            }
        });

        btnResetAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextEnterNumberAutomorphic.getText().clear();
                textViewResultAutomorphic.setText("");
            }
        });
    }

    private void getAutomorphic(){
        int userAutomorphic = Integer.parseInt(editTextEnterNumberAutomorphic.getText().toString());
        int count = 0, ori = userAutomorphic, sq = userAutomorphic * userAutomorphic;

        while (ori > 0){
            count ++;
            ori = ori / 10;
        }

        int end = sq % (int) Math.pow(10, count);
        if (userAutomorphic == end) {
            textViewResultAutomorphic.setText(userAutomorphic + " is an Automorphic Number");
        } else {
            textViewResultAutomorphic.setText(userAutomorphic + " is not an Automorphic Number");
        }

    }

    private void initViews(){
        editTextEnterNumberAutomorphic = findViewById(R.id.editTextEnterNumber_Automorphic);
        btnCalculateAutomorphic = findViewById(R.id.btn_caculateAutomorphic);
        btnResetAutomorphic = findViewById(R.id.btnResetAutomorphic);
        textViewResultAutomorphic = findViewById(R.id.textView_result_Automorphic);
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
