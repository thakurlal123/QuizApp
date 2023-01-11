package com.thakur.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        private String[] questions = {"java is person?","java was introduce in 1823","java was created by using python",
        "java has abstract classes?","java supports interfaces"};
        private boolean[]answer = {false,false,false,true,true};
        private int score = 0;
        Button yes;
        Button no;
        TextView question;


        private  int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if the arrahy going out of bounds
            if (index<=questions.length-1){
                // if you have correct answer
                if (answer[index]){
                    score++;
                }
                index++;
                if (index<= questions.length-1){
                    question.setText(questions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your score is "+ score, Toast.LENGTH_SHORT).show();
                }

            }else {
                Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
            }

            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if the arrahy going out of bounds
                if (index<=questions.length-1) {
                    // if you have correct answer
                    if (!answer[index]) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your score is " + score, Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                        Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}