package com.ast.jobsonthemapemployer;

/**
 * Created by AST on 12/15/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class Agent_fav_Adapter extends ArrayAdapter<Agent_fav_class> implements View.OnClickListener{

    private ArrayList<Agent_fav_class> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        TextView txtType;
        TextView txtVersion;
        ImageView info;
//        RatingBar ratebar;
    }

    public Agent_fav_Adapter(ArrayList<Agent_fav_class> data, Context c) {
        super(c, R.layout.notification_row,data);
        this.dataSet = data;
        this.mContext=c;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Agent_fav_class dataModel=(Agent_fav_class)object;

        switch (v.getId())
        {
//            case R.id.item_info:
//                Snackbar.make(v, "Release date " +dataModel.getFeature(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//
//                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get the data item for this position
        Agent_fav_class dataModel = getItem(position);
        //Check if an existing view is being reused, otherwise inflate the view
        Agent_fav_Adapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new Agent_fav_Adapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.notification_row, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.title);
            viewHolder.txtType = (TextView) convertView.findViewById(R.id.text);
            viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.date);
//            viewHolder.ratebar = (RatingBar) convertView.findViewById(R.id.rate);
            //viewHolder.info = (ImageView) convertView.findViewById(R.id.item_info);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (Agent_fav_Adapter.ViewHolder) convertView.getTag();
            result=convertView;
        }


        viewHolder.txtName.setText(dataModel.getName());
        viewHolder.txtType.setText(dataModel.getType());
        viewHolder.txtVersion.setText(dataModel.getVersion_number());
//        viewHolder.ratebar.setRating(dataModel.getRatingStar());
        //viewHolder.info.setOnClickListener(this);
        //viewHolder.info.setTag(position);
        return convertView;
    }
}