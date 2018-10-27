package com.ast.jobsonthemapemployer;

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

import java.util.ArrayList;

/**
 * Created by AST on 11/23/2017.
 */

public class previous_add_list extends Fragment {

    public previous_add_list() {
        // Required empty public constructor
    }

    ArrayList<PostAds_class> dataModels;
    ListView listView;
    private static PostAds_customAdapter adapter;


    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        View v = inflater.inflate(R.layout.previous_ads_list, container, false);
        listView=(ListView) v.findViewById(R.id.mylist2);


        //Arraylist items
        dataModels = new ArrayList<>();
        dataModels.add(new PostAds_class("The House Store",  "$16", "September 23, 2008"));
        dataModels.add(new PostAds_class("Goerge", "$26", "February 9, 2009"));
        dataModels.add(new PostAds_class("Floor Installer", "$17", "April 27, 2009"));
        dataModels.add(new PostAds_class("Grocery", "$13", "September 15, 2009"));
        dataModels.add(new PostAds_class("Eclair",  "$10", "October 26, 2009"));
        dataModels.add(new PostAds_class("Froyo",  "$4", "May 20, 2010"));
        dataModels.add(new PostAds_class("Gingerbread", "$86", "December 6, 2010"));
        dataModels.add(new PostAds_class("Honeycomb", "$18", "February 22, 2011"));
        dataModels.add(new PostAds_class("Ice Cream Sandwich", "$16", "October 18, 2011"));
        dataModels.add(new PostAds_class("Jelly Bean", "$11", "July 9, 2012"));
        dataModels.add(new PostAds_class("Kitkat",  "$10", "October 31, 2013"));
        dataModels.add(new PostAds_class("Lollipop", "$1", "November 12, 2014"));
        dataModels.add(new PostAds_class("Marshmallow", "$16", "October 5, 2015"));


        adapter = new PostAds_customAdapter(dataModels, getActivity());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                PostAds_class dataModel = dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

            }
        });



        return v;

    }
}
