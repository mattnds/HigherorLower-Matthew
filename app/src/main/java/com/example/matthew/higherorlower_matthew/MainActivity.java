package com.example.matthew.higherorlower_matthew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void toastString(String string){

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_LONG).show();


    }


    public void guess (View view){
        EditText guessNumber = (EditText) findViewById(R.id.guessNumber);
       // Toast.makeText(MainActivity.this, guessNumber.getText(), Toast.LENGTH_LONG).show();

        int guessInt = Integer.parseInt(guessNumber.getText().toString());

        if (guessInt > randomNumber){
            toastString("Lower!");
        }
        else if (guessInt < randomNumber){
            toastString("Higher");
        }
        else {
           toastString("That's right!");

            Random rand = new Random();

            randomNumber = rand.nextInt(20) +1;
        }
        Log.i("Test", guessNumber.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();  //this generates the random number when the app is launched
        randomNumber = random.nextInt(20) +1;

    }
}
