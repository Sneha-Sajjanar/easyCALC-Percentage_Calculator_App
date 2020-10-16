package com.example.percentage_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1;
    EditText num1,num2,num3,num4,num5,num6,num7,num8;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



        textView1 = findViewById(R.id.textView1);
        num1 = findViewById(R.id.sub1);
        num2 = findViewById(R.id.sub2);
        num3 = findViewById(R.id.sub3);
        num4 = findViewById(R.id.sub4);
        num5 = findViewById(R.id.sub5);
        num6 = findViewById(R.id.sub6);
        num7 = findViewById(R.id.sub7);
        num8 = findViewById(R.id.sub8);
        button = findViewById(R.id.cal_percent);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans = textView1.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("key",ans);
                startActivity(intent);

            }
        });

        }

    public void add(View view){

        double n1,n2,n3,n4,n5,n6,n7,n8,results;

        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        n3 = Double.parseDouble(num3.getText().toString());
        n4 = Double.parseDouble(num4.getText().toString());
        n5 = Double.parseDouble(num5.getText().toString());
        n6 = Double.parseDouble(num6.getText().toString());
        n7 = Double.parseDouble(num7.getText().toString());
        n8 = Double.parseDouble(num8.getText().toString());


        results = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;

        textView1.setText(String.valueOf(results));


    }
}