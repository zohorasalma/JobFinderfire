package com.example.salma.jobfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;


public class splashscreen extends AppCompatActivity {
    private ProgressBar progressbar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);
        progressbar=findViewById(R.id.progressbarid);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startapp();
            }
        });
        thread.start();
    }
    public void doWork() {
        for (progress = 20; progress <= 100; progress = progress + 20)
        {
            try{
                Thread.sleep(1000);
                progressbar.setProgress( progress);}
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
    public void startapp()
    {
        Intent intent=new Intent(splashscreen.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
