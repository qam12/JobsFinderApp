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



public class Statements extends AppCompatActivity {

    ArrayList<Statement_Class> dataModels;
    ListView listView;
    private static Statement_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sy);

        //custom tool bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.statement_tool);
        setSupportActionBar(toolbar);

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        listView=(ListView) findViewById(R.id.mylist2);

        //Arraylist items
        dataModels = new ArrayList<>();
        dataModels.add(new Statement_Class("The House Store", "Socking", "$16", "September 23, 2008"));
        dataModels.add(new Statement_Class("Goerge", "Warehouse", "$26", "February 9, 2009"));
        dataModels.add(new Statement_Class("Floor Installer", "Android 1.5", "$17", "April 27, 2009"));
        dataModels.add(new Statement_Class("Grocery", "Land", "$13", "September 15, 2009"));
        dataModels.add(new Statement_Class("Eclair", "Android 2.0", "$10", "October 26, 2009"));



        adapter = new Statement_Adapter(dataModels, getApplication());
        listView.setAdapter(adapter);
        listView.setOverscrollFooter(new ColorDrawable(Color.TRANSPARENT));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Statement_Class dataModel = dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

            }
        });

        return;

    }


}
