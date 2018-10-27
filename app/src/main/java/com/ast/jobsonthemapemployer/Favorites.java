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
 * Created by AST on 12/13/2017.
 */

public class Favorites extends Fragment {

    public Favorites() {
        // Required empty public constructor
    }

    ArrayList<Agent_fav_class> dataModels;
    ListView listView;
    private static Agent_fav_Adapter adapter;


    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes

        View v = inflater.inflate(R.layout.favorites, container, false);
        listView=(ListView) v.findViewById(R.id.favlist);




        //Arraylist items
        dataModels = new ArrayList<>();
        dataModels.add(new Agent_fav_class("The House Store", "", "4.5", "September 23, 2008"));
        dataModels.add(new Agent_fav_class("Goerge", "Warehouse", "4.5", "February 9, 2009"));
        dataModels.add(new Agent_fav_class("Floor Installer", "", "4.5", "April 27, 2009"));
        dataModels.add(new Agent_fav_class("Grocery", "", "4.5", "September 15, 2009"));
        dataModels.add(new Agent_fav_class("Eclair", "", "4.5", "October 26, 2009"));
        dataModels.add(new Agent_fav_class("Froyo", "", "4.5", "May 20, 2010"));
        dataModels.add(new Agent_fav_class("Gingerbread", "", "4.5", "December 6, 2010"));
        dataModels.add(new Agent_fav_class("Honeycomb", "", "4.5", "February 22, 2011"));
        dataModels.add(new Agent_fav_class("Ice Cream Sandwich", "", "4.5", "October 18, 2011"));
        dataModels.add(new Agent_fav_class("Jelly Bean", "", "4.5", "July 9, 2012"));
        dataModels.add(new Agent_fav_class("Kitkat", "", "4.5", "October 31, 2013"));
        dataModels.add(new Agent_fav_class("Lollipop", "", "4.5", "November 12, 2014"));
        dataModels.add(new Agent_fav_class("Marshmallow", "", "4.5", "October 5, 2015"));


        adapter = new Agent_fav_Adapter(dataModels, getActivity());
        listView.setAdapter(adapter);
        listView.setOverscrollFooter(new ColorDrawable(Color.TRANSPARENT));



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Agent_fav_class dataModel = dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();

            }
        });
        return v;

    }


}
