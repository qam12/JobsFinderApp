package com.ast.jobsonthemapemployer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Payment_Information extends AppCompatActivity {

    Button Sav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment__information);


        //custom tool bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.paytool);
        setSupportActionBar(toolbar);

        Sav = (Button) findViewById(R.id.button25);
        Sav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Payment_Information.this, "Data Saved", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
