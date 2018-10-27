package com.ast.jobsonthemapemployer;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.Calendar;

public class New_Job extends AppCompatActivity {
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;

    EditText showTime;
    static final int DIALOG_ID = 0;
    int hour_x;
    int min_x;

    Button PostBtn;
    TextView Skill;






    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__job);


        PostBtn = (Button) findViewById(R.id.postMis);
        Skill = (TextView) findViewById(R.id.skill);


        //initialize date id

        dateView = (TextView) findViewById(R.id.textView3);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);


        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);


        //post Job
        PostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(New_Job.this,Posted_job.class);
                startActivity(i);

            }
        });

        Skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(New_Job.this,Skills_categories.class);
                startActivity(i);
            }
        });

        showTimePicker();
    }

    //date picker Android
    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "pick",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,myDateListener, year, month, day);
        }

        if (id == DIALOG_ID) {

            return new TimePickerDialog(New_Job.this, KtimePickListner, hour_x, min_x, false);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        //dateView.setText(new StringBuilder().append(day).append("/").append(month).append("/").append(year));
        Toast.makeText(this, "" + new StringBuilder().append(day).append("/").append(month).append("/").append(year), Toast.LENGTH_SHORT).show();
    }



    //Time picker
    protected TimePickerDialog.OnTimeSetListener KtimePickListner =
            new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    hour_x = hourOfDay;
                    min_x = minute;
                    Toast.makeText(New_Job.this, "time" + hour_x + ":" + min_x, Toast.LENGTH_SHORT).show();
                }
            };

    public void showTimePicker(){
        showTime = (EditText) findViewById(R.id.button3);
        showTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_ID);
            }
        });
    }

}
