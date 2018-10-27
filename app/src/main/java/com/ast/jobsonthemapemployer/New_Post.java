package com.ast.jobsonthemapemployer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class New_Post extends AppCompatActivity {

    LinearLayout NewJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__post);

        NewJob = (LinearLayout) findViewById(R.id.newJob);

        NewJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(New_Post.this,New_Job.class);
                startActivity(i);
            }
        });    }
}
