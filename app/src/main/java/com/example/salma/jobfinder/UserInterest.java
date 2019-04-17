package com.example.salma.jobfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class UserInterest extends AppCompatActivity implements View.OnClickListener {
    private Spinner spinner;
    String[] jobtitles;
    private Button searchbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interest);

        spinner=findViewById(R.id.spinnerid);
        jobtitles=getResources().getStringArray(R.array.job_titles);
        searchbutton=findViewById(R.id.searchbuttonid);
        searchbutton.setOnClickListener(this);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.sampleview,R.id.sampletextviewid,jobtitles);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        String titlevalue=spinner.getSelectedItem().toString();
        Intent intent=new Intent(UserInterest.this,joblist.class);
        startActivity(intent);

    }
}
