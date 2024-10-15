package com.example.recyclerview;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView txtcounter = findViewById(R.id.txtcounter);
        new CountDownTimer(5000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                txtcounter.setText("Abriendo en "+ millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Intent intent =new Intent(splash.this, MainActivity.class );
                startActivity(intent);
                finish();
            }
        }.start();
    }

}
