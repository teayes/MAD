package com.example.basicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText n1=findViewById(R.id.firstNumber);
        final EditText n2=findViewById(R.id.secondNumber);

        final Button sumButton=findViewById(R.id.sum);

        final TextView result=findViewById(R.id.result);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(n1.getText().toString());
                int b=Integer.parseInt(n2.getText().toString());

                int sum=a+b;

                result.setText("The sum of "+a+" and "+b+" is "+sum);
            }
        });
    }
}
