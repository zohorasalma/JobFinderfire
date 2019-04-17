package com.example.salma.jobfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class jobpost extends AppCompatActivity implements View.OnClickListener {
private EditText title;
private EditText location;
private EditText salary;
private EditText totalvacancy;
private Button postbutton;
private CheckBox hsc,bsc,masters;
private CheckBox fulltime,parttime,intern;
private DatabaseReference databaseReference;
private EditText appdeadline;
private EditText companyname,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobpost);

        title= findViewById(R.id.titleid);
        location=findViewById(R.id.locationid);
        salary=findViewById(R.id.salaryid);
        totalvacancy=findViewById(R.id.vacancyid);
        appdeadline=findViewById(R.id.appdeadlineid);
        companyname=findViewById(R.id.aboutcompanyid);
        email=findViewById(R.id.emailid);

        hsc=findViewById(R.id.hscid);
        bsc=findViewById(R.id.bscid);
        masters=findViewById(R.id.mastersid);

        fulltime=findViewById(R.id.fulltimeid);
        parttime=findViewById(R.id.parttimeid);
        intern=findViewById(R.id.internid);

        postbutton=findViewById(R.id.postbuttonid);
        postbutton.setOnClickListener(this)
        ;
        databaseReference=FirebaseDatabase.getInstance().getReference("jobdetails");

    }

    @Override
    public void onClick(View v) {
        saveData();





    }
    public void saveData()
    {
        String TITLE=title.getText().toString();
        String LOCATION=location.getText().toString();
        String SALARY= salary.getText().toString();
        String VACANCY=totalvacancy.getText().toString();
        String APPDEADLINE=appdeadline.getText().toString();
        String COMPANYNAME=companyname.getText().toString();
        String EMAIL=email.getText().toString();

        String MINIMUMQUAL = null;
        String JOBTYPE = null;
        if(hsc.isChecked())
        {
             MINIMUMQUAL=hsc.getText().toString();
        }
        if(bsc.isChecked())
        {
             MINIMUMQUAL=bsc.getText().toString();
        }
        if(masters.isChecked())
        {
            MINIMUMQUAL=masters.getText().toString();
        }

        if(fulltime.isChecked())
        {
            JOBTYPE=fulltime.getText().toString();
        }
        if(parttime.isChecked())
        {
            JOBTYPE=parttime.getText().toString();
        }
        if(intern.isChecked())
        {
            JOBTYPE=intern.getText().toString();
        }


        String key=databaseReference.push().getKey();
        jobdetails jobDetails=new jobdetails(TITLE,LOCATION,SALARY,VACANCY,MINIMUMQUAL,JOBTYPE,APPDEADLINE,COMPANYNAME,EMAIL);

        databaseReference.child(key).setValue(jobDetails);
        Toast.makeText(getApplicationContext(),"job details is added",Toast.LENGTH_LONG ).show();
    }
}
