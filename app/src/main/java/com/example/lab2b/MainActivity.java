package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String newPrompt;
    private String[] prompts;
    private int firstNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prompts = getResources().getStringArray(R.array.PROMPTS);
         firstNumber= 100;
    }
    public void onButtonHit(View v){
        Random generator = new Random();
        int numberPrompt = generator.nextInt(prompts.length);
        if ( firstNumber == numberPrompt){
            numberPrompt = generator.nextInt(prompts.length);
        }
        else{
             firstNumber = numberPrompt;
        }
        newPrompt = prompts[numberPrompt];
        TextView t = (TextView) findViewById(R.id.newPrompt);
        t.setText(newPrompt);
    }
}