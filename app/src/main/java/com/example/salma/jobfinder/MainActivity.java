package com.example.salma.jobfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2;
    private Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button2)
        {
            intent=new Intent(MainActivity.this,jobpost.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.button1)
        {
            intent=new Intent(MainActivity.this,Userinfo.class);
            startActivity(intent);
        }

    }
}
