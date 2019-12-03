package com.e.kidstalkingdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SearchWords extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_words);
        btn1 = (Button) findViewById(R.id.grade_one_btn);
        btn2 = (Button) findViewById(R.id.grade_two_btn);
        btn3 = (Button) findViewById(R.id.grade_three_btn);
        btn4 = (Button) findViewById(R.id.grade_four_btn);
        btn5 = (Button) findViewById(R.id.grade_five_btn);
        btn6 = (Button) findViewById(R.id.grade_six_btn);
        btn7 = (Button) findViewById(R.id.grade_seven_btn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShowWord();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }


    private void openShowWord(){
        Intent intent = new Intent(SearchWords.this,ShowWords.class);
        startActivity(intent);
    }
}
