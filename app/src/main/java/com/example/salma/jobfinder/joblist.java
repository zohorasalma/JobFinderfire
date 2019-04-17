package com.example.salma.jobfinder;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class joblist extends AppCompatActivity {
    private ListView listView;
    FirebaseDatabase database;
    DatabaseReference databaseReference;
    jobdetails jobDetails;
    ArrayList<String>list;
    ArrayAdapter<String>adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joblist);
        listView=findViewById(R.id.listviewid);
        jobDetails=new jobdetails();

        list=new ArrayList<>();
        adapter=new ArrayAdapter<String>(this,R.layout.sample_joblist,R.id.samplelisttextviewid,list);

        database=FirebaseDatabase.getInstance();
        databaseReference=database.getReference("jobdetails");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot ds: dataSnapshot.getChildren()){
                    jobDetails=ds.getValue(jobdetails.class);
                    list.add("Title : "+jobDetails.getTitle().toString()
                            +"\n"+"Job Type : "+jobDetails.getJobtype().toString()
                                    +"\n"+"Location : "+jobDetails.getLocation().toString()
                                    +"\n"+"Salary : "+jobDetails.getSalary().toString()
                                    +"\n"+ "Total vacancy : "+jobDetails.getVacancy().toString()
                            +"\n"+"Minimum Qualification : "+jobDetails.getMinimumqual().toString()
                            +"\n"+"Application Deadline : "+jobDetails.getAppdeadline().toString()
                            +"\n"+"Company Name : "+jobDetails.getCompanyname().toString()
                            +"\n"+"Contact Email "+jobDetails.getEmail().toString()



                    );

                }
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
