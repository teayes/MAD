package com.example.labexperiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] dept_array={"CSE","ISE","IT","ECE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.dept);
        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,dept_array);
        spinner.setAdapter(adapter);
        Button submit =findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                TextView t1=findViewById(R.id.name);
                TextView t2=findViewById(R.id.reg);
                Spinner s3=findViewById(R.id.dept);
                String name=t1.getText().toString();
                String reg=t2.getText().toString();
                String dept=s3.getSelectedItem().toString();
                intent.putExtra("name",name);
                intent.putExtra("reg",reg);
                intent.putExtra("dept",dept);
                startActivity(intent);
            }
        });

    }
}
