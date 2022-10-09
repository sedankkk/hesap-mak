package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sonuc;
    EditText number1,number2;
    Button toplama,çıkartma,çarpma,bölme;

    float sedank_num;
    int num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonuc = (TextView) findViewById(R.id.sonuc);
        number1 = (EditText) findViewById(R.id.Number1);
        number2 = (EditText) findViewById(R.id.Number2);
        toplama = (Button) findViewById(R.id.toplama);
        çıkartma = (Button) findViewById(R.id.çıkartma);
        çarpma = (Button) findViewById(R.id.çarpma);
        bölme = (Button) findViewById(R.id.bölme);

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(number1.getText().toString());
                num2 =Integer.parseInt(number2.getText().toString());
                sedank_num = num1 + num2;
                sonuc.setText(String.valueOf(sedank_num));

            }
        });

        çıkartma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(number1.getText().toString());
                num2 =Integer.parseInt(number2.getText().toString());
                sedank_num = num1 - num2;
                sonuc.setText(String.valueOf(sedank_num));

            }
        });

        çarpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(number1.getText().toString());
                num2 =Integer.parseInt(number2.getText().toString());
                sedank_num = num1 * num2;
                sonuc.setText(String.valueOf(sedank_num));

            }
        });

        bölme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(number1.getText().toString());
                num2 =Integer.parseInt(number2.getText().toString());
                sedank_num = num1 / num2;
                sonuc.setText(String.valueOf(sedank_num));

            }
        });


    }
}