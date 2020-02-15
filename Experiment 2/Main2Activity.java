package com.example.labexperiment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String reg=intent.getStringExtra("reg");
        String dept=intent.getStringExtra("dept");
        TextView rname=findViewById(R.id.rname);
        TextView rid=findViewById(R.id.rid);
        TextView rdept=findViewById(R.id.rdept);
        rname.setText(name);
        rid.setText(reg);
        rdept.setText(dept);
    }
}
