package com.hakanerdogmus.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // burada geri sayımın basit hali mevcut.
 TextView gosterge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gosterge = findViewById(R.id.gosterge);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                gosterge.setText("Son: " + millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Geri Sayım Bitti!", Toast.LENGTH_LONG).show();
                gosterge.setText("Geri Sayım Bitti!");

            }
        }.start();
    }
}

