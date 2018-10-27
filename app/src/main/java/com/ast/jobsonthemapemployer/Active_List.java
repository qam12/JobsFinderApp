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
 * Created by AST on 12/7/2017.
 */

public class Active_List extends Fragment {

    public Active_List(){

    }


    ArrayList<Activelist_class> dataModels;
    ListView listView;
    private static Activelist_Adapter adapter;


    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        View v = inflater.inflate(R.layout.active_list, container, false);
        listView=(ListView) v.findViewById(R.id.mylist34);




        //Arraylist items
        dataModels = new ArrayList<>();
        dataModels.add(new Activelist_class("The House Store", "Socking", "$16", "September 23, 2008"));
        dataModels.add(new Activelist_class("Goerge", "Warehouse", "$26", "February 9, 2009"));
        dataModels.add(new Activelist_class("Floor Installer", "Android 1.5", "$17", "April 27, 2009"));
        dataModels.add(new Activelist_class("Grocery", "Land", "$13", "September 15, 2009"));
        dataModels.add(new Activelist_class("Eclair", "Android 2.0", "$10", "October 26, 2009"));
        dataModels.add(new Activelist_class("Froyo", "Android 2.2", "$4", "May 20, 2010"));
        dataModels.add(new Activelist_class("Gingerbread", "Android 2.3", "$86", "December 6, 2010"));
//        dataModels.add(new Activelist_class("Honeycomb", "Android 3.0", "$18", "February 22, 2011"));
//        dataModels.add(new Activelist_class("Ice Cream Sandwich", "Android 4.0", "$16", "October 18, 2011"));
//        dataModels.add(new Activelist_class("Jelly Bean", "Android 4.2", "$11", "July 9, 2012"));
//        dataModels.add(new Activelist_class("Kitkat", "Android 4.4", "$10", "October 31, 2013"));
//        dataModels.add(new Activelist_class("Lollipop", "Android 5.0", "$1", "November 12, 2014"));
//        dataModels.add(new Activelist_class("Marshmallow", "Android 6.0", "$16", "October 5, 2015"));


        adapter = new Activelist_Adapter(dataModels, getActivity());
        listView.setAdapter(adapter);
        listView.setOverscrollFooter(new ColorDrawable(Color.TRANSPARENT));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Activelist_class dataModel = dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

            }
        });
        return v;

    }


}