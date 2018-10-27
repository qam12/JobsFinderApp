package com.ast.jobsonthemapemployer;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {

    ArrayList<Notification_class> dataModels;
    ListView listView;
    private static Notification_CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);


        //custom tool bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.notify);
        setSupportActionBar(toolbar);

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        listView=(ListView) findViewById(R.id.mylist23);

        //Arraylist items
        dataModels = new ArrayList<>();
        dataModels.add(new Notification_class("Goerge has accepted your request", "Thursday", "Sep 23, 2008", ""));
        dataModels.add(new Notification_class("Goerge has accepted your request", "Thursday", "Feb 9, 2009", ""));
        dataModels.add(new Notification_class("Goerge has accepted your request", "Tuesday", "Apr 27, 2009", ""));
        dataModels.add(new Notification_class("Goerge has accepted your request", "Wednesday", "Sep 15, 2009", ""));
        dataModels.add(new Notification_class("Goerge has accepted your request", "Sunday", "Oct 26, 2009", ""));



        adapter = new Notification_CustomAdapter(dataModels, getApplication());
        listView.setAdapter(adapter);
        listView.setOverscrollFooter(new ColorDrawable(Color.TRANSPARENT));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Notification_class dataModel = dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

            }
        });

        return;

    }
}
