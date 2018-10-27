package com.ast.jobsonthemapemployer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AST on 12/13/2017.
 */

public class Agency_List extends Fragment{

    public Agency_List() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.agency_list,
                container, false);
        return view;
    }
}
