package com.ast.jobsonthemapemployer;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by AST on 11/23/2017.
 */

public class previous_jobs extends Fragment {

    public previous_jobs() {
        // Required empty public constructor
    }

    ArrayList<PostJob_class> dataModels;
    ListView listView;
    private static Postjob_customAdapter adapter;


    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        View v = inflater.inflate(R.layout.previous_job_list, container, false);
        listView=(ListView) v.findViewById(R.id.mylist);


        //Arraylist items
        dataModels = new ArrayList<>();
        dataModels.add(new PostJob_class("The House Store", "Socking", "$16", "September 23, 2008"));
        dataModels.add(new PostJob_class("Goerge", "Warehouse", "$26", "February 9, 2009"));
        dataModels.add(new PostJob_class("Floor Installer", "Android 1.5", "$17", "April 27, 2009"));
        dataModels.add(new PostJob_class("Grocery", "Land", "$13", "September 15, 2009"));
        dataModels.add(new PostJob_class("Eclair", "Android 2.0", "$10", "October 26, 2009"));
        dataModels.add(new PostJob_class("Froyo", "Android 2.2", "$4", "May 20, 2010"));
        dataModels.add(new PostJob_class("Gingerbread", "Android 2.3", "$86", "December 6, 2010"));
        dataModels.add(new PostJob_class("Honeycomb", "Android 3.0", "$18", "February 22, 2011"));
        dataModels.add(new PostJob_class("Ice Cream Sandwich", "Android 4.0", "$16", "October 18, 2011"));
        dataModels.add(new PostJob_class("Jelly Bean", "Android 4.2", "$11", "July 9, 2012"));
        dataModels.add(new PostJob_class("Kitkat", "Android 4.4", "$10", "October 31, 2013"));
        dataModels.add(new PostJob_class("Lollipop", "Android 5.0", "$1", "November 12, 2014"));
        dataModels.add(new PostJob_class("Marshmallow", "Android 6.0", "$16", "October 5, 2015"));


        adapter = new Postjob_customAdapter(dataModels, getActivity());
        listView.setAdapter(adapter);
        listView.setOverscrollFooter(new ColorDrawable(Color.TRANSPARENT));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                PostJob_class dataModel = dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

            }
        });



          return v;

    }
}
