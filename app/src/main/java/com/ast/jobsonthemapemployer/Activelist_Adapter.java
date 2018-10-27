package com.ast.jobsonthemapemployer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by AST on 12/7/2017.
 */

public class Activelist_Adapter extends ArrayAdapter<Activelist_class> implements View.OnClickListener{

    private ArrayList<Activelist_class> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView txtName;
        TextView txtType;
        TextView txtVersion;
        ImageView info;
    }

    public Activelist_Adapter(ArrayList<Activelist_class> data, Context c) {
        super(c, R.layout.activelist_row,data);
        this.dataSet = data;
        this.mContext=c;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        Activelist_class dataModel=(Activelist_class)object;

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
        Activelist_class dataModel = getItem(position);
        //Check if an existing view is being reused, otherwise inflate the view
        Activelist_Adapter.ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new Activelist_Adapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.activelist_row, parent, false);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.name);
            viewHolder.txtType = (TextView) convertView.findViewById(R.id.type);
            viewHolder.txtVersion = (TextView) convertView.findViewById(R.id.version_number);
            viewHolder.info = (ImageView) convertView.findViewById(R.id.msg);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (Activelist_Adapter.ViewHolder) convertView.getTag();
            result=convertView;
        }


        viewHolder.txtName.setText(dataModel.getName());
        //viewHolder.txtType.setText(dataModel.getType());
        viewHolder.txtVersion.setText(dataModel.getVersion_number());
        //viewHolder.info.setOnClickListener(this);
        //viewHolder.info.setTag(position);
        return convertView;
    }

}
