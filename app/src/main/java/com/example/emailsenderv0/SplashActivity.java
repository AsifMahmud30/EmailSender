package com.example.emailsenderv0;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.emailsenderv0.R;

public class SplashActivity<Splash> extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;
    private Object SplashScreen;
    private Object splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        progressBar = (ProgressBar) findViewById(R.id.progressBarId);
        Thread thread = new Thread((new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();

            }
        }));

        thread.start();
    }

    public void doWork() {
        for (progress = 1; progress <= 100; progress = progress + 1) {
            try {
                Thread.sleep(25);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void startApp(){
        Intent intent;
        intent = new Intent(com.example.emailsenderv0.SplashActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}