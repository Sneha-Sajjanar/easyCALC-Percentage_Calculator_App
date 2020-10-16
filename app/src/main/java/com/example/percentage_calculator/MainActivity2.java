package com.example.percentage_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView  scoredMarks,percent;
    EditText maxMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);



        scoredMarks = findViewById(R.id.scored_marks);
        maxMarks = findViewById(R.id.max_marks);
        percent = findViewById(R.id.result);

        String ans = getIntent().getStringExtra("key");

        scoredMarks.setText(ans);


    }

    public void percent(View view) {

        double n1, n2, result;

        n1 = Double.parseDouble(scoredMarks.getText().toString());
        n2 = Double.parseDouble(maxMarks.getText().toString());


        result = ((double) n1 / n2) * 100;

        percent.setText(String.valueOf(result));

    }

}


