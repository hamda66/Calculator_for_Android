package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addbtn = (Button) findViewById(R.id.ADD);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText num1 = (EditText) findViewById(R.id.num1);
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.res);

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());

                int results = number1 + number2;

                result.setText(results + "");

            }
        });

        Button musbtn = (Button) findViewById(R.id.MINUS);
        musbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText num10 = (EditText) findViewById(R.id.num1);
                EditText num20 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.res);

                int number11 = Integer.parseInt(num10.getText().toString());
                int number22 = Integer.parseInt(num20.getText().toString());

                int results = number11 - number22;

                result.setText(results + "");

            }
        });

       Button mulbtn = (Button) findViewById(R.id.MULTI);
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText num14 = (EditText) findViewById(R.id.num1);
                EditText num24 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.res);

                int number13 = Integer.parseInt(num14.getText().toString());
                int number23 = Integer.parseInt(num24.getText().toString());

                int results = number13 * number23;

                result.setText(results + "");

            }
        });

        Button divbtn = (Button) findViewById(R.id.Divide);
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText num14 = (EditText) findViewById(R.id.num1);
                EditText num24 = (EditText) findViewById(R.id.num2);
                TextView result = (TextView) findViewById(R.id.res);

                int number13 = Integer.parseInt(num14.getText().toString());
                int number23 = Integer.parseInt(num24.getText().toString());

                int results = number13 / number23;

                result.setText(results + "");

            }
        });

    }
}
//done